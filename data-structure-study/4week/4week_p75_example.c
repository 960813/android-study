#include <math.h>
#include <stdio.h>

// 01. 2���� ��ǥ �������� �ϳ��� ���� ��Ÿ���� ����ü Point�� �����Ͽ� ����.
// typedef�� ����Ͽ��� ����ü Point�� �ϳ��� Ÿ������ ���� �Ѵ�.
typedef struct POINT_STRUCT {
    double x;
    double y;
} Point;

// 04. ���� ��Ÿ���� �ΰ��� ����ü ������ �޾Ƽ� �� ������ �Ÿ��� ����ϴ� �Լ� get_distance(Point p1, Point p2)�� �ۼ��Ͽ� ����
double get_distance(Point p1, Point p2)
{
    double diff_x = p1.x - p2.x;
    double diff_y = p1.y - p2.y;

    return sqrt(diff_x * diff_x + diff_y * diff_y);
}

int main(void)
{
    // 02. 01���� ������ ����ü�� ������ p1�� p2�� �����Ͽ� ����.
    Point p1, p2;

    // 03. p1�� p2�� ���� 1,2�� 9.8�� �ʱ�ȭ�϶�.
    p1.x = 1;
    p1.y = 2;

    p2.x = 9;
    p2.y = 8;

    printf("p1�� p2 ������ �Ÿ�: %.2lf\n", get_distance(p1, p2));

    return 0;
}