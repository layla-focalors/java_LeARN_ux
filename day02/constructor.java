package day02;

public class constructor {
    public static void main(String[] args){
        Crayon blue = new Crayon("blue", 5);
        Crayon red = new Crayon("red", 5);
        Crayon owner = new Crayon("green", 4, "layla");

        blue.printCrayonInfo();
        red.printCrayonInfo();
        owner.printCrayonInfo();
        return;
    }
}
class Crayon{
    String color;
    String owner_name;
    int now_length;
    // A 생성자
    Crayon(String _color, int _now_length){
        color = _color;
        now_length = _now_length;
    }
    // B 생성자
    Crayon(String _color, int _now_length, String _owner_name){
        // this 키워드로 A 생성자 호출
        this(_color, _now_length);
        owner_name = _owner_name;
    }
    void printCrayonInfo(){
        System.out.println("color : " + color);
        System.out.println("length : " + now_length);
        System.out.println("owner : " + owner_name);
        return;
    }
}
