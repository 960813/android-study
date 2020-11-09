def invert_dict(org_dict):
    ret_dict = {}

    for key, value in org_dict.items():
        ret_dict[value] = key

    return ret_dict


input_dict = {
    '1': 'a',
    '2': 'b',
    '3': 'c'
}

print(invert_dict(input_dict))
