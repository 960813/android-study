#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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

int check_matching(const char* in)
{
    StackType s;
    char ch, open_ch;
    int i, n = strlen(in);
    init_stack(&s);

    for (i = 0; i < n; i++) {
        ch = in[i];
        switch (ch) {
        case '(':
        case '[':
        case '{':
            push(&s, ch);
            break;
        case ')':
        case ']':
        case '}':
            if (is_empty(&s))
                return 0;
            else {
                open_ch = pop(&s);
                if ((open_ch == '(' && ch != ')') || (open_ch == '[' && ch != ']') || (open_ch == '{' && ch != '}'))
                    return 0;
                break;
            }
        default:
            break;
        }
    }
    if (!is_empty(&s)) // 스택에 남아있으면 오류
        return 0;
    return 1;
}

int main(void)
{
    char* p = "{ A[(i+1)]=0;";
    if (check_matching(p) == 1)
        printf("%s success\n", p);
    else
        printf("%s fail\n", p);

    return 0;
}