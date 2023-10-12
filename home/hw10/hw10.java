package home.hw10;

public class hw10 {
    public static void main(String[] args){
        Circle cr = new Circle(30, 30, 5, "GREEN");
        cr.showCircleInfo();
    }    
}
class Point {
    int x;
    int y;
    
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void SetX(int _x){
        this.x = _x;
    }
    void SetY(int _y){
        this.y = _y;
    }
}
class Circle {
    Point x;
    Point y;
    int r;
    String color;

    Circle(int x, int y, int r, String color){
        this.x = new Point();
        this.y = new Point();
        
        this.x.SetX(x);
        this.y.SetY(y);

        this.color = color;
        this.r = r;
    }
    void showCircleInfo(){
        System.out.printf("해당 도형의 색은 %s이며, 도형의 넓이는 %d파이이고, 원의 중심 위치는 (%d, %d)이며, 반지름 길이는 %dcm입니다.", this.color, this.r * this.r, x.getX(), y.getY(), this.r);
    }
} 

