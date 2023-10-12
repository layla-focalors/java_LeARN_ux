package day02;

public class reset {
    public static void main(String[] args){
        Sample samp = new Sample();
        samp.printvalue();
        return;
    }
}
class Sample{
    int sample = 9999; // 명시적 초기화 
    int sample1;
    int sample2;
    int sample3;

    static int static_sample; // 클래스 변수, 클래스 변수 초기화 블럭으로 초기화
    // 클래스 변수의 초기화 블럭
    static{
        System.out.println("클래스 변수 초기화 블록 실행");
        static_sample = 100000;
    }

    // 인스턴스 변수의 초기화 블럭
    {
        System.out.println("명시적 초기화 실행 : " + sample);
        System.out.println("인스턴스 변수 초기화 실행");
        // 분기 초기화 가능
        // 그러나 변수가 지역 외부에서 선언되어 있어야 함
        sample1 = 300;
        if(sample1 == 100){
            sample2 = 200;
        }else {
            sample2 = 900;
        }
    }
    Sample(){ 
        System.out.println("생성자 호출");
        sample3 = 500;
    }
    void printvalue(){
        System.out.println(sample);
        System.out.println(sample1);
        System.out.println(sample2);
        System.out.println(sample3);
        System.out.println(static_sample);
        return;        
    }
}