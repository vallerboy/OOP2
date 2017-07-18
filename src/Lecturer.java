/**
 * Created by Lenovo on 18.07.2017.
 */
public class Lecturer extends Employee implements IWebinars{
    public Lecturer(String name, String id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void getVoice() {
        System.out.println("Uczcie się uczcie! Nauka to do potęgi klucz!");
    }

    @Override
    public void connectMicrophone() {
        System.out.println("Podłączono mikrofon");
    }

    @Override
    public void startRecording() {
        System.out.println("Rozpocząłem nagrywanie");
    }
}
