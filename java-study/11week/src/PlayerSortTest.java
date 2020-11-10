import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayerSortTest {
    public static void main(String[] args) {
        ArrayList<PlayerVO> players = new ArrayList<PlayerVO>();

        players.add(new PlayerVO("홍길동", "투수", 1999));
        players.add(new PlayerVO("강감찬", "포수", 2005));
        players.add(new PlayerVO("임꺽정", "1루수", 2003));
        players.add(new PlayerVO("을지문덕", "2루수", 2010));

        System.out.println(players);

        Collections.sort(players);

        System.out.println(players);

        System.out.println();
        System.out.println("입단 연도별 정렬");

        Comparator comparator = new YearComparator();
        Collections.sort(players, comparator);

        // 익명 중첩 클래스(anonymous class)
        // 객체를 단 한번만 생성하면서 인터페이스의 추상 메소드를 구현
        Collections.sort(players, new Comparator<PlayerVO>() {
            @Override
            public int compare(PlayerVO o1, PlayerVO o2) {
                return o1.getRegYear() - o2.getRegYear();
            }
        });

        System.out.println(players);
    }
}
