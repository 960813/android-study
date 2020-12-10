#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

int DataNode_Count = 0;
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
    printf("\n");
}

DataNodeType* Finding_LastNode(DataNodeType* head)
{
    DataNodeType* target = NULL;
    for (target = head; target->linkBox != head; target = target->linkBox) {
    }
    return target;
}

DataNodeType* Finding_PreNode(DataNodeType* head, int pos)
{
    DataNodeType* PreNode = head;
    int i = 0;

    for (; i < pos - 2; i++) {
        PreNode = PreNode->linkBox;
    }
    return PreNode;
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
    DataNode_Count++;
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
    DataNode_Count++;
    return head;
}

// 임이의 위치에 새 데이터 노드를 추가하는 함수
DataNodeType* insert(DataNodeType* head, int pos, element data)
{
    // 추가하기를 원하는 위치가 적절한가를 체크
    if (((0 < pos) && (pos <= DataNode_Count + 1)) != TRUE) {
        printf("그 위치에는 데이터노드를 추가할 수 없습니다.\n");
        return head;
    } else {
        DataNodeType* node = (DataNodeType*)malloc(sizeof(DataNodeType));
        node->dataBox = data;
        if (head == NULL) {
            return insert_first(head, data);
        } else {
            // _1. 추가위치가 1이면, insert_first() 호출
            if (pos == 1)
                return insert_first(head, data);
            // _2. 추가위치가 가장 끝이면, insert_last() 호출
            else if (pos == DataNode_Count + 1)
                return insert_last(head, data);
            else {
                DataNode_Count++;
                // 0. 직전 노드를 찾기
                DataNodeType* PreNode = Finding_PreNode(head, pos);
                // 1. 뒤쪽 연결
                node->linkBox = PreNode->linkBox;
                // 2. 앞쪽 연결
                PreNode->linkBox = node;
                return head;
            }
        }
    }
}

int main(void)
{
    DataNodeType* headNode = NULL;
    int position, data;

    // headNode = insert_last(headNode, 20);
    // headNode = insert_last(headNode, 30);
    // headNode = insert_last(headNode, 40);
    // headNode = insert_last(headNode, 50);
    // headNode = insert_last(headNode, 60);
    // headNode = insert_first(headNode, 10);
    // headNode = insert_first(headNode, 7);
    // headNode = insert(headNode, 3, 77);

    // 위치와 저장할 데이터를 직접 받아서 처리
    int repeat = 0;
    while (repeat != -1) {
        printf("저장할 위치를 입력하라: ");
        scanf("%d", &position);

        printf("저장할 데이터를 입력하라: ");
        scanf("%d", &data);

        headNode = insert(headNode, position, data);

        print_list(headNode);
        printf("현재 데이터 노드의 총 갯수: %d\n", DataNode_Count);
        printf("===============================\n");
        printf("계속하려면 0을, 그만하려면 -1을 입력하세요.\n");
        scanf("%d", &repeat);
    }
    return 0;
}