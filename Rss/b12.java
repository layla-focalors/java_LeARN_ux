package Rss;

public class b12 {
    public static void main(String[] args){
        Sample sc = new Sample();
        sc.print_Values();
    }
}
class Sample{
    int sample_value0 = 9999;
    int sample_value1;
    int sample_value2;
    int sample_value3;
    static int staticsample;

    static {
        System.out.println("class variable initzation block excuted");
        staticsample = 10_1000;
    }
    {
        System.out.println("instance initzation block excuted");
        if(sample_value1 == 100){
            sample_value2 = 200;
        }else {
            sample_value2 = 300;
        }
        // 인스턴스 초기화블럭은 분기 초기화 블럭을 실행할 수 있음
    }
    Sample(){
        System.out.println("initzatior called");
        sample_value3 = 400;
    }
    void print_Values(){
        System.out.println("samplevalue 0" + sample_value0);
        System.out.println("samplevalue 1" + sample_value1);
        System.out.println("samplevalue 2" + sample_value2);
        System.out.println("samplevalue 3" + sample_value3);
        System.out.println("static samplevalue 0" + staticsample);

    }
    // 각각 순서대로,
    /*
     * 1. 클래스 변수 및 클래스 변수 초기화블록 실행
     * 2. 명시적 초기화 실행 x -= 1000;
     * 3. 인스턴스 변수 및 인스턴스 초기화블록 실행
     * 4. 생성자 실행
     */
}