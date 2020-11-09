def replace(d, v, e):
    for key, value in d.items():
        if value == v:
            d[key] = e


dic = {
    1: 2,
    3: 4,
    4: 2
}
replace(dic, 2, 7)
print(dic)

dic = {
    1: 2,
    3: 1,
    4: 2
}
replace(dic, 1, 2)
print(dic)
