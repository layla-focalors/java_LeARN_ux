package day01;

public class orb {
    public static void main(String[] args){
        SimpleOverLoading so = new SimpleOverLoading();
        so.add(100, 200);
        so.add(1.1, 2.2);
        so.add(1.1f, 2.2f);
        so.add("1.1f", "2.2f");
    }
}
// 같은 이름으로 매개변수의 정의만 다르게 하더라도 찾을 수 있음!
class SimpleOverLoading{
    void add(int num1, int num2){return;}
    void add(double num1, double num2){return;}
    void add(float num1, float num2){return;}
    void add(String st1, String str2){return;}
}
