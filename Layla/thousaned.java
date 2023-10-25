package Layla;

public class thousaned {
    public static void main(String[] args){
        for(int i=0; i<2; i++){
            for(int j=0; j < 1000; j++){
                if(j==100){
                    System.out.println("j - 100: break");
                    break;
                }
            }
        }
    }
}
