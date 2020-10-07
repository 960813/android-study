import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        // 키
        Set<String> key = dic.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()) {
            String eng = (String) it.next();
            String kor = dic.get(eng);
            System.out.println(eng + ":" + kor);
        }

        // 사용자로부터 영어 단어를 입력 받고 한글 단어 검색, "exit" 종료
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("찾고 싶은 단어는?");
            String eng = scan.next();
            if (eng.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }

            // HashMap에서 Key를 가지고 값을 검색
            String kor = dic.get(eng);

            if (kor == null)
                System.out.println(eng + "는 없는 단어입니다.");
            else
                System.out.println(kor);
        }

        scan.close();

    }
}
