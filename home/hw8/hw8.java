package home.hw8;

public class hw8 {
    public static void main(String[] args){
        double values[][] = {{1.5, 2.4, 85.5, 1.5},{33.5, 77.9}, {1.9, 7.7, 11.11}, {8.99}};
        for(int i=0; i < 4; i++){
            for(int j=0; j < values[i].length; j++){
                System.out.printf("%d행 %d열 : %.1f\n", i, j, values[i][j]);
            }
            if(i != 3){
                System.out.print("---\n");
            }
        }
    }
}
