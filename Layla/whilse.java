package Layla;
import java.util.Scanner;

public class whilse {
    public static void main(String[] args){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            System.out.print("Hello flag");
            int co = sc.nextInt();
            switch(co){
                case 1:
                    System.out.print("Assuroa\n");
                    break;
                case 0:
                    System.out.println("Turn Off");
                    flag = false;
                    break;
                default:
                    System.out.println("Unknown ID");
                    break;
            }
        }
    }
}
