package Layla;

import java.util.Scanner;

public class lace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] asic = new int[4];
        for(int i = 0; i < 4; i++){
            System.out.print("test" + i + "input score >> ");
            asic[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < asic.length; i ++){
            sum += asic[i];
        }
        System.out.println("your total score is . . ." + sum);
        if(sum > 90){
            System.out.println("A+");
        }else if(sum > 80){
            System.out.println("A");
        }else if(sum > 70){
            System.out.println("B");
        }else if(sum > 60){
            System.out.println("C");
        }else {
            System.out.print("F");
        }
    }
}
