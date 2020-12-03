#include <stdio.h>
#include <stdlib.h>

typedef int element;
typedef struct ListNode {
    element data;
    struct ListNode* link;
} ListNode;

void error(char* message)
{
    fprintf(stderr, "%s\n", message);
    exit(1);
}

ListNode* insert_first(ListNode* head, element value)
{
    ListNode* p = (ListNode*)malloc(sizeof(ListNode));
    p->data = value;
    p->link = head;

    head = p;
    return head;
}

ListNode* insert(ListNode* head, ListNode* pre, element value)
{
    ListNode* p = (ListNode*)malloc(sizeof(ListNode));
    p->data = value;
    p->link = pre->link;
    pre->link = p;
    return head;
}

ListNode* delete_first(ListNode* head)
{
    ListNode* removed;
    if (head == NULL)
        return NULL;

    removed = head;
    head = removed->link;
    free(removed);
    return head;
}

ListNode* delete (ListNode* head, ListNode* pre)
{
    ListNode* removed;
    removed = pre->link;
    pre->link = removed->link;
    free(removed);
    return head;
}

void print_list(ListNode* head)
{
    for (ListNode* p = head; p != NULL; p = p->link) {
        printf("%d->", p->data);
    }
    printf("NULL\n");
}

int main(void)
{
    ListNode* head = NULL;

    for (int i = 0; i < 5; i++) {
        head = insert_first(head, i);
        print_list(head);
    }

    // for (int i = 0; i < 5; i++) {
    //     head = delete_first(head);
    //     print_list(head);
    // }

    // 13주차 과제

    // 신규 데이터 삽입 with insert()
    int insert_pos = -1;
    element insert_value = -1;

    printf("신규 추가할 위치가 몇번째 인가요?(0부터 시작) ");
    scanf("%d", &insert_pos);

    printf("신규 추가할 데이터는 무엇인가요?(정수)");
    scanf("%d", &insert_value);

    ListNode* pre = head;
    for (int i = 0; i < insert_pos - 1; i++) {
        pre = pre->link;
    }
    head = insert(head, pre, insert_value);
    print_list(head);

    // 기존 데이터 삭제 with delete()
    int delete_pos = -1;

    printf("몇번째 데이터를 삭제하시겠습니까?(0부터 시작) ");
    scanf("%d", &delete_pos);

    pre = head;
    for (int i = 0; i < delete_pos - 1; i++) {
        pre = pre->link;
    }
    head = delete (head, pre);

    print_list(head);

    return 0;
}