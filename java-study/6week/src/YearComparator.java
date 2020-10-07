import java.util.Comparator;

public class YearComparator implements Comparator<PlayerVO> {
    @Override
    public int compare(PlayerVO o1, PlayerVO o2) {
        // 오름 차순
        return o1.getRegYear() - o2.getRegYear();
        // 내림 차순
//        return o2.getRegYear() - o1.getRegYear();
    }
}
