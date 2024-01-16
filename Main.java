public class Main {
    public static void main(String[] args) {
        Two myCar = new Two("Toyota", 2022, "Automatic Transmission");

        System.out.println("Car Model: " + myCar.getCarModel());
        System.out.println("Car Year: " + myCar.getCarYear());
        System.out.println("Additional Feature: " + myCar.getAdditionalFeature());
    }

}