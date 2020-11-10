// 정렬 기능을 가지려면 Comparable Interface implements 필요
public class PlayerVO implements Comparable<PlayerVO>{
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
        return "PlayerVO{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", regYear=" + regYear +
                '}';
    }

    @Override
    public int compareTo(PlayerVO o) {
        return this.name.compareTo(o.name);
    }

    public int getRegYear() {
        return this.regYear;
    }
}
