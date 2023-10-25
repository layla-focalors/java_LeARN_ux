package Layla;

import java.util.Scanner;

public class ird {
    public static void main(String[] args){
        int odd_sum = 0, input_num = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            odd_sum += input_num;
            System.out.print("Odd input : >> ");
            input_num = sc.nextInt();
        }while(input_num % 2 == 0);
        System.out.println("odd sum" + odd_sum);
    }
}
