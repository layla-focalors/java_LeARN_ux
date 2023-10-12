package home;

public class apps {
    public static void main(String[] args){
        Rectangle rtg = new Rectangle(10, 10, 30, 30, "whitepink");
        rtg.ShowRectangleinfo();
    } 
}
class Point{
    // 멤버 변수
    int x;
    int y;
    
    // 멤버 메소드
    int getX(){
        // this , 클래스 자기 자신을 나타내는 키워드
        return this.x;
    }
    int getY(){
        return this.y;
    }
    // 반환이 아닌 입력만 하면 됨 -> void
    void SetX(int _x){
        this.x = _x;
    }
    void SetY(int _y){
        this.y = _y;
    }
}
class Rectangle{
    // 멤버 변수
    Point p1;
    Point p2;
    // 참조변수
    // 어떤 것을 참조하기 위한 변수 ( p1, pw )
    String color;

    // 생성자
    // 초기화 역할만 하기 때문에, 반환 x
    Rectangle(int x1, int y1, int x2, int y2, String color){
        // 각각의 인스턴스 생성
        // <div id="두 점의 좌표 세팅 완료.">
        this.p1 = new Point();
        this.p2 = new Point(); 

        p1.SetX(x1); p1.SetY(y1);
        p2.SetX(x2); p2.SetY(y2);
        // </div>
        // this. 자기 자신 안에 있는 멤버변수, 없으면 지역변수
        this.color = color;
    }
    void ShowRectangleinfo(){
        int width = p2.getX() - p1.getX();
        int height = p2.getY() - p1.getY();
        System.out.printf("해당 도형의 색은 %s이며, 도형의 넓이는 %dcm^2 이고, 시작 위치는(%d, %d), 끝 위치는(%d, %d) 입니다.", this.color, width * height,p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
