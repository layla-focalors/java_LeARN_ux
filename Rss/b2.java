package Rss;

public class b2 {
    public static void main(String[] args){
        // 연산자 기준, 여러 자료형의 동시연산.
        System.out.println("안녕하세요! 저는" + " 레일라 포칼로스 입니다!");
        System.out.println("좋아하는 알파벳! : " + 'S');
        System.out.println("좋아하는 정수는... " + 0);
        System.out.println("좋아하는 float 형 소수점은! " + 1.11f);
        System.out.println("좋아하는 double 형 소수점은! " + 3.22);
        
        // 피연산자가 모두 숫자일 때,
        System.out.println(7 + 7);

        // 피연산자가 정수의 덧셈 및 문자열일 때.
        System.out.println(7 + 7 + "hello");
        
        // 피연산자가 정수의 덧셈 및 문자일 때.
        System.out.println(7 + 7 + 'A');
    }
}
