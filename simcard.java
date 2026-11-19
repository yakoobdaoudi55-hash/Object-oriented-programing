
public class SimCard {

    private int simid;
    private String number;

    // Constructor
    public SimCard(int simid, String number) {
        this.simid = simid;
        this.number = number;
    }

    // Setter id
    public void setId(int simid) {
        this.simid = simid;
    }

    // Getter id
    public int getId() {
        return simid;
    }

    // Setter number
    public void setNum(String number) {
        this.number = number;
    }

    // Getter number
    public String getNum() {
        return number;
    }

}
