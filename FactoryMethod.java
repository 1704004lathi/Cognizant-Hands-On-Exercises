package file.scs;

interface Car {
    void drive();
}


class Sedan implements Car {
    public void drive() {
        System.out.println("Driving a Sedan...");
    }
}

class SUV implements Car {
    public void drive() {
        System.out.println("Driving an SUV...");
    }
}

class Hatchback implements Car {
    public void drive() {
        System.out.println("Driving a Hatchback...");
    }
}

class CarFactory {
    public Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            case "hatchback":
                return new Hatchback();
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}


public class FactoryMethod {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car car1 = factory.createCar("sedan");
        car1.drive();

        Car car2 = factory.createCar("suv");
        car2.drive();

        Car car3 = factory.createCar("hatchback");
        car3.drive();
    }
}
