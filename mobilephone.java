
public class mobilephone {

    // Attributes
    private String brand;
    private String model;
    private float screenSize;
    private String os;
    private int camReso;

    // Object attributes
    private SimCard simCard;
    private Ram ram;
    private Processor processor;

    // Constructor
    public MobilePhone(String brand, String model,
                       float screenSize, String os, int camReso,
                       SimCard simCard, Ram ram, Processor processor) {

        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
        this.camReso = camReso;

        this.simCard = simCard;
        this.ram = ram;
        this.processor = processor;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public String getOs() {
        return os;
    }

    public int getCamReso() {
        return camReso;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public Ram getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setCamReso(int camReso) {
        this.camReso = camReso;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    // Calculate perform
    public double performance() {
        return processor.getFrequency() * ram.getCapacity();
    }

    // Compare two phons
    public int compare(MobilePhone c) {
        return Double.compare(
            this.performance(),
            c.performance()
        );
    }

    // Display phone infos
    public void displayInfo() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Operating System: " + os);
        System.out.println("Camera Resolution: " + camReso + " MP");

        System.out.println("SIM ID: " + simCard.getSim_id());
        System.out.println("SIM Number: " + simCard.getNumber());

        System.out.println("RAM Capacity: " + ram.getCapacity() + " GB");
        System.out.println("RAM Frequency: " + ram.getFrequency());

        System.out.println("Processor: " + processor.getModel());
        System.out.println("Processor Frequency: "
                           + processor.getFrequency() + " GHz");

        System.out.println("Performance: " + performance());
    }
}
