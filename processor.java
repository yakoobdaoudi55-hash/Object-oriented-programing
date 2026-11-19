

package ex3;

public class Processor {

    // Attributes
    private String model;
    private double frequency;

    // Constructor
    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
