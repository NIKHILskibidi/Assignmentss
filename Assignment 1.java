class SmartDevice {
    private String deviceName;

    // Constructor
    SmartDevice(String name) {
        this.deviceName = name;
        System.out.println(deviceName + " connected to the network.");
    }

    // finalize method to simulate cleanup
    @Override
    protected void finalize() {
        System.out.println(deviceName + " disconnected from the network (cleanup done).");
    }
}

public class FinalizeDemo {
    public static void main(String[] args) {
        // Creating devices
        SmartDevice d1 = new SmartDevice("Smart Light");
        SmartDevice d2 = new SmartDevice("Smart Fan");

        // Making objects eligible for GC
        d1 = null;
        d2 = null;

        // Requesting garbage collection
        System.gc();

        System.out.println("Main method completed.");
    }
}
