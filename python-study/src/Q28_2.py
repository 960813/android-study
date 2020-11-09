def invert_dict_inplace(org_dict):
    for key, value in org_dict.copy().items():
        org_dict[value] = key
        org_dict.pop(key)


input_dict = {
    '1': 'a',
    '2': 'b',
    '3': 'c'
}

print(input_dict)
invert_dict_inplace(input_dict)
print(input_dict)
