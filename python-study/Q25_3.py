def uniqe(L):
    uniqe_res = []
    for item in L:
        if item not in uniqe_res:
            uniqe_res.append(item)

    return uniqe_res


def common(L1, L2):
    uniqe_l1 = uniqe(L1)
    uniqe_l2 = uniqe(L2)
    len_l1 = len(uniqe_l1)
    len_l2 = len(uniqe_l2)

    if len_l1 != len_l2:
        return False

    if len_l1 < len_l2:
        uniqe_l1, uniqe_l2 = uniqe_l2, uniqe_l1

    for item_l1 in uniqe_l1:
        if item_l1 not in uniqe_l2:
            return False

    return True


lst1 = [1, 2, 3]
lst2 = [3, 1, 2]
print(common(lst1, lst2))

lst1 = [1, 1, 1]
lst2 = [1]
print(common(lst1, lst2))

lst1 = [1]
lst2 = [1, 2]
print(common(lst1, lst2))
