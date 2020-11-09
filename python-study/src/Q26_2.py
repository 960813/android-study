def is_permutation(L1, L2):
    L1.sort()
    L2.sort()

    # == 연산자로 List의 동등성을 비교할 수 있음.
    return L1 == L2


list1 = [1, 2, 3]
list2 = [3, 1, 2]
print(is_permutation(list1, list2))

list1 = [1, 1, 1, 2]
list2 = [1, 2, 1, 1]
print(is_permutation(list1, list2))

list1 = [1, 2, 3, 1]
list2 = [1, 2, 3]
print(is_permutation(list1, list2))
