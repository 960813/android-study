import java.io.*;
import java.util.*;

public class Assignment_12week {
    public static void main(String[] args) {
        int nMenu = 0;
        boolean bFlag = true;
        String strName;
        int nScore = 0;

        Scanner scan = new Scanner(System.in);
        final HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (bFlag) {
            System.out.println("---------------------");
            System.out.println("1. 성적입력");
            System.out.println("2. 성적삭제");
            System.out.println("3. 성적검색");
            System.out.println("4. 전체성적출력");
            System.out.println("5. 전체성적 출력(이름순)");
            System.out.println("6. 전체성적 출력(성적순)");
            System.out.println("7. 저장하기");
            System.out.println("8. 불러오기");
            System.out.println("0. 종료");
            System.out.println("---------------------");

            System.out.println("0 ~ 8 사이의 숫자를 입력하세요.");
            nMenu = Integer.parseInt(scan.nextLine());

            switch (nMenu) {
                case 0: // 종료
                    System.out.println("종료");
                    bFlag = false;
                    break;
                case 1: // 입력
                    System.out.print("이름 입력 >> ");
                    strName = scan.nextLine();

                    System.out.print("성적 입력 >> ");
                    nScore = Integer.parseInt(scan.nextLine());

                    // HashMap에 이름과 성적 삽입
                    map.put(strName, nScore);
                    break;
                case 2: // 삭제
                    System.out.print("삭제할 이름 >> ");
                    strName = scan.nextLine();
                    map.remove(strName);
                    break;
                case 3: // 검색
                    System.out.print("검색할 이름 >> ");
                    strName = scan.nextLine();
                    nScore = map.get(strName);
                    System.out.println("이름 : " + strName + ", 점수 : " + nScore);
                    break;
                case 4: // 출력
                    System.out.println("전체출력");
                    Set<String> keys = map.keySet();
                    Iterator<String> iterator = keys.iterator();
                    while (iterator.hasNext()) {
                        String name = iterator.next();
                        Integer score = map.get(name);
                        System.out.println("이름 : " + name + ", 점수 : " + score);
                    }
                    break;
                case 5: // 이름순 출력
                    // Key를 기반으로 정렬하는 TreeSet을 정의하고 putAll을 통해 값 삽입 및 정렬 수행
                    Map<String, Integer> sortedMap = new TreeMap<String, Integer>(new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            return o1.compareTo(o2);
                        }
                    });

                    sortedMap.putAll(map);
                    Set<String> nameKeys = sortedMap.keySet();

                    for (String nameKey : nameKeys) {
                        System.out.println("이름 : " + nameKey + ", 점수 : " + sortedMap.get(nameKey));
                    }
                    break;
                case 6: // 성적순 출력
                    // Hashmap의 Key를 ArrayList로 만들고,
                    // compare 메소드를 오버라이딩하여 sort by value 구현
                    List<String> scoreKeys = new ArrayList<String>(map.keySet());
                    Collections.sort(scoreKeys, new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            return map.get(o1) - map.get(o2);
                        }
                    });
                    for (String scoreKey : scoreKeys) {
                        System.out.println("이름 : " + scoreKey + ", 점수 : " + map.get(scoreKey));
                    }
                    break;
                case 7: // 저장하기
                    try {
                        FileOutputStream fos = new FileOutputStream("data.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(map);
                        oos.close();
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8: // 불러오기
                    try {
                        FileInputStream fis = new FileInputStream("data.txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        map.clear();
                        map.putAll((HashMap<String, Integer>) ois.readObject());
                        ois.close();
                        fis.close();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("0 ~ 8 사이의 숫자를 입력하세요.");
                    break;
            }
        }
    }
}
