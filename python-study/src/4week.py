##
# 4주차 진도
##
class Circle(object):  # 클래스 생성 선언문
    def __init__(self):
        self.radius = 0  # 프로퍼티

    def change_radius(self, radius):
        self.radius = radius

    def get_radius(self):
        return self.radius


one_circle = Circle()
another_circle = Circle()

one_circle.change_radius(4)
print(one_circle.get_radius())


##
# 셀프 체크 31.1 / 셀프 체크 31.2
##
class Person(object):
    def __init__(self):
        self.name = ''
        self.height = 0


class Car(object):
    def __init__(self):
        self.name = ''
        self.price = 0


class Computer(object):
    def __init__(self):
        self.on = False
        self.type = ''


##
# 셀프 체크 31.3
##
class Door(object):
    def __init__(self):
        self.width = 1
        self.height = 1
        self.open = False

    def get_door(self):
        return self.open

    def get_area(self):
        return self.width * self.height


##
# 셀프 체크 31.4
##
class Door(object):
    def __init__(self):
        self.width = 1
        self.height = 1
        self.open = False

    def change_state(self):
        self.open = not self.open

    def scale(self, factor):
        self.height *= factor
        self.height *= factor

    # 셀프 체크 외 추가 메서드
    def get_size(self):
        return self.width * self.height


square_door = Door()
square_door.change_state()
square_door.scale(3)
print(square_door.get_size())
