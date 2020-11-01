#include <stdio.h>
#include <stdlib.h>

#define MAX_STACK_SIZE 100

typedef struct {
    int data[MAX_STACK_SIZE];
    int top;
} StackType;

// void init_stack(StackType *s) {
//     s->top = -1;
// }

int is_empty(StackType* s)
{
    return (s->top == -1);
}

int is_full(StackType* s)
{
    return (s->top == (MAX_STACK_SIZE - 1));
}

void push(StackType* s, int item)
{
    if (is_full(s)) {
        fprintf(stderr, "스택 포화 에러 \n");
        return;
    } else
        s->data[++(s->top)] = item;
}

int pop(StackType* s)
{
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    } else
        return s->data[(s->top)--];
}

int peak(StackType* s)
{
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    } else
        return s->data[s->top];
}

void display_all_stack(StackType* start_address)
{
    for (int i = 0; i <= start_address->top; i++)
        printf("[%d]-->", start_address->data[i]);
    printf("\n");
    printf("\n");
}

int main(void)
{
    StackType s;
    s.top = -1;

    for (int i = 0; i < MAX_STACK_SIZE; i++) // 스택의 내용을 0으로 초기화
        s.data[i] = 0;

    push(&s, 1);
    display_all_stack(&s);
    push(&s, 2);
    display_all_stack(&s);
    push(&s, 3);
    display_all_stack(&s);

    printf("%d\n", pop(&s));
    display_all_stack(&s);

    printf("%d\n", pop(&s));
    display_all_stack(&s);

    printf("%d\n", pop(&s));
    display_all_stack(&s);
    
    return 0;
}