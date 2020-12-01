import json
import urllib.request
import xml.etree.ElementTree as ET

url = 'http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108'

data = urllib.request.urlopen(url).read()

tree = ET.fromstring(data)
# print('Name:', tree.find('name').text) # text of the tag
# print('Attr:', tree.find('email').get('hide')) # attribute value of the tag

print(tree)
