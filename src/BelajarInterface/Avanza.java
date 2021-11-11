package BelajarInterface;

public class Avanza implements Mobil{
    @Override
    public void drive() {
        System.out.println("wah mantap jiwa bos");

    }

    @Override
    public int getTire() {
        return 4;
    }
}
