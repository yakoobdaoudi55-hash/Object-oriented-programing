
public class Processor {

    private int model;
    private double frequency;

    // Constructor
    public Processor(int model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    // Setter model
    public void setModel(int model) {
        this.model = model;
    }

    // Getter model
    public int getModel() {
        return model;
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
