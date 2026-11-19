
public class MobilePhone {

    private String model;
    private String brand;
    private float screenSize;
    private String os;
    private int camreso;

    private Ram ram;
    private Processor processor;
    private SimCard simcard;

    // Constructor
    public MobilePhone(String model, String brand,
                      float screenSize, String os,
                      int camreso) {

        this.model = model;
        this.brand = brand;
        this.screenSize = screenSize;
        this.os = os;
        this.camreso = camreso;
    }

    // Setters and Getters

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setCamreso(int camreso) {
        this.camreso = camreso;
    }

    public int getCamreso() {
        return camreso;
    }

    // Performance
    public double performance() {
        return processor.getFre() * ram.getCap();
    }

    // Compare two mobile phones
    public int compareTo(MobilePhone other) {
        return Double.compare(
            this.performance(),
            other.performance()
        );
    }

    // Display information
    public void displayInfo() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("OS: " + os);
        System.out.println("Camera Resolution: " + camreso);

        System.out.println("Performance: " + performance());
    }
}
