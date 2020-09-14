cinema = {
    "뉴 뮤턴트": 8.17,
    "테스와 보낸 여름": 9.33,
    "나를 구하지 마세요": 9.00,
    "극장판 짱구는 못말려: 신혼여행 허리케인~ 사라진 아빠!": 9.17,
    "테넷": 8.79,
    "에이바": 8.31
}


def filter_by_rating(x):
    print(f'==평점 {x} 이상 영화==')
    for title, rate in cinema.items():
        if rate >= x:
            print(f'({rate}){title}')


filter_by_rating(8.31)
