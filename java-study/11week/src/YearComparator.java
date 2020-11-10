import java.util.Comparator;

public class YearComparator implements Comparator<PlayerVO> {
    @Override
    public int compare(PlayerVO o1, PlayerVO o2) {
        // 년도가 앞서면 음수가 나오도록
        return o1.getRegYear() - o2.getRegYear();
    }
}
