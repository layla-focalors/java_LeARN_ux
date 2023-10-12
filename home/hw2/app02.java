import java.util.*;
public class app02 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> storage = new ArrayList<Integer>();
            while(true){
                System.out.print("정수 입력 >> ");
                int sti = sc.nextInt();
                if(sti == -1){
                    int sum = 0;
                    for(int i = 0; i < storage.size(); i++){
                        sum += storage.get(i);
                    }
                    sum = sum / storage.size();
                    System.out.printf(
                        "입력 받은 값들의 평균은 %d 입니다.", sum
                    );
                    return;
                }else {
                    storage.add(sti);
                }
            }
        }
    }
}