/**
 * Created by Lenovo on 18.07.2017.
 */
public class Boss extends Employee {

    private boolean isHappy;

    public Boss(String name, String id, int salary, boolean isHappy) {
        super(name, id, salary);
        this.isHappy = isHappy;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    @Override
    public void getVoice() {
        System.out.println("Do pracy!! Bo bez pracy nie ma kołaczy!!!");
    }

    public void screamOnEmployee(){
        System.out.println("KRZYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYCZE!");
    }
}
