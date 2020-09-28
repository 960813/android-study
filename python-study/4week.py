class Circle(object):  # 클래스 생성 선언문
    def __init__(self):
        self.radius = 0  # 프로퍼티

    def change_radius(self, radius):
        self.radius = radius

    def get_radius(self):
        return self.radius


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
