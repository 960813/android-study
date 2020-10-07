import java.util.ArrayList;
import java.util.Collections;

// 정렬 기능을 가지는 Comparable 구현
class PlayerVO implements Comparable<PlayerVO> {
    private String name;
    private String position;
    private int regYear;

    public PlayerVO(String name, String position, int regYear) {
        this.name = name;
        this.position = position;
        this.regYear = regYear;
    }

    @Override
    public String toString() {
        return name + ":" + position + ":" + regYear;
    }

    @Override
    public int compareTo(PlayerVO p) {
        System.out.println("정렬 시도..");
        return this.name.compareTo(p.name);
    }
}

public class PlayerVOSortEx {
    public static void main(String[] args) {
        ArrayList<PlayerVO> players = new ArrayList<PlayerVO>();
        players.add(new PlayerVO("홍길동", "투수", 1999));
        players.add(new PlayerVO("임꺽정", "포수", 2005));
        players.add(new PlayerVO("강감찬", "1루수", 2003));
        players.add(new PlayerVO("을지문득", "2루수", 2010));

        System.out.println(players);
        System.out.println();

        System.out.println("== 정렬 ==");
        Collections.sort(players);
        System.out.println(players);
    }
}
