class Player(object):
    """" 플레이어 """

    def __init__(self, name):
        """ 이름을 설정하고, 손에는 아무 카드도 가지고 있지 않는다 """
        self.hand = []
        self.name = name

    def __str__(self):
        # return ', '.join(self.hand)
        """
        현재 카드 목록을 출력하기 위해(91line ~ 93line at app.py) __str__ 메소드를 오버라이딩
        1) 원래는 파이썬 내장 함수인 join 함수를 사용했지만 카드의 문자 길이가 달라서 출력이 예쁘지 않음.
            (아래와 같은 출력)
            7◆, 5◆
            10♠, 10♥
        2) 이에 출력 형식을 3자리로 지정해주기 위해 파이썬 내장 함수인 join 함수를 따로 구현.
            (최종 출력 결과)
             7◆,  5◆
            10♠, 10♥
        """
        it = map(str, self.hand)
        sp = ','
        string = '%3s' % next(it, '')
        for s in it:
            string += sp + '%3s' % s
        return string

    def get_name(self):
        """ 플레이어 이름을 반환한다 """
        return self.name

    def add_card_to_hand(self, card):
        """ card, 문자열
            플레이어의 손에 정상적인 카드를 추가한다 """
        if card is not None:
            self.hand.append(card)

    def remove_card_from_hand(self, card):
        """ card, 문자열
            플레이어의 손에서 카드를 제거한다 """
        self.hand.remove(card)

    def hand_size(self):
        """ 플레이어의 손에 있는 카드 개수를 반환한다 """
        return len(self.hand)
