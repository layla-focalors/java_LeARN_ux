import java.util.Scanner;

public class app04_switch {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("달을 입력하세요(1~12) >>> ");
            int month;
            month = sc.nextInt();
            switch(month){
                case 11:
                case 1:
                case 2:
                case 3:                
                    System.out.println(
                        "겨을"
                    );
                    break;
                case 4:
                    System.out.println(
                        "봄"
                    );
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(
                        "여름"
                    );
                    break;
                case 10:
                    System.out.println(
                        "가을"
                    );
                    break;
                default:
                    System.out.println(
                        "달이 잘못되었습니다. ^-^"
                    );
                    break;
            }
        }
    }    
}
