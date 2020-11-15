import random


# 'A': 1, 'J': 11, 'Q': 12, 'K': 13 으로 변환
# 그 외엔 숫자로 변환
def encode_card_num(card_num):
    preset = {
        'A': 1,
        'J': 11,
        'Q': 12,
        'K': 13
    }

    if card_num in preset:
        return preset[card_num]
    else:
        return int(card_num)


# '♣': 1, '◆': 2, '♥': 3, '♠': 4 로 변환
def encode_card_shape(card_shape):
    return {
        '♣': 1,
        '◆': 2,
        '♥': 3,
        '♠': 4
    }[card_shape]


class CardDeck(object):
    """
    그림(4개)  : ♣ < ◆ < ♥ < ♠
    숫자(13개) : A < 2 < 3 < 4 < 5 < 6 < 7 < 8 < 9 < 10 < J < Q < K

    전체 52개: 그림(4) x 숫자(13)
    """

    def __init__(self):
        """
        [덱 전체 초기화]
        숫자가 들어있는 List와 문자가 들어 있는 List를 2중 for문으로 순회하며 초기화
        """
        self.deck = []
        numbers = ['A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K']
        shapes = ['♣', '◆', '♥', '♠']

        for s in shapes:
            for n in numbers:
                self.deck.append(n + s)

    def get_card(self):
        """
        임의의 카드(문자열)를 하나 반환
        덱에 카드가 없는 경우에는 `None`을 반환
        """
        if len(self.deck) < 1:
            return None
        card = random.choice(self.deck)
        self.deck.remove(card)
        return card

    def compare_cards(self, card1, card2, card3):
        """
        >> 다음 규칙에 따라 가장 약한 카드 반환(기존에는 가장 강한 카드를 반환했었음.)
        (1) 숫자: A < 2 < 3 < 4 < 5 < 6 < 7 < 8 < 9 < 10 < J < Q < K [만약 같으면 문자 비교]
        (2) ♣ < ◆ < ♥ < ♠
        ----
        [숫자와 문자 추출 방법]
        숫자: card[:-1] 슬라이싱 => 처음부터 가장 마지막 글자 앞까지(문자 제외)
        문자: card[-1:] 슬라이싱 => 가장 마지막 글자(문자)
        """

        cards = [card1, card2, card3]

        """
        람다 함수로 숫자만 필터링, encode_card_num을 이용해 'A': 1, 'J': 11, 'Q': 12, 'K': 13 으로 변환 
        아래 코드와 같은 작동
        card_nums = []
        for card in cards:
            card_nums.append(encode_card_num(card[:-1]))
        """
        card_nums = list(map(lambda card: encode_card_num(card[:-1]), cards))

        # 카드의 숫자 List에서 최소 값 탐색
        row_num = min(card_nums)

        """
        만약 최소 값과 같은 숫자가 중복되지 않는다면(최소 값에 대한 count가 1이라면)
        해당 숫자의 카드가 가장 약한 카드이므로 패배. => 해당 카드 반환 
        """
        if card_nums.count(row_num) == 1:
            return cards[card_nums.index(row_num)]
        else:
            # 만약 최소 값과 같은 숫자가 여러개라면 문자 비교 수행
            """
            람다 함수로 문자만 필터링
            1) 카드의 숫자가 최소 값과 같은 문자는 encode_card_shape 이용해 '♣': 1, '◆': 2, '♥': 3, '♠': 4 로 변환
            2) 카드의 숫자가 최소 값과 같지 않다면 5로 변환            
            아래 코드와 같은 작동
            card_shapes = []
            for card in cards:
                if encode_card_num(card[:-1]) == row_num:
                    card_shapes.append(encode_card_shape(card[-1:]))
                else:
                    card_shapes.append(5)
            """
            card_shapes = list(map(
                lambda card:
                encode_card_shape(card[-1:])
                if encode_card_num(card[:-1]) == row_num
                else 5,
                cards))

            # 카드의 문자 List에서 최소 값 탐색(1, 2, 3, 4, 5 중 하나 선택)
            # 5는 사실상 무시되는 케이스임.
            row_shape = min(card_shapes)

            # 카드의 숫자가 가장 작으며, 문자도 가장 약한 카드가 최종적으로 선택됨. => 반환(최종 패배 카드)
            return cards[card_shapes.index(row_shape)]
