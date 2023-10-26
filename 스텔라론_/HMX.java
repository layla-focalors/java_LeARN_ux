package 스텔라론_;

public class HMX {
    public static void main(String[] args){
        Circle cr = new Circle(30, 30, "GREEN", 5);
        cr.showinfo();
    }
}
class Point{
    int x;
    int y;
    int GET_X(){
        return this.x;
    }
    int GET_Y(){
        return this.y;
    }
    void POST_SET_X(int _x){
        this.x = _x;
    }
    void POST_SET_Y(int _y){
        this.y = _y;
    }
}
class Circle {
    Point p1;
    String color;
    int round;
    Circle(int x, int y, String color, int round){
        p1 = new Point();
        p1.POST_SET_X(x); p1.POST_SET_Y(y);
        this.color = color;
        this.round = round;
    }
    void showinfo(){
        System.out.printf("해당 도형의 색은 %s 이며, 도형의 넓이는 %d파이이고, 원의 중심 위치는 (%d,%d)이며, 반지름 길이는 %dCM 입니다.\n",
        this.color, round * round, p1.GET_X(), p1.GET_Y(), round);
    }
}
