package day01;

public class square {
    public static void main(String[] args){
        // 3개의 Rectangle 요소( 참조변수 )를 가지고 있는 배열 생성
        Rectangle[] rect = new Rectangle[3];

        // 각 요소에 Heap 영역에 Rectagle클래스 기반의 인스턴스(객체) 생성후 인스턴스의 참조 값을 rect 배열의 각 요소에 대입
        rect[0] = new Rectangle();
        rect[1] = new Rectangle();

        // 멤버 변수 로드 후 데이터 대입(각각의 요소)
        rect[0].setBeginCoordinate(10, 10);
        rect[0].setEndCoordinate(20, 20);

        rect[1].setBeginCoordinate(10, 20);
        rect[1].setEndCoordinate(70, 70);

        rect[0].printRectangleInfo();
        rect[1].printRectangleInfo();
    }
}

class Rectangle {
    // x1~2, y1~2 좌표를 2개 할당
    int x1, y1, x2, y2;
    
    // 인스턴스 변수
    // 각각의 멤버 함수 ( 메서드 )로 값을 대입하기
    void setBeginCoordinate(int _x1, int _y1){
        x1 = _x1;
        x2 = _y1;
        return;
    }
    // 인자를 받아 끝으로 등록
    void setEndCoordinate(int _x2, int _y2){
        x2 = _x2;
        y2 = _y2;
        return;
    }
    // 출력 메서드
    void printRectangleInfo() {
        System.out.printf("x1 : %d, y1 : %d -> x2 : %d, y2 : %d \n", x1, y1, x2, y2);
        return;
    }
}
