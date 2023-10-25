package Rss;

public class b13 {
    public static void main(String[] args){
        // Layla semiconductor Tv 클래스 생성하기 ( 클래스 변수와 인스턴스의 차이 )
        // System.out.println("");
        TV v = new TV();
        v.power();
        v.export();
        TV m = new TV();
        m.export();
    }
}
class TV{
    String model = "Layla Cute 1.5 (99,999,999 inch)";
    static int price = 10_000;
    static int width = 1280;
    static int height = 720;

    boolean power;

    void power(){
        this.power = !power;
    }
    void export(){
        System.out.printf("현재 사용 중인 TV의 모델명은 %s, 해상도는 %d x %d , 전원은 %b\n",this.model, TV.width, TV.height, this.power);
    }
}
