<<<<<<< HEAD
class Vehicle {
    void start() {
        System.out.println("VEHICLE");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("The car");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("The bike");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();
        vehicle1.start();
        vehicle2.start();
    }
}
=======
class Vehicle {
    void start() {
        System.out.println("VEHICLE");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("The car");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("The bike");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();
        vehicle1.start();
        vehicle2.start();
    }
}
>>>>>>> d4b784a1a2afeb66c2a26fd79cea05049f33afe4
