##############
# 3week_1번
##############
# (1)
person = {
    '이름': '홍길동',
    '나이': 26,
    '키': 179,
    '특기': '분신술'
}

# (2)
person['아버지'] = '홍판서'
print(person)

# (3)
person.pop('나이')
print(person)

##############
# 3week_2번
##############
# (1)
fruits_dic = {
    'apple': 6000,
    'melon': 3000,
    'banana': 5000,
    'orange': 4000
}
print(fruits_dic.keys())

# (2)
print(fruits_dic.values())

# (3)
print('fruits_dic 딕셔너리의 행목의 개수 :', len(fruits_dic))


# (4)
def include_key(source, key):
    if key in source:
        print(key + '-fruits_dic에 있습니다.')
    else:
        print(key + '-fruits_dic에 없습니다.')


include_key(fruits_dic, 'apple')
include_key(fruits_dic, 'mango')
