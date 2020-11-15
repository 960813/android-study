#########
# 과제 1번
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
# 과제 2번
########
from tkinter import *

window = Tk()
window.title("계산기")
window.geometry('350x200')

Label(window, text="숫자 1").grid(column=0, row=0)
Label(window, text="숫자 2").grid(column=0, row=1)
res_label = Label(window, text="결과 :")
res_label.grid(column=0, row=2)

num1 = Entry(window, width=10)
num2 = Entry(window, width=10)
num1.grid(column=1, row=0)
num2.grid(column=1, row=1)


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


btn_plus = Button(window, text="+", command=add)
btn_minus = Button(window, text="-", command=subtract)
btn_mult = Button(window, text="*", command=multiplication)
btn_div = Button(window, text="/", command=division)

btn_plus.grid(column=4, row=1)
btn_minus.grid(column=5, row=1)
btn_mult.grid(column=6, row=1)
btn_div.grid(column=7, row=1)

window.mainloop()
