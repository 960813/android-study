from collections import Counter


def find_related_groceries(grocery):
    f = open('Assignment_text.txt', 'r')
    all_food_list = {}
    for line in f:
        year_month = line.split(',')[0]
        if all_food_list.get(year_month) is None:
            all_food_list[year_month] = []

        groceries = [v for v in line.split(",")[1:-1] if v]

        for grocery_item in groceries:
            all_food_list[year_month].append(grocery_item)

    flag = False
    for year_month in all_food_list:
        cnt = Counter(all_food_list[year_month])
        mc = cnt.most_common(n=3)

        all_food_list[year_month] = {}

        for item in mc:
            all_food_list[year_month][item[0]] = item[1]
            if item[0] == grocery:
                flag = True

    f.close()
    if flag:
        return all_food_list
    else:
        return None


print(find_related_groceries('whole milk'))
print(find_related_groceries('rolls/buns'))
print(find_related_groceries('other vegetables'))
print(find_related_groceries('aaaaaaaaaaaa'))
