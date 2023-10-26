package 스텔라론_;

public class 레일라 {
    public static void main(String[] args){
        Circle cr = new Circle(30, 30, 5, "Green");
        cr.showCircleInfo();
        Circle cr2 = new Circle(10, 5, 200, "Layla");
        cr2.showCircleInfo();
    }
}
class Point{
    int x;
    int y;
    int Getx(){
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
    int round;
    Circle(int _x, int _y, int _r, String _color){
        p1 = new Point();
        p1.SetX(_x); p1.SetY(_y); this.round = _r;
        this.color = _color;
    }
    void showCircleInfo(){
        System.out.printf("해당 도형의 색은 %s이며, 도형의 넓이는 %d파이이고, 원의 중심 위치는 (%d,%d)이며, 반지름 길이는 %dCM 입니다.\n", 
        this.color, this.round * this.round, p1.Getx(), p1.GetY(), this.round);
    }
}
