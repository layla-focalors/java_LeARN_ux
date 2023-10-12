package day03;

public class orv {
    public static void main(String[] args){
        Derived child = new Derived();
        // Derived 인스턴스 생성 후 Derivied 생성자 호출
        System.out.println("Child.getDerivedValue( ) : " + child.getDerivedValue());
        // Derived 인스턴스의 GetDerividValue호출
        System.out.println("child.getBaseValue( ) : " + child.getBaseValue());
        // Derivied 인스턴스에서 상속 받은 get base value 호출

        // Drivied 인스턴스를 통해 Base, Derivied의 멤버 변수를 수정
        child.base_value = 9_000;
        child.derived_value = 7_000;

        // 값 확인을 위한 재호출
        System.out.println("Child.getDerivedValue( ) : " + child.getDerivedValue());
        System.out.println("child.getBaseValue() : " + child.getBaseValue());

        // 기존처럼 base만 따로 인스턴스화 할 수 있다
        Base parent = new Base();
        // Base 인스턴스에서 상속받은 getbasevalue메서드 호출
        System.out. print("parent. getbasevalue() : " + parent.getBaseValue());
        return;
    }
}
class Base{
    int base_value; // base 클래스의 멤버 변수
    Base(){ // 매개변수가 없는 base 클래스 생성자 정의
        this.base_value = 100;
        // base value를 초기화
    }
    int getBaseValue(){
        return this.base_value;
    }
}
// extends : 상속
// CLASS 이름 extends 상속할 메소드 
class Derived extends Base {
    // extends 키워드를 사용하여, base 클래스의 상속을 명시
    // 앞으로 derived 인스턴스는 무조건 base 인스턴스를 상속받음
    int derived_value; // Derivied 클래스의 멤버 변수
    Derived(){ // 매개변수가 없는 Derived 클래스 생성자 정의
        this.derived_value = 200;
        // 200으로 초기화
    }
    int getDerivedValue(){ // 클래스의 멤버 메서드
        return this.derived_value;
        // base 클래스의 멤버 변수의 값을 반환
    }
}

/*
 *  Child.getDerivedValue( ) : 200
    child.getBaseValue( ) : 100
    Child.getDerivedValue( ) : 7000
    child.getBaseValue() : 9000
    parent. getbasevalue() : 100
 */