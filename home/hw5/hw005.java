import java.util.Scanner;
public class hw005 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("정수 입력 >> ");
            int value = sc.nextInt();
            for(int i=value; i != 0; i--){
                for(int j=i; j != 0; j--){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
