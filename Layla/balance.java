package Layla;

public class balance {
    public static void main(String[] args){
        // 가변 배열 테스트하기
        int score[][] = {
            {100, 100, 100, 100, 100, 100, 100},
            {99, 99, 100, 199, 19, 13, 18},
            {281, 11, 11},
            {281, 11, 11, 11}
        };
        // 출력하기
        int sum = 0;
        for(int i = 0; i < score.length; i ++){
            for(int j = 0; j < score[i].length; j++){
                // System.out.print(score[i][j]);
                sum += score[i][j];
            }
            System.out.printf("%dteams, sum = %d, mean : %d.\n",
            i + 1, sum, (int)(sum / score.length));
        }
    }
}
