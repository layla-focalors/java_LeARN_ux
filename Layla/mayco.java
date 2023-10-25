package Layla;
import java.util.Scanner;

public class mayco {
    public static void main(String[] args){
        // 선택 곱셈표 진행하기
        Scanner sc = new Scanner(System.in);
        int val1; int val2;
        System.out.print("calc 1 input >> ");
        val1 = sc.nextInt();
        System.out.print("calc 2 input >> ");
        val2 = sc.nextInt();
        for(int i = 1; i < val2 + 1; i++){
            System.out.printf("%d x %d = %d\n", val2, i, val1 * i);
        }
    }
}
