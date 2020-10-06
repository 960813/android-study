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
