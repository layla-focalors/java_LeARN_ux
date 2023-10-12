package day01;

public class samples {
    public static void main(String[] args){
        Sample sam = Sample.createSample(100000);
        sam.printInstanceValue();
    }
}
class Sample{
    int instance;
    void setInstanceValue(int number){
        instance = number;
    }
    void printInstanceValue() {
        System.out.println(instance);
        return;
    }
    static Sample createSample(int instance_number){
        Sample sam = new Sample();
        sam.setInstanceValue(instance_number);
        return sam;
        // 이때, sam의 출력 타입이 Sample!
    }
}
