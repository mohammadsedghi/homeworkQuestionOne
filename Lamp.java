package questionone;

public class Lamp implements Turner{
    @Override
    public void turn() {
        System.out.println("turn ON/OFF lamp");
    }
}
