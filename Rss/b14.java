package Rss;

import javax.swing.text.Style;

public class b14 {
    public static void main(String[] args){
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.println("[10.0 == 10.0f]" + (10.0 == 10.0f));
        System.out.println("[d==f]" + (d == f));
        // double로 정확하게 0.1과 float을 거쳐 저장된 0.1은 값이 다름
        System.out.println("[d==d2]" + (d==d2));
        // 위와 동일한 이유
        System.out.println("[(float)d == f]" + ((float)d == f));
        // 강제로 형 변환해서 float으로 만들면, 결국에는 값이 같아짐
        // char 문자는 자동 형 변환을 통해 아스키 코드에 대치하여 int 정수 연산이 수행됨 -> 결과 int 
        // 강제 형 변환으로 char 문자 자료형으로 문자로 만들 수 있음
    }
}
