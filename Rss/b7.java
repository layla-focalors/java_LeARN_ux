package Rss;

public class b7 {
    public static void main(String[] args){
        // SCE 테스트
        int x = 10;
        int y = 20;
        if(++x == 11 || ++y == 21){
            System.out.println(x + "+" + y);
        }
        // 값 출력 시, 11, 20등장, 즉 뒤에 있는 y의 값은 증감되지 않음

        if(--x == 11 & ++y != 21);{
            System.out.println(x + "+" + y);
            // 이번에는 정상적으로 처리함 뒤에도 처리됨 21로
        }
    }
}
