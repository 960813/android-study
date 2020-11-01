#include <stdio.h>
#include <stdlib.h>

#define MAX_STACK_SIZE 100

typedef struct {
    int* data;
    int capacity;
    int top;
} StackType;

void init_stack(StackType* s)
{
    s->top = -1;
    s->capacity = 1;
    s->data = (int*)malloc(s->capacity * sizeof(int));
}

int is_empty(StackType* s)
{
    return (s->top == -1);
}

int is_full(StackType* s)
{
    return (s->top == s->capacity);
}

void push(StackType* s, int item)
{
    if (is_full(s)) {
        s->capacity *= 2;
        s->data = (int*)realloc(s->data, s->capacity * sizeof(int));
        printf("Realloc: %d \n", s->capacity);
    }
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
    init_stack(&s);

    push(&s, 1);
    push(&s, 2);
    push(&s, 3);
    push(&s, 4);
    push(&s, 5);
    push(&s, 6);

    printf("%d\n", pop(&s));
    printf("%d\n", pop(&s));
    printf("%d\n", pop(&s));

    free(s.data);
    return 0;
}