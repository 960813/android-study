import json
import urllib.request
import datetime

service_key = '46dbccf8d09422e627d226ff3d55eed0'
target = (datetime.date.today() - datetime.timedelta(days=1)).strftime('%Y%m%d')
url = 'http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/' \
      'searchDailyBoxOfficeList.json?key=%s&targetDt=%s' % (service_key, target)

data = urllib.request.urlopen(url).read()

info = json.loads(data)

daily_list = info['boxOfficeResult']['dailyBoxOfficeList']

print('=========================================')
print('일벽 박스오피스 랭킹 - %s' % info['boxOfficeResult']['showRange'])
print('=========================================')
for item in daily_list:
    print('[%2s위] %s' % (item['rank'], item['movieNm']))
