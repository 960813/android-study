#include <stdio.h>
#include <stdlib.h>

typedef int element;
typedef struct DataNodeType {
    element data;
    struct DataNodeType* link;
} DataNodeType;

void error(char* message)
{
    fprintf(stderr, "%s\n", message);
    exit(1);
}

DataNodeType* insert_first(DataNodeType* head, element value)
{
    DataNodeType* p = (DataNodeType*)malloc(sizeof(DataNodeType));
    p->data = value;
    p->link = head;
    head = p;
    return head;
}

DataNodeType* insert(DataNodeType* head, DataNodeType* pre, element value)
{
    DataNodeType* p = (DataNodeType*)malloc(sizeof(DataNodeType));
    p->data = value;
    p->link = pre->link;
    pre->link = p;
    return head;
}

DataNodeType* delete_first(DataNodeType* head)
{
    DataNodeType* removed;
    if (head == NULL)
        return NULL;

    removed = head;
    head = removed->link;
    free(removed);
    return head;
}

DataNodeType* delete (DataNodeType* head, DataNodeType* pre)
{
    DataNodeType* removed;
    removed = pre->link;
    pre->link = removed->link;
    free(removed);
    return head;
}

void print_list(DataNodeType* head)
{
    for (DataNodeType* p = head; p != NULL; p = p->link) {
        printf("%d->", p->data);
    }
    printf("NULL\n");
}

int main(void)
{
    DataNodeType* head = NULL;

    for (int i = 0; i < 5; i++) {
        head = insert_first(head, i);
        print_list(head);
    }

    for (int i = 0; i < 5; i++) {
        head = delete_first(head);
        print_list(head);
    }

    return 0;
}