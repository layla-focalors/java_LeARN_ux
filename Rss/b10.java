package Rss;

public class b10 {
    public static void main(String[] args){
        Manager mm = new Manager(10, "bluepink", "Layla");
        mm.show_crayon();
    }
}
class Crayon{
    int crayon_length;
    String crayon_color;
    String owner;

    void set_cl(int _x){
        this.crayon_length = _x;
    }
    void set_color(String color){
        this.crayon_color = color;
    }
    void set_owner(String owne){
        this.owner = owne;
    }
    int crayon_length(){
        return this.crayon_length;
    }
    String crayon_owner(){
        return this.crayon_owner();
    }
    String crayon_color(){
        return this.crayon_color;
    }
}
class Manager{
    Crayon c1;
    Manager(int length, String color, String owner){
        c1 = new Crayon();
        c1.set_cl(length); c1.set_color(color); c1.set_owner(owner);
    }
    void show_crayon(){
        System.out.printf("크레용의 색 : %s, 크레용의 길이 %d, 크레용의 주인 %s", 
        c1.crayon_color, c1.crayon_length, c1.owner);
    }
}