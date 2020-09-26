#include <stdio.h>
/*
다항식(polynomial)을 구성하고 있는 정보를 Data로 저장하기
저장할 필수 정보: 다항식의 차수, 각 항의 계수
*/

#define MAX(a, b) (((a) > (b)) ? (a) : (b))
#define MAX_DEGREE 101

typedef struct POLYNOMIAL_STRUCT {
    int degree; // 다항식의 차수
    float coef[101]; // 다항식의 계수
} polynomial;

// C = A+B 여기서 A와 B는 다항식이다. polynomial 다항식 반환
polynomial poly_add1(polynomial A, polynomial B)
{
    polynomial C; // 결과 다항식
    int Apos = 0, Bpos = 0, Cpos = 0; // 배열 인덱스 변수
    int degree_a = A.degree;
    int degree_b = B.degree;
    C.degree = MAX(degree_a, degree_b); // 결과 다항식 차수

    while (Apos <= A.degree && Bpos <= B.degree) {
        if (degree_a > degree_b) { // A항 > B항
            C.coef[Cpos++] = A.coef[Apos++];
            degree_a--;
        } else if (degree_a == degree_b) { // A항 == B항
            C.coef[Cpos++] = A.coef[Apos++] + B.coef[Bpos++];
            degree_a--;
            degree_b--;
        } else { // B항 > A항
            C.coef[Cpos++] = B.coef[Bpos++];
            degree_b--;
        }
    }
    return C;
}

void print_poly(polynomial p)
{
    for (int i = p.degree; i > 0; --i)
        printf("%3.1fx^%d + ", p.coef[p.degree - i], i);
    printf("%3.1f \n", p.coef[p.degree]);
}

// 다항식 계수 입력 함수, while 문에서 처리하기엔 지저분해서 별도로 분리
// int poly_id : 몇번째 다항식인지 식별하기 위한 identifier
// int coef_idx : 다항식의 몇번째 계수인지 식별하기 위한 index
// ctrl+z(EOF) 입력 시 0(false) 반환
// 그 외 1(true) 반환
int input_poly_coef(int poly_id, int coef_idx, float* coef)
{
    printf("%d번째 다항식의 계수(idx %d): ", poly_id, coef_idx);
    if (scanf("%f", coef) == EOF)
        return 0;

    return 1;
}

int main(void)
{
    polynomial a;
    polynomial b;
    polynomial c;

    int i;

    // information message
    printf("[다항식 덧셈 프로그램]\n");
    printf(">> 다항식 2개의 계수를 입력해주세요.\n");
    printf(">> 입력 종료: ctrl+z\n\n");

    // 2개의 다항식을 입력받기 위한 for-loop
    for (i = 0; i < 2; ++i) {
        // 입력하게 될 다항식을 선택
        polynomial* target;
        if (i == 0)
            target = &a;
        else
            target = &b;

        // 몇 번째 계수를 입력하고 있는지 저장하는 변수.
        // 최종적으로는 다항식 자체 차수(degree)를 얻어내는데 사용
        int degree_idx = 0;

        // 별도로 정의한 input_poly_coef 함수 호출
        // 첫 번째 인자(int poly_id)  : information message 출력을 위해 값 전달
        // 두 번째 인자(int coef_idx) : information message 출력을 위해 값 전달
        // 세 번째 인자(float* coef)  : 다항식의 계수를 저장할 수 있게끔 속성의 주소 전달
        // ctrl+z(EOF)가 입력되지 않는다면 1을 반환하기 때문에 무한히 반복함.
        while (input_poly_coef(i + 1, degree_idx, &(target->coef[degree_idx]))) {
            degree_idx++;
        }

        // 다항식 자체 차수(degree)를 계산. degree_idx를 활용
        // 인덱스라 0부터 시작하기 때문에 -1을 해준다.
        target->degree = degree_idx - 1;

        printf("........\n");
    }

    print_poly(a);
    print_poly(b);
    c = poly_add1(a, b);
    printf("=====================================================================\n");
    print_poly(c);
    return 0;
}