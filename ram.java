
public class Ram {

    private int capacity;
    private double frequency;

    // Constructor
    public Ram(int capacity, double frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    // Setter capacity
    public void setCap(int capacity) {
        this.capacity = capacity;
    }

    // Getter capacity
    public int getCap() {
        return capacity;
    }

    // Setter frequency
    public void setFre(double frequency) {
        this.frequency = frequency;
    }

    // Getter frequency
    public double getFre() {
        return frequency;
    }

}
