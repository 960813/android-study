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

int is_empty(StackType* s) { return (s->top == -1); }

int is_full(StackType* s) { return (s->top == s->capacity); }

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

int prec(char op)
{
    switch (op) {
    case '(':
    case ')':
        return 0;

    case '+':
    case '-':
        return 1;

    case '*':
    case '/':
        return 2;

    default:
        return -1;
    }
}

void infix_to_postfix(char exp[])
{
    int i = 0;
    char ch, top_op;
    int len = strlen(exp);
    StackType s;

    init_stack(&s);
    for (i = 0; i < len; i++) {
    }
}

int main(void) { return 0; }