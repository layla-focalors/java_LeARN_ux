package Layla;

public class elisia {
    public static void main(String[] args){
        final int RAMDOM_NUMBER = (int)(Math.random() * 10000);
        if(RAMDOM_NUMBER % 2 == 0){
            System.out.print("jajak su");
        }
        else {
            System.out.println("hoholsu");
        }
        switch(RAMDOM_NUMBER % 2){
            case 1:
                System.out.print("Layla cute");
                break;
            case 0:
                System.out.print("molllusu");
                break;
            default:
                System.out.print("nugu sae yo?");
                break;
        }
    }
}
