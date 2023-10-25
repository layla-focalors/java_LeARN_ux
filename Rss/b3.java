package Rss;

public class b3 {
    public static void main(String[] args){
        // 오버플로우 테스트.
        byte b = 127;
        System.out.print((byte)(b + 1));
        byte c = -128;
        System.out.println((byte)(c - 1));

        short short_min = -32768;
        System.out.println((short)(short_min - 1));
    }
}
