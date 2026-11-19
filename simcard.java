



public class SimCard {

    // Attributes
    private int sim_id;
    private String number;

    // Constructor
    public SimCard(int sim_id, String number) {
        this.sim_id = sim_id;
        this.number = number;
    }

    // Getters
    public int getSim_id() {
        return sim_id;
    }

    public String getNumber() {
        return number;
    }

    // Setters
    public void setSim_id(int sim_id) {
        this.sim_id = sim_id;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
