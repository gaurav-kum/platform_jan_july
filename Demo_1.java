
class Computer {
    public void playMusic(){
        System.out.println("music playing..");
    }
    public String getMePen(int cost){
        return "pen";
    }
}

public class Demo_1 {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.playMusic();

        String str = com.getMePen(10);
        System.out.println(str);
    }
}
