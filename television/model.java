package television;

public class model {
    public static void main(String[] args){
        Remote rm = new Remote("green", 1);
        rm.getStatus();
    }
}
class TV{
    static int width = 1280;
    static int height = 720;
    String Color;
    int volumn;
    int channel;
    
    void SetVolume(int _vol){
        this.volumn = _vol;
    }
    void SetColor(String _color){
        this.Color = _color;
    }
    void SetChannel(int _channel){
        this.channel = _channel;
    }
    
    int Getvolums(){
        return this.volumn;
    }
    String Getcolor(){
        return this.Color;
    }
    int GetChannel(){
        int x = this.channel;
        return x;
    }
}
class Remote{
    TV tv1 = new TV();
    TV tv2 = new TV();

    Remote(String color, int channel){
        TV tv1 = new TV();
        tv1.Color = color;
        tv1.channel = channel;
    }
    void getStatus(){
        System.out.println("tv는 현재, " + tv1.Getcolor() + tv1.GetChannel());
    }
}