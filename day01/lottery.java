package day01;

public class lottery {
    public static void main(String[] args){
        // 반환하는 타입이 Lotto 인스턴스이기에 Lotto 참조 변수로 받는다
        Lotto my_lot = lottomanager.createLottery();
        my_lot.printLotteryInfo();
        return;
    }
}
class lottomanager{
    static Lotto createLottery(){ // 메소드의 출력 타입 : lotto
        Lotto lot = new Lotto();
        lot.setLotteryNumber((int)(Math.random() * 100), (int)(Math.random() * 100));
        return lot;
    }
}
class Lotto {
    int lottery_number;
    int create_area_code;
    void setLotteryNumber(int l_num, int area){
        lottery_number = l_num;
        create_area_code = area;
        return;
    }
    void printLotteryInfo() {
        System.out.println("복권 번호 : " + lottery_number);
        System.out.println("복권 발행 지역 : " + create_area_code);
    }
}
