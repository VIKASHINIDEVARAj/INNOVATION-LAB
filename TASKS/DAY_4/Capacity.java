class Battery {
    private int capacity;

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Battery: " + capacity + "mAh";
    }
}

class Mobile {
    private Battery battery;

    public Mobile(int batteryCapacity) {
        this.battery = new Battery(batteryCapacity);
    }

    @Override
    public String toString() {
        return "Mobile with " + battery;
    }
}

public class Capacity{
    public static void main(String[] args) {
        Mobile mobile = new Mobile(5000);
        System.out.println(mobile);
    }
}

