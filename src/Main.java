/**
 * Created by Lenovo on 18.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Boss oskar = new Boss("Oskar", "8483124213", 1200, true);


        oskar.getVoice();
        oskar.screamOnEmployee();
        System.out.println(oskar.isHappy());

        CoBoss marta = new CoBoss("Marta", "1241232", 1200, false);
        System.out.println(marta.isHappy());


        Lecturer irek = new Lecturer("Irek", "12321312421", 5000);
        irek.connectMicrophone();
        irek.startRecording();

        IWebinars[] personWhoCanDoWebinars = {irek};
    }
}
