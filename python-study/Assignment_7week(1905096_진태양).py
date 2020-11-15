##############
# 1905096(진태양)
##############

##############
# 7week_1번
##############
import random

lst = list(map(lambda _: random.randrange(5, 101, 5), range(3)))
print(lst)

##############
# 7week_2번
##############
import time


def sumto_1(start=1, end=1000000):
    return end * (start + end) // 2


def sumto_2(start=1, end=1000000):
    total = 0
    for n in range(start, end + 1):
        total += n
    return total


start_time = time.perf_counter()
print("sumto_1 :", sumto_1())
print("sumto_1로 1에서 백만까지의 합을 구하는 시간 :", time.perf_counter() - start_time, "초")

print()

start_time = time.perf_counter()
print("sumto_2 :", sumto_2())
print("sumto_2로 1에서 백만까지의 합을 구하는 시간 :", time.perf_counter() - start_time, "초")
