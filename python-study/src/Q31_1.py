class Circle(object):
    def __init__(self):
        self.radius = 0

    def change_radius(self, radius):
        self.radius = radius

    def get_radius(self):
        return self.radius

    def get_area(self):
        return self.radius ** 2 * 3.14


circle = Circle()
circle.change_radius(10)
print(circle.get_area())
