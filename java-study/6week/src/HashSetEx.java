import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

// 정렬 기능을 가지려면 Comparable 인터페이스를 구현해야 한다.
class Player implements Comparable<Player> {
    private String name;
    private String nation;

    public Player(String name, String nation) {
        this.name = name;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return name + ":" + nation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) &&
                Objects.equals(nation, player.nation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nation);
    }

    @Override
    public int compareTo(Player o) {
        return this.name.compareTo(o.name);
    }
}

// Set: 중복이 허용안되고, 순서가 없다.
// HashXXX: equals(), hashCode() 메소드를 오버라이딩해야 한다.
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Player> players = new HashSet<>();

        Player p1 = new Player("Kim", "Korean");
        Player p2 = new Player("Kim", "Korean");
        Player p3 = new Player("Lee", "Korean");
        Player p4 = new Player("Ahn", "Korean");

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        System.out.println(players);
        System.out.println(p1.equals(p2));

        System.out.println();
        System.out.println("== 정렬 ==");
        TreeSet<Player> tset = new TreeSet<Player>();
        tset.add(p1);
        tset.add(p2);
        tset.add(p3);
        tset.add(p4);
        System.out.println(tset);
    }
}
