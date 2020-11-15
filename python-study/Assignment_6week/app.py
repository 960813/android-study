from domain.Player import Player
from domain.CardDeck import CardDeck

name1 = input("이름을 입력해 주세요. 플레이어 1: ")
player1 = Player(name1)

name2 = input("이름을 입력해 주세요. 플레이어 2: ")
player2 = Player(name2)

name3 = input("이름을 입력해 주세요. 플레이어 3: ")
player3 = Player(name3)

deck = CardDeck()

while True:
    # 3명의 플레이어에게 카드 나눠주기
    player1_card = deck.get_card()
    player2_card = deck.get_card()
    player3_card = deck.get_card()

    player1.add_card_to_hand(player1_card)
    player2.add_card_to_hand(player2_card)
    player3.add_card_to_hand(player3_card)

    """
    1. 기존에 사용된 == 연산자를 is 연산자로 변환
    2. 3명의 플레이어 중 카드를 못받은 사람이 있다면 덱이 모두 소진된 것이기에 게임 종료
       => 플레이어1이 마지막 턴에 카드를 무조건 한장 더 받는다.
    """
    if player1_card is None or player2_card is None or player3_card is None:
        print('...')
        print("게임 오버. 덱에 카드가 없습니다.")
        print('===============================')
        print('<최종 카드>')
        print(name1, '({:<2}개)'.format(player1.hand_size()), ':', player1)
        print(name2, '({:<2}개)'.format(player2.hand_size()), ':', player2)
        print(name3, '({:<2}개)'.format(player3.hand_size()), ':', player3)
        print()
        print("승자는?")
        if player1.hand_size() == player2.hand_size() == player3.hand_size():
            print("비겼습니다!")
        else:
            player_hands = [player1.hand_size(), player2.hand_size(), player3.hand_size()]
            winner = min(player_hands)
            if winner == player1.hand_size():
                print(name1, "승리!")
            elif winner == player2.hand_size():
                print(name2, "승리!")
            else:
                print(name3, "승리!")
        print('===============================')
        break
    else:
        print('===============================')

        # compare_cards 메소드는 세개의 카드 중 가장 약한 카드 반환(즉, 패배한 카드 반환)
        lose_card = deck.compare_cards(player1_card, player2_card, player3_card)

        # player1 패배 => player2와 player3의 카드를 player1에게 추가
        if lose_card == player1_card:
            print(name1, "(패배):", player1_card)
            print(name2, "(승리):", player2_card)
            print(name3, "(승리):", player3_card)
            player2.remove_card_from_hand(player2_card)
            player3.remove_card_from_hand(player3_card)
            player1.add_card_to_hand(player2_card)
            player1.add_card_to_hand(player3_card)

        # player2 패배 => player1과 player3의 카드를 player2에게 추가
        elif lose_card == player2_card:
            print(name1, "(승리):", player1_card)
            print(name2, "(패배):", player2_card)
            print(name3, "(승리):", player3_card)
            player1.remove_card_from_hand(player1_card)
            player3.remove_card_from_hand(player3_card)
            player2.add_card_to_hand(player1_card)
            player2.add_card_to_hand(player3_card)

        # player3 패배 => player1과 player2의 카드를 player3에게 추가
        else:
            print(name1, "(승리):", player1_card)
            print(name2, "(승리):", player2_card)
            print(name3, "(패배):", player3_card)
            player1.remove_card_from_hand(player1_card)
            player2.remove_card_from_hand(player2_card)
            player3.add_card_to_hand(player1_card)
            player3.add_card_to_hand(player2_card)

        print('...')
        print('<현재 보유 카드>')
        print(name1, '({:<2}개)'.format(player1.hand_size()), ':', player1)
        print(name2, '({:<2}개)'.format(player2.hand_size()), ':', player2)
        print(name3, '({:<2}개)'.format(player3.hand_size()), ':', player3)
        print()
