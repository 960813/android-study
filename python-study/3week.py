##
# P.347 변경 불가능한 객체
##
a = 1
print(id(a))

b = a
print(id(b))

a = 2
print(a)
print(b)

print(id(a))
print(id(b))

##
# P.348 변경 가능한 객체
##
genius = ['아인슈타인', '갈릴레이']
print(id(genius))

smart = genius
print(id(smart))

genius.append('셰익스피어')
print(genius)
print(id(genius))

print(smart)
print(id(smart))

##
# 셀프 체크 28.1
##
'''
파이썬은 크기가 작은 객체들을 인터닝(interning)하기 때문에, x,y,z,a 변수의 id가 같다.
'''
x = "me"
print(id(x))
y = x
print(id(y))
z = y
print(id(z))
a = "me"
print(id(a))

##
# 셀프 체크 28.2
##
'''
리스트는 Interning하지 않는다.
'''
x = ['me', 'I']
print(id(x))
y = x
print(id(y))
z = y
print(id(z))
a = ['me', 'I']
print(id(a))

##
# 셀프 체크 28.3
##
x = ['me', 'I']
y = x
x.append('myself')
print(x)

y.pop()
print(x)

y.append('myself')
print(x)

y.sort()
print(x)

y = [x, x]
y.append(x)
print(x)
print(y)

##
# P.353 리스트 원소를 정렬한 복사본 만들기
##
kid_ages = [2, 1, 4]
# kid_ages.sort()
sorted_ages = sorted(kid_ages)
print(kid_ages)
print(sorted_ages)

##
# 셀프 체크 28.4
##
# order = sorted(chaos)
# colors.sort()
# cards = deck.sort()
