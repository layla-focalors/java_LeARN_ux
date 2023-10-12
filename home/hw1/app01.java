import java.util.Scanner;
public class app01 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int value;
            System.out.print("금액을 입력하세요 >> ");
            value = sc.nextInt();
            String text[] = {"오만", "만", "오천", "천", "오백", "백", "오십", "십", "일"};

            int unit[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
            
            for(int i = 0; i < unit.length; i++){
                if(value / unit[i] > 0){
                    System.out.printf("%s 원권 : %d장 \n", text[i], value/unit[i]);
                    value = value%unit[i];
                }
            }
        }
    }    
}

