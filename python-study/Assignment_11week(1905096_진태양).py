import urllib.request

from bs4 import BeautifulSoup

# 학과 홈페이지 공지사항 페이지 request 수행
url = 'http://computer.ync.ac.kr/computer/CMS/Board/Board.do?mCode=MN045'
html = urllib.request.urlopen(url).read()
soup = BeautifulSoup(html, 'html.parser')

# 결과 출력을 위한 url_prefix 사전 정의
url_prefix = 'http://computer.ync.ac.kr/computer/CMS/Board/Board.do'

# Class 명으로 Element를 가져온다. select method는 css selector 혹은 XPath로 Element에 접근 할 수 있게 해준다.
titles = soup.select('.board-list-table > tbody > tr > td.subject > p.stitle > a')

print('==========================================================')
print('[영남이공대학교 컴퓨터정보과·소프트웨어콘텐츠계열 최신 공지사항 10건]')
print('==========================================================')

# titles 배열을 enumerate 객체로 변환하고 이를 순환하며 내용 출력 수행
for idx, title in enumerate(titles):
    subject = title.get_text().strip()
    link = url_prefix + title.get('href', None)
    res = '[%s] %s => %s' % ((idx + 1), subject, link)
    print(res)

