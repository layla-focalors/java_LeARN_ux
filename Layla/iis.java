package Layla;

import java.util.Scanner;

public class iis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please input your error code : ");
        String error = sc.nextLine();
        switch(error){
            case "e001":
            case "E001":
                System.out.print("I DONT KNOW YOUR Error");
                break;
            default:
                System.out.print("xps.codre. eroro. erica");
                break;
        }
    }
}
