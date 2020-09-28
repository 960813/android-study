class Queue(object):
    def __init__(self):
        self.queue = []

    def get_queue_elements(self):
        return self.queue.copy()

    def add_one(self, item):
        self.queue.append(item)

    def add_many(self, item, n):
        for i in range(n):
            self.queue.append(item)

    def remove_one(self):
        self.queue.pop(0)

    def remove_many(self, n):
        for i in range(n):
            self.queue.pop(0)

    def size(self):
        return len(self.queue)

    def prettyprint(self):
        for item in self.queue:
            print('[__', item, '__]')


queue = Queue()
queue.add_many(3, 4)
queue.add_one(1)
queue.add_one(2)
queue.remove_one()
queue.remove_many(2)
print(queue.size())
print(queue.get_queue_elements())
queue.prettyprint()
