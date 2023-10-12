package home.hw7;

public class hw7 {
    public static void main(String[] args){
        int[] value = new int[10];
        for(int i = 0; i < 10; i++){
            value[i] = (int)((Math.random()*1_000));
        }
        int count = 0;
        for(int j = 0; j < value.length; j++){
            count += value[j];
        }

        System.out.printf("길이가 10개인 정수형 배열 요소의 값들의 합은 %d 이고, 평균은 %.1f입니다.",count,(double)count / 3);
    }    
}
