package Rss;

public class b9 {
    public static void main(String[] args){
        int a = 1;
        int b2 = 2;
        int c = 1000;
        b9 b = new b9();
        b.add(a, b2);
        b.add(a, b2, c);

    }
    
    private void sum(int a, int b2) {
    }

    void add(int a, int b){
        System.out.println(a + b);
    }
    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    void add(float a, float b){
        System.out.println(a + b);
    }
}
