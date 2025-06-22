package file.scs;

public class Singleton {

    // Step 1: Create a private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Make the constructor private so no other class can instantiate it
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public static method to get the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        // Check if both references point to the same object
        System.out.println("Are both instances the same? " + (s1 == s2));
    }
}
