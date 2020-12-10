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

void print_list(DataNodeType* head)
{
    for (DataNodeType* p = head; p != NULL; p = p->link) {
        printf("%d->", p->data);
    }
    printf("NULL\n");
}

DataNodeType* search_list(DataNodeType* head, element x)
{
    DataNodeType* p = head;
    while (p != NULL) {
        if (p->data == x)
            return p;
        p = p->link;
    }
    return NULL;
}

int main(void)
{
    DataNodeType* head = NULL;

    head = insert_first(head, 10);
    print_list(head);

    head = insert_first(head, 20);
    print_list(head);

    head = insert_first(head, 30);
    print_list(head);

    if (search_list(head, 30) != NULL) {
        printf("리스트에서 30을 찾았습니다. \n");
    } else {
        printf("리스트에서 30을 찾지 못했습니다. \n");
    }

    return 0;
}