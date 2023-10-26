package 스텔라론_;

public class 개척자 {
    public static void main(String[] args){
        Rectangle rc = new Rectangle(10, 40, 50, 1000, "pink");
        rc.ShowRectangleInfo();
        Rectangle white = new Rectangle(10, 10, 30, 40, "white");
        white.ShowRectangleInfo();
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
    void setX(int _x){
        this.x = _x;
    }
    void setY(int _y){
        this.y = _y;
    }
}
class Rectangle{
    Point p1;
    Point p2;
    String color;
    Rectangle(int x1, int y1, int x2, int y2, String _color){
        p1 = new Point(); p2 = new Point();
        p1.setX(x1); p1.setY(y1);
        p2.setX(x2); p2.setY(y2);
        this.color = _color;
    }
    void ShowRectangleInfo(){
        int width = p1.GetX() - p2.GetX();
        int height = p1.GetY() - p2.GetY();
        System.out.printf("해당 도형의 색은 %s이며, 도형의 넓이는 %dcm^ 이고, 시작 위치는 (%d,%d) 끝 위치는 (%d,%d) 입니다.\n",
        this.color, width * height, p1.GetX(), p1.GetY(), p2.GetX(), p2.GetY());
    }
}