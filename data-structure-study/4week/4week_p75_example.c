#include <math.h>
#include <stdio.h>

// 01. 2차원 좌표 공간에서 하나의 점을 나타내는 구조체 Point를 정의하여 보라.
// typedef도 사용하여서 구조체 Point를 하나의 타입으로 정의 한다.
typedef struct POINT_STRUCT {
    double x;
    double y;
} Point;

// 04. 점을 나타내는 두개의 구조체 변수를 받아서 점 사이의 거리를 계산하는 함수 get_distance(Point p1, Point p2)를 작성하여 보자
double get_distance(Point p1, Point p2)
{
    double diff_x = p1.x - p2.x;
    double diff_y = p1.y - p2.y;

    return sqrt(diff_x * diff_x + diff_y * diff_y);
}

int main(void)
{
    // 02. 01에서 정의한 구조체의 변수인 p1과 p2를 정의하여 보라.
    Point p1, p2;

    // 03. p1과 p2를 각각 1,2와 9.8로 초기화하라.
    p1.x = 1;
    p1.y = 2;

    p2.x = 9;
    p2.y = 8;

    printf("p1와 p2 사이의 거리: %.2lf\n", get_distance(p1, p2));

    return 0;
}