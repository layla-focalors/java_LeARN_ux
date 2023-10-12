package day01;

public class cryonmap {
    public static void main(String[] args){
        Crayon blue_crayon = new Crayon("blue", 6);
        Crayon red_crayon = new Crayon("red", 3);

        blue_crayon.printCrayonInfo();
        red_crayon.printCrayonInfo();
        return;
    }
}

class Crayon {
    String color;
    int now_length;
    // Crayon() { } 생성자는 정의하지 않음

    // new Crayon("XXX") 에서 이 생성자를 실행
    Crayon(String _color){
        color = _color;
        now_length = 5;
    }
    // new Crayon("xxx", x)에서 이 생성자를 실행
    Crayon(String _color, int _now_length){
        color = _color;
        now_length = _now_length;
    }

    void printCrayonInfo(){
        System.out.println("크레용의 색 : " + color);
        System.out.println("크레용의 길이 : " + now_length);
        return;
    }
}
