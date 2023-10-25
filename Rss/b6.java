package Rss;

public class b6 {
    public static void main(String[] args){
        // 문자열 비교
        String str1 = "Layla";
        String str2 = new String("Layla");

        System.out.println(str1 == str2);
        // 참조 자료형의 각 주소가 달라서 false 반환
        System.out.println(str1.equals(str2));
        // equals는 내부 값을 비교하기 때문에 동일함을 확인
        System.out.println("Layla".equals(str2));
        // 위와 같은 직렬 연산 형태로 연산할 수도 있음
    }
}
