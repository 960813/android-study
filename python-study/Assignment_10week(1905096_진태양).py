#########
# 10week_1번
########
from tkinter import *

window = Tk()
window.title("tk")
window.geometry('360x100')

Label(window, text='몸무게(kg)과 키(cm)을 차례로 입력하세요.').pack()
weight = Entry(window, width=50)
height = Entry(window, width=50)

weight.pack()
height.pack()

result_var = StringVar()


def calc():
    result_var.set("당신의 체질량 지수(BMI)는: %.2f" % (float(weight.get()) / ((float(height.get()) / 100) ** 2)))


Button(window, text="BMI 계산하기", command=calc).pack()
Label(window, textvariable=result_var).pack()

window.mainloop()

#########
# 10week_2번
########

# tkinter를 Program에 포함 시킨다.
from tkinter import *

'''
Tk() 메소드를 이용해 tkinter의 객체를 생성하고, 그 이름을 window로 한다.
window의 제목은 계산기, 너비 = 350px, 높이 = 200px이다. 
'''
window = Tk()
window.title("계산기")
window.geometry('350x200')

'''
숫자 1, 숫자2를 표시해주는 Label 객체를 생성하고 위치를 지정해준다.
[숫자 1 Label의 위치] : column=0, row=0 
■□□□□□
□□□□□□
□□□□□□

[숫자 2 Label의 위치] : column=0, row=1
□□□□□□
■□□□□□
□□□□□□

결과를 표시해주는 Label은 값 변경을 위해 별도로 변수로 지정해준다.
[결과 Label의 위치] : column=0, row=2
□□□□□□
□□□□□□
■□□□□□
'''
Label(window, text="숫자 1").grid(column=0, row=0)
Label(window, text="숫자 2").grid(column=0, row=1)
res_label = Label(window, text="결과 :")
res_label.grid(column=0, row=2)

num1 = Entry(window, width=10)
num2 = Entry(window, width=10)
num1.grid(column=1, row=0)
num2.grid(column=1, row=1)

'''
각 연산(+, -, *, /)을 위한 함수를 사전 정의해준다.
각 함수는 res_text 변수에 연산 결과를 임시 저장하고, res_label에 설정해주고 있다.
'''
def add():
    res_text = "결과 = " + str(float(num1.get()) + float(num2.get()))
    res_label.configure(text=res_text)


def subtract():
    res_text = "결과 = " + str(float(num1.get()) - float(num2.get()))
    res_label.configure(text=res_text)


def multiplication():
    res_text = "결과 = " + str(float(num1.get()) * float(num2.get()))
    res_label.configure(text=res_text)


def division():
    res_text = "결과 = " + str(float(num1.get()) / float(num2.get()))
    res_label.configure(text=res_text)


'''
각 연산을 수행하는 Button 객체를 생성하고, 그 위치를 지정해준다.
이 코드에서는 column을 4,5,6,7로 해주고 있지만 2,3,4,5로 해도 동일한 위치에 배치 된다.
[각 Button의 위치] : column=(4~7), row=1
□□□□□□
□□■■■■
□□□□□□
'''
btn_plus = Button(window, text="+", command=add)
btn_minus = Button(window, text="-", command=subtract)
btn_mult = Button(window, text="*", command=multiplication)
btn_div = Button(window, text="/", command=division)

btn_plus.grid(column=4, row=1)
btn_minus.grid(column=5, row=1)
btn_mult.grid(column=6, row=1)
btn_div.grid(column=7, row=1)

'''
Tk 객체의 mainloop 메소드를 호출한다.
이에 Tk는 loop를 순회하며 이벤트를 입력 받고 그에 대응되는 연산을 처리하게 된다.
'''
window.mainloop()
