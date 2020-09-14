def invert(d):
    d_inv = {}
    for key, item in d.items():
        if item not in d_inv:
            d_inv[item] = []
        d_inv[item].append(key)
    return d_inv


print(
    invert({
        1: 2,
        3: 4,
        5: 6
    })
)

print(
    invert({
        1: 2,
        2: 1,
        3: 3
    })
)

print(
    invert({
        1: 1,
        3: 1,
        5: 1
    })
)
