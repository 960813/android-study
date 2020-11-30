######
# code 01
######
import csv  # CSV 모듈 불러오기

f = open('seoul.csv', encoding='ISO-8859-1')  # seoul.csv 파일 읽기 모드로 불러오기

data = csv.reader(f)
header = next(data)  # 맨 윗줄을 header 변수에 저장하기

max_temp = -999  # 최고 기온을 저장할 변수 초기화
max_date = ''

min_temp = 999  # 최저 기온을 저장할 변수 초기화
min_date = ''

for row in data:
    if row[-1] == '':  # 만약 데이터가 누락되었다면 최고 기온을 -999로 저장
        row[-1] = -999

    if row[-2] == '':  # 만약 데이터가 누락되었다면 최저 기온을 999로 저장
        row[-2] = 999

    row[-1] = float(row[-1])  # 문자열로 저장된 최고 기온 값을 실수로
    row[-2] = float(row[-2])  # 문자열로 저장된 최저 기온 값을 실수로

    if max_temp < row[-1]:  # 만약 지금까지 최고 기온보다 더 높다면 업데이트
        max_date = row[0]
        max_temp = row[-1]

    if row[-2] < min_temp:  # 만약 지금까지 최저 기온보다 더 낮다면 업데이트
        min_date = row[0]
        min_temp = row[-2]

f.close()  # 파일 닫기
print('기상 관측 이래 서울의 최고 기온이 가장 높았던 날은', max_date + '로,', max_temp, '도 였습니다.')  # 출력
print('기상 관측 이래 서울의 최저 기온이 가장 낮았던 날은', min_date + '로,', min_temp, '도 였습니다.')  # 출력

######
# code 06
######
# 내 생일(8월 13일)의 기온 변화를 1996년 이후로 꺽은선(라인) 그래프로 그리기
import csv
import matplotlib.pyplot as plt

f = open('seoul.csv', encoding='ISO-8859-1')
data = csv.reader(f)
next(data)  # 첫줄 해드 스킵
high = []
low = []

# 생일 설정
birth_year = 1996
birth_month = str(8).rjust(2, '0')
birth_day = str(13)

for row in data:
    if row[4] != '' and row[3] != '':  # 최고기온과 최저기온이 존재하면
        date = row[0].split('-')
        if birth_year <= int(date[0]):  # 태어난 해 이후의 데이터만 다룬다.
            if date[1] == birth_month and date[2] == birth_day:  # 생일이라면
                high.append(float(row[4]))
                low.append(float(row[3]))

plt.rc('font', family='Malgun Gothic')  # 한글폰트 설정
# plt.rcParams['axes.unicode_minus'] = False   #마이너스 기호 깨짐
plt.title('내 생일의 기온 변화 그래프')
plt.plot(high, 'hotpink', label='high')  # high 리스트에 최고기온들을 표시
plt.plot(low, 'skyblue', label='low')  # low 리스트에 저장된 최저기온들을 표시

plt.legend()  # 범례표시 지시
plt.show()  # 그래프 출력

######
# code 08
######
# 1월과 8월의 최고기온을 히스토그램으로 표시하기
import csv
import matplotlib.pyplot as plt

f = open('seoul.csv', encoding='ISO-8859-1')
data = csv.reader(f)
next(data)

aug = []
jan = []

for row in data:
    month = row[0].split('-')[1]  # 날짜에서 월만 뽑아서
    if row[4] != '':
        if month == '08':
            aug.append(float(row[4]))
        if month == '01':
            jan.append(float(row[4]))
plt.hist(aug, bins=100, color='r', label='8월')
plt.hist(jan, bins=100, color='b', label='1월')
plt.legend()
plt.show()

######
# code 11
######
# 월별로 최고기온을 boxplot 으로 표시하기
import csv
import matplotlib.pyplot as plt

f = open('seoul.csv', encoding='ISO-8859-1')
data = csv.reader(f)
next(data)

# 월별 최고기온을 저장할 리스트 month를 12개 생성
month = [[], [], [], [], [], [], [], [], [], [], [], []]

# 더 좋은 방법
# month = []
# for i in range(12) :   #month 리스트 내에 12개의 리스트 생성
#     month.append([])


for row in data:
    if row[4] != '':
        # 월과 같은 숫자 - 1 위치의 리스트(1월이면 month[0])에 최고기온 저장
        month[int(row[0].split('-')[1]) - 1].append(float(row[4]))

plt.boxplot(month)
plt.show()

######
# code 12
######
# 8월 일별 최고기온을 boxplot 으로 표시하기
import csv
import matplotlib.pyplot as plt

f = open('seoul.csv', encoding='ISO-8859-1')
data = csv.reader(f)
next(data)

day = []
for i in range(31):  # day 리스트 내에 31개의 리스트 생성
    day.append([])

for row in data:
    if row[4] != '':
        if row[0].split('-')[1] == '08':  # 8월 이면
            day[int(row[0].split('-')[2]) - 1].append(float(row[4]))

plt.style.use('ggplot')  # 그래프 스타일을 ggplot이라는 스타일로 수정(배경-회색격자무늬, 2/4값을 의미하는 색을 변경)
plt.figure(figsize=(10, 5), dpi=300)  # 그래프 크기((가로,세로) 인치 단위) 수정
plt.boxplot(day, showfliers=False)  # 이상치 값이 보이지 않게 설정
plt.show()

##
test = list(map(lambda x: [], range(2)))
print(test)


######
# 기상청 날씨누리
######
