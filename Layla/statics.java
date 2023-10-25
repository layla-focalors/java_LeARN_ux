package Layla;

public class statics {
    public static void main(String[] args){
        Rectangle rc = new Rectangle(10, 13, 42, 26, "pink");
        rc.showRectangleInfo();
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
class Rectangle{
    Point p1;
    Point p2;
    String color;
    Rectangle(int x1, int y1, int x2, int y2, String color){
        p1 = new Point();
        p2 = new Point();
        p1.SetX(x1); p1.SetY(y1);
        p2.SetX(x2); p2.SetY(y2);
        this.color = color;
    }
    void showRectangleInfo(){
        int width = p1.GetX() - p2.GetX();
        int height = p1.GetY() - p2.GetY();
        System.out.printf("해당 도형의 색은 %s 이며, 도형의 넓이는 %dcm^ 이고, 시작 위치는 (%d,%d) 끝 위치는 (%d,%d) 입니다.",
        this.color, width * height, p1.GetX(), p1.GetY(), p2.GetX(), p2.GetY());
    }
}

