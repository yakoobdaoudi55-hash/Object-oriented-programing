
public class mainc {

    public static void main(String[] args) {

        MobilePhone phone1 = new MobilePhone(
            "Samsung",
            "S24",
            6.2f,
            "Android",
            50,
            new SimCard(1, "0550000001"),
            new Ram(8, 3.0),
            new Processor("Snapdragon 8 Gen 3", 3.2)
        );

        MobilePhone phone2 = new MobilePhone(
            "Apple",
            "iPhone 15 Pro",
            6.1f,
            "iOS",
            48,
            new SimCard(2, "0550000002"),
            new Ram(8, 3.5),
            new Processor("A17 Pro", 3.8)
        );

        MobilePhone phone3 = new MobilePhone(
            "Xiaomi",
            "14",
            6.36f,
            "Android",
            50,
            new SimCard(3, "0550000003"),
            new Ram(12, 3.2),
            new Processor("Snapdragon 8 Gen 3", 3.3)
        );

        // Store phones 
        MobilePhone[] phones = {
            phone1, phone2, phone3
        };

        //  Display
        for (int i = 0; i < phones.length; i++) {
            System.out.println("\nPhone " + (i + 1));
            phones[i].displayInfo();
        }

        //  Display performance
        System.out.println("\n===== PERFORMANCE =====");

        for (int i = 0; i < phones.length; i++) {
            System.out.println(
                phones[i].getBrand() + " " +
                phones[i].getModel() + " : " +
                phones[i].performance()
            );
        }

        //  Find phone with best camera
        MobilePhone bestCamera = phones[0];

        for (int i = 1; i < phones.length; i++) {

            if (phones[i].getCamReso() >
                bestCamera.getCamReso()) {

                bestCamera = phones[i];
            }
        }

        System.out.println("\nBEST CAMERA ");

        bestCamera.displayInfo();

        // Sort phones by performance ascending)
        for (int i = 0; i < phones.length - 1; i++) {

            for (int j = 0; j < phones.length - 1 - i; j++) {

                if (phones[j].compare(phones[j + 1]) > 0) {

                    MobilePhone temp = phones[j];

                    phones[j] = phones[j + 1];

                    phones[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < phones.length; i++) {

            System.out.println(
                phones[i].getBrand() + " " +
                phones[i].getModel() +
                " : " + phones[i].performance()
            );
        }
    }
}
