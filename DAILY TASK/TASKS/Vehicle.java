 public class Vehicle
{
   public void start()
   {
        System.out.println("The vehicle ");
   }

    class Car extends Vehicle {
    public void start() {
        System.out.println("The car is Ferrari");
    }
    }

    class Bike extends Vehicle {
    public void start() {
        System.out.println("The bike is BMW");
    }
}

    public class Main {
        public static void main(String[] args) {
       Car c=new Car();
       c.start();

       Bike b=new Bike();
       b.start();
        }
    }
}
