from collections import Counter

f = open('Assignment_text.txt', 'r')

top_5 = {}
for line in f:
    if line.find("coffee") > 0:
        bag_list = [v for v in line.split(",")[1:-1] if v and v != 'coffee']

        for item in bag_list:
            if top_5.get(item) is None:
                top_5[item] = 1
            else:
                top_5[item] += 1

cnt = Counter(top_5)
print(cnt.most_common(n=5))

f.close()
