#include <stdio.h>
#include <stdlib.h>

typedef int element;
typedef struct DataNodeType {
    element dataBox;
    struct DataNodeType* linkBox;
} DataNodeType;

void print_list(DataNodeType* head)
{
    DataNodeType* p;
    if (head == NULL)
        return;
    // p = head->linkBox;
    p = head;
    do {
        printf("%d->", p->dataBox);
        p = p->linkBox;
    } while (p != head);
    // printf("%d->", p->dataBox);
}

DataNodeType* Finding_LastNode(DataNodeType* head)
{
    DataNodeType* target = NULL;
    for (target = head; target->linkBox != head; target = target->linkBox) {
    }
    return target;
}

DataNodeType* insert_first(DataNodeType* head, element data)
{
    DataNodeType* LastNode = NULL;
    DataNodeType* node = (DataNodeType*)malloc(sizeof(DataNodeType));
    node->dataBox = data;
    // 데이터 노드가 0개이면
    if (head == NULL) {
        // 1. 뒤쪽 연결
        node->linkBox = head;
        // 2. 앞쪽 연결
        head = node;
        // 3. 원형 설정
        node->linkBox = head;
    } else {
        // 마지막 노드 주소 미리 찾아두기
        LastNode = Finding_LastNode(head);
        // 1. 뒤쪽 연결
        node->linkBox = head;
        // 2. 앞쪽 연결
        head = node;
        // 3. 원형 설정
        LastNode->linkBox = head;
    }
    return head;
}

DataNodeType* insert_last(DataNodeType* head, element data)
{
    DataNodeType* LastNode = NULL;
    DataNodeType* node = (DataNodeType*)malloc(sizeof(DataNodeType));
    node->dataBox = data;
    if (head == NULL) {
        // 1. 뒤쪽 연결, 프로그램 7.3과 달리 추가됨
        node->linkBox = head;
        // 2. 앞쪽 연결
        head = node;
        // 3. 원형 설정
        node->linkBox = head;
    } else {
        // 직전 노드(마지막 노드) 찾기
        LastNode = Finding_LastNode(head);
        // 1. 뒤쪽 연결
        node->linkBox = LastNode->linkBox;
        // 2. 앞쪽 연결
        LastNode->linkBox = node;
        // 3. 원형 설정, 안해도 되긴함.
        node->linkBox = head;
    }
    return head;
}

int main(void)
{
    DataNodeType* headNode = NULL;
    headNode = insert_last(headNode, 20);
    headNode = insert_last(headNode, 30);
    headNode = insert_last(headNode, 40);
    headNode = insert_last(headNode, 50);
    headNode = insert_last(headNode, 60);
    headNode = insert_first(headNode, 10);
    headNode = insert_first(headNode, 7);

    print_list(headNode);
    return 0;
}