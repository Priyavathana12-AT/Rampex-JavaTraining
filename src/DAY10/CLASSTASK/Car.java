package DAY10.CLASSTASK;

public class Car {
    String brand;
    String model;
    String color;

    public void drive() {
        System.out.println("Driving");
    }

    public static void main(String[] args) {
        Car C1 = new Car();
        C1.drive();
    }
}