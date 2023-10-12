import java.util.Scanner;
public class app03 {
    public static void main(String[] args){
        int x; int y;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("x 좌표를 입력하세요 >> ");
            x = sc.nextInt(); 
            System.out.print("y 좌표를 입력하세요 >> ");
            y = sc.nextInt();
        }
        if((x >= 100 && x <= 200) && (y >= 100 && y <= 200)){
            System.out.printf("(%d, %d)는 사각형 안에 있습니다.", x, y);
        }
        else {
            System.out.printf("(%d, %d)는 사각형 안에 없습니다.", x, y);            
        }
    }
}