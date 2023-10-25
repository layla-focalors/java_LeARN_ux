package Layla;

import java.util.Scanner;

public class lapid {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("1누르면 종료, 입력값 저장 : ");
            int header = sc.nextInt();
            if(header == 1){
                flag = false;
            }else { sum += header; }
        }while(flag);
        System.out.println(sum);
    }
}
