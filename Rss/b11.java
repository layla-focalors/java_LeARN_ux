package Rss;

public class b11 {
    public static void main(String[] args){
        Crayon cr = new Crayon(10, "bluepink", "Layla");
        cr.show_cr();
    }
}
class Crayon{
    int length;
    String color;
    String owner;
    Crayon(int x, String color, String owner){
        this.length = x; this.color = color; this.owner = owner;
    }
    void show_cr(){
        System.out.printf("크레용의 색 %s, 크레용의 주인 %s, 크레용의 길이 %d", this.color, this.owner, this.length);
    }
}
