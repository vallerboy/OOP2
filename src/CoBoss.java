/**
 * Created by Lenovo on 18.07.2017.
 */
public class CoBoss extends Boss {
    public CoBoss(String name, String id, int salary, boolean happines) {
        super(name, id, salary, happines);
    }

    @Override
    public void getVoice() {
        System.out.println("Szefie szefie mamy jeszcze czas na zyski!");
    }
}
