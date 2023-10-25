package Layla;

public class laypis {
    public static void main(String[] args){
        // 상수의 정의
        // 리터럴 & 심볼릭 상수
        final int MAX_NUMBER = 100;
        // MIN_NUMBER = 그저 선언한 거
        final int MIN_NUMBER;

        // 모든 상수는 메모리에 들어가며, 선언 이후 1회 초기화 가능
        MIN_NUMBER = 2_100;
        System.out.println(MAX_NUMBER);
        // MIN_NUMBER = 4; 
        // 오류 발생! 1회만 초기화 가능
        System.out.println(MIN_NUMBER);
    }
}
