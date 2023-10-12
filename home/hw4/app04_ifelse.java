import java.util.Scanner;
public class app04_ifelse {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("달을 입력하세요(1~12) >>> ");
            int month;
            month = sc.nextInt();
            if(month == 11 || month == 1 || month == 2 || month == 3){
                System.out.println("겨울");
            }else if(month == 10){
                System.out.println("가을");
            }else if(month == 5 || month == 6 || month == 7 || month == 8 || month == 9){
                System.out.println("여름");
            }else if(month == 4){
                System.out.println("봄");
            }else {
                System.out.println("달이 잘못 입력되었어요! ^-^");
                System.out.println("/*\r\n" + //
                        " *    (\"`-/\")_.-'\"``-._\r\n" + //
                        " *     . . `; -._    )-;-,_`)\r\n" + //
                        " *    (v_,)'  _  )`-.\\  ``-'\r\n" + //
                        " *   _.- _..-_/ / ((.'\r\n" + //
                        " * ((,.-'   ((,/\r\n" + //
                        " * \r\n" + //
                        " */");
            }
        }
    }
}
