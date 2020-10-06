##
# 셀프 체크 32.1
##
class Stack(object):
    def __init__(self):
        self.stack = []

    def get_stack_elements(self):
        return self.stack.copy()

    def add_one(self, item):
        self.stack.append(item)

    def add_many(self, item, n):
        for i in range(n):
            self.stack.append(item)

    def remove_one(self):
        self.stack.pop()

    def remove_many(self, n):
        for i in range(n):
            self.stack.pop()

    def size(self):
        return len(self.stack)

    def prettyprint(self):
        for thing in self.stack[::-1]:
            print('|_', thing, '_|')

    def add_list(self, lst):
        for item in lst:
            self.stack.append(item)


stack = Stack()
lst = [1, 4, 7, 9]
stack.add_list(lst)
stack.prettyprint()


##
# 셀프 체크 32.2
##
class Stack(object):
    def __init__(self):
        self.stack = []

    def get_stack_elements(self):
        return self.stack.copy()

    def add_one(self, item):
        self.stack.append(item)

    def add_many(self, item, n):
        for i in range(n):
            self.stack.append(item)

    def remove_one(self):
        self.stack.pop()

    def remove_many(self, n):
        for i in range(n):
            self.stack.pop()

    def size(self):
        return len(self.stack)

    def prettyprint(self):
        for thing in self.stack[::-1]:
            print('|_', thing, '_|')


class Circle(object):
    def __init__(self):
        self.radius = 0

    def change_radius(self, radius):
        self.radius = radius

    def get_radius(self):
        return self.radius


class Rectangle(object):
    """ length(길이)와 width(너비)를 가지는 직사각형 객체 """

    def __init__(self, length, width):
        self.length = length
        self.width = width

    def set_length(self, length):
        self.length = length

    def set_width(self, width):
        self.width = width


stackCircle = Stack()
for _ in range(3):
    circle = Circle()
    circle.change_radius(3)
    stackCircle.add_one(circle)

stackRectangle = Stack()
rectangle = Rectangle(1, 1)
stackRectangle.add_many(rectangle, 5)

stackCircle.prettyprint()
stackRectangle.prettyprint()


##
# 셀프체크 33.1
##
class Fraction(object):
    def __init__(self, top, bottom):
        self.top = top
        self.bottom = bottom

    def __sub__(self, other):
        newtop = self.top * other.bottom - other.top * self.bottom
        newbottom = self.bottom * other.bottom
        return Fraction(newtop, newbottom)

    def __str__(self):  # A
        return str(self.top) + "/" + str(self.bottom)  # B


f1 = Fraction(1, 4)
f2 = Fraction(1, 8)
print(f1 - f2)


##
# 셀프체크 33.2
##
class Fraction(object):
    def __init__(self, top, bottom):
        self.top = top
        self.bottom = bottom

    def __str__(self):  # A
        return str(self.top) + "\n--\n" + str(self.bottom)  # B


f1 = Fraction(1, 4)
print(f1)

##
# 5주차 4차시 진도(학습) - 1
##
'''
1. 다음과 같은 기능을 가지는 Counter 클래스를 정의하고 인스턴스를 구현하자

- 이 클래스는 __number라는 속성 값을 가짐
- number를 매개 변수로 가지는 __init(self, number) 메소드를 가짐.
- number의 디폴트 매개변수 값은 0
- number가 100이상 되거나 -1 이하가 되면 0값을 초기 값으로 가짐
- number를 0으로 초기화 하는 reset() 메소드를 가짐
- __number를 1증가 시키는 inc() 메소드를 가짐, __number가 100 이상이 되면 0으로 초기화
- __number를 1감소 시키는 dec() 메소드를 가짐, __number가 -1 이하가 되면 0 값을 가짐
- C(n)과 같이 n을 출력하는 __str__() 특수 메소드를 가짐.

이 인스턴스를 사용하는 다음 코드를 작성하고 그 결과를 분석해보자.

c1 = Counter(10)
c1.inc()
print('c1 =', c1)
c2 = Counter()
c2.inc()
c2.inc()
c2.dec()
print('c2 =', c2)
c2.reset()
print('c2 =', c2)
'''


class Counter:
    def __init__(self, number=0):
        self.number = number

    def reset(self):
        self.number = 0

    def inc(self):
        self.number = self.number + 1
        if self.number >= 100:
            self.number = 0

    def dec(self):
        self.number = self.number - 1
        if self.number <= -1:
            self.number = 0

    def __str__(self):
        return 'C({})'.format(self.number)


c1 = Counter(10)
c1.inc()
print('c1 =', c1)
c2 = Counter()
c2.inc()
c2.inc()
c2.dec()
print('c2 =', c2)
c2.reset()
print('c2 =', c2)

##
# 5주차 4차시 진도(학습) - 2
##
'''
2. 다음과 같은 기능을 가지는 클래스 BankAccount 클래스를 구현하라. 그리고 이 클래스를 이용하여 인스턴스를 생성하라.
이 클래스는 아래와 같은 속성과 동작을 가진다.

속성
이름(name)
계좌번호(account_num)
잔액(balance)

메서드
예금 기능: deposit(money) - money 만큼의 돈을 balance에 추가한다.
출금 기능: withdraw(money) - money 만큼의 돈이 balance에서 빠져나간다.(balance가 money보다 작으면 출금이 되지 않는다)

account1 = BankAccount("홍길동", "1234-0001")
print(account1)
account1.deposit(2000)
print(account1)
account1.withdraw(500)
print(account1)
account1.withdraw(5000)

실행 결과
홍길동님의 계좌 1234-0001의 잔고는 0원입니다.
2000원이 입금되었습니다. 잔고는 2000입니다.
홍길동님의 계좌 1234-0001의 잔고는 2000원입니다.
홍길동님의 계좌 1234-0001의 잔고는 1500원입니다.
계좌 잔고는 1500원으로 인출 요구 금액 5000원보다 작습니다.
'''


class BankAccount:
    def __init__(self, name, account_num, balance=0):
        self.name = name
        self.account_num = account_num
        self.balance = balance

    def deposit(self, money):
        self.balance += money
        print('{}원이 입금되었습니다. 잔고는 {}입니다.'.format(money, self.balance))
        return self.balance

    def withdraw(self, money):
        if self.balance - money < 0:
            print('계좌 잔고는 {}원으로 인출 요구 금액 {}원보다 작습니다.'.format(self.balance, money))
        else:
            self.balance -= money

    def __str__(self):
        return '{}님의 계좌 {}의 잔고는 {}원입니다.'.format(self.name, self.account_num, self.balance)


account1 = BankAccount("홍길동", "1234-0001")
print(account1)
account1.deposit(2000)
print(account1)
account1.withdraw(500)
print(account1)
account1.withdraw(5000)
