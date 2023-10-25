package Layla;

public class choco {
    public static void main(String[] args){
        Circle cr = new Circle(10, 10, 5, "pINk0");
        cr.CircleInfo();
    }
}
class Point{
    int x;
    int y;

    int GetX(){
        return this.x;
    }
    int GetY(){
        return this.y;
    }
    void SetX(int _x){
        this.x = _x;
    }
    void SetY(int _y){
        this.y = _y;
    }
}
class Circle{
    Point p1;
    String color;
    int r;

    Circle(int x, int y, int r, String color){
        p1 = new Point();
        p1.SetX(x);
        p1.SetY(y);
        this.color = color;
        this.r = r;
    }

    void CircleInfo(){
        System.out.printf("해당 도형의 색은 %s 이며, 도형의 넓이는 %d파이이고, 원의 중심 위치는 (%d,%d) 이며, 반지름 길이는 %dcm입니다.",
        this.color, r * r, p1.GetX(), p1.GetY(), r);
    }
}