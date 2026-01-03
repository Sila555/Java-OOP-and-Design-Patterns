public class SesSistemi{
    private int seviye=50;
    private boolean mute=false;
    public void volumeUp(){
        seviye+=10;
        System.out.println("ses arttırılıyor.Yeni seviye:"+seviye);
    }
    public void volumeDown(){
        seviye-=10;
        System.out.println("ses kısılıyor.Yeni seviye:"+seviye);
    }

    public void setVolume(int seviye) {
        this.seviye =seviye;
    }
    public int getVolume(){
        return seviye;

    }
}