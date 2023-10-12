import java.util.*;

public class hw006 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            System.out.print("소문자 알파벳 하나를 입력 >> ");
            char input = sc.next().charAt(0);
            int loc = 0;
            for(int i = 0; i < alphabet.length; i++){
                if(alphabet[i] == input){
                    loc = i;
                    break;
                }
            }
            for(int i = loc + 1; i > 0; i--){
                for(int j = 0; j < i ; j++){
                    System.out.print(alphabet[j] + " ");
                }
                System.out.print("\n");
            }
        }

    }    
}
