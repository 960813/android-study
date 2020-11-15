##############
# 2week_1번
##############
list1 = [3, 5, 7]
list2 = [2, 3, 4, 5, 6]

for item1 in list1:
    for item2 in list2:
        print(item1, '*', item2, '=', item1 * item2)

##############
# 2week_2번
##############
a = [2, 3, 4, 5, 6]
rev_a = []
for _ in range(len(a)):
    rev_a.append(a.pop())
print('rev_a =', rev_a)

##############
# 2week_3번
##############
n_list = [10, 20, 30, 60, 50]
n_max = -1
for item in n_list:
    if item > n_max:
        n_max = item

print('리스트의 원소들 중 최대값 :', n_max)

##############
# 2week_4번
##############
greet = 'Have a beautiful day.'
print(greet[0:4])
print(greet[7:16])
print(greet[-4:-1])

##############
# 2week_5번
##############
animals = ['dog', 'cat', 'tiger', 'lion']
for animal in animals:
    print('I love %s.' % animal)
