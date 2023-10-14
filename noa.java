
public class noa {
    public static void main(String[] args){
        Crayon blue = new Crayon(80, "PINK");
        blue.GetCrayonInfo();
        Crayon pink = new Crayon(29,"skywine");
        pink.GetCrayonInfo();
    }
}
class Crayon{
    int height;
    String color;

    Crayon(int _height){
        this.height = _height;
    }
    Crayon(int _height, String _color){
        this(_height);
        // 이걸 호출하면 위의 생성자를 호출함 , 해당 변수로

    }
    void GetCrayonInfo(){
        System.out.printf("크레용 길이 : %d, 색상 : %s", this.height, this.color);
    }
}
