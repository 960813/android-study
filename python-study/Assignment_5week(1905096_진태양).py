##############
# 5week_1번
##############
class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age


my_dog = Dog('Mango', 3)
print('my_dog의 이름은 {}이고, 나이는 {}살입니다.'.format(my_dog.name, my_dog.age))


##############
# 5week_2번
##############
class Student:
    def __init__(self, name, student_id):
        self.name = name
        self.student_id = student_id
        self.python_quiz = []
        self.java_quiz = []
        self.db_quiz = []
        self.total_score = []

    def __str__(self):
        ret = ''
        ret += '이름 : {}, 학번 : {}\n'.format(self.get_name(), self.get_student_id())
        ret += '파이썬성적 : {}, 자바성적 : {}, 데이터베이스성적 : {}\n' \
            .format(self.get_python_quiz(), self.get_java_quiz(), self.get_db_quiz())
        ret += '합계 : {}, 평균 : {}'.format(self.get_total_score(), self.get_avg_score())
        return ret

    def get_name(self):
        return self.name

    def get_student_id(self):
        return self.student_id

    def get_python_quiz(self):
        return sum(self.python_quiz)

    def get_java_quiz(self):
        return sum(self.java_quiz)

    def get_db_quiz(self):
        return sum(self.db_quiz)

    def set_python_quiz(self, python_score):
        self.python_quiz.append(python_score)
        self.total_score.append(python_score)

    def set_java_quiz(self, java_score):
        self.java_quiz.append(java_score)
        self.total_score.append(java_score)

    def set_db_quiz(self, db_score):
        self.db_quiz.append(db_score)
        self.total_score.append(db_score)

    def get_total_score(self):
        return sum(self.total_score)

    def get_avg_score(self):
        return self.get_total_score() / len(self.total_score)


name = input('학생의 이름을 입력하세요 : ')
student_id = input('학생의 학번을 입력하세요 : ')
student = Student(name, student_id)
python_quiz = int(input('학생의 파이썬 성적을 입력하세요 : '))
java_quiz = int(input('학생의 자바 성적을 입력하세요 : '))
db_quiz = int(input('학생의 데이터베이스 성적을 입력하세요 : '))
student.set_python_quiz(python_quiz)
student.set_java_quiz(java_quiz)
student.set_db_quiz(db_quiz)
print(student)
