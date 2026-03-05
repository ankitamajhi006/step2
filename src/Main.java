/**
 * Book My Stay App - Use Case 1
 *
 * This class is the starting point of the Book My Stay Hotel Booking system.
 * It welcomes the user, displays the application name and version, and
 * gives a friendly introduction to the service.
 *
 * Key Concepts Covered:
 * - Class and main() method as program entry point
 * - Static keyword usage
 * - Console output with System.out.println()
 * - JavaDoc for clear documentation
 *
 * Author: Student
 * Version: 1.0
 */
public class UseCase1HotelBookingApp {

    /**
     * Main method: JVM starts execution from here.
     *
     * @param args command-line arguments (not used in this use case)
     */
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("  Welcome to Book My Stay!               ");
        System.out.println("  Your hassle-free hotel booking app     ");
        System.out.println("  Version: 1.0                           ");
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("We're thrilled to have you here. Let's make your hotel booking experience simple and smooth!");
        System.out.println("Sit back, relax, and explore the best stays around you.");
    }
}
/**
 * Book My Stay App - Use Case 2
 *
 * This class demonstrates basic room types and their static availability.
 * It introduces object-oriented concepts: abstraction, inheritance, polymorphism,
 * and encapsulation in a hotel booking context.
 *
 * Key Concepts:
 * - Abstract class Room with common attributes
 * - Concrete room classes (SingleRoom, DoubleRoom, SuiteRoom)
 * - Polymorphism: handling different room types uniformly
 * - Encapsulation of room details
 * - Static availability stored in variables
 *
 * Version: 2.1
 */
public class UseCase2RoomInitialization {

    public static void main(String[] args) {
        System.out.println("=== Welcome to Book My Stay App (v2.1) ===\n");

        // Static availability variables
        int availableSingleRooms = 5;
        int availableDoubleRooms = 3;
        int availableSuites = 2;

        // Initialize room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Display room details and availability
        displayRoomInfo(single, availableSingleRooms);
        displayRoomInfo(doubleRoom, availableDoubleRooms);
        displayRoomInfo(suite, availableSuites);
    }

    /**
     * Helper method to print room details and availability
     */
    private static void displayRoomInfo(Room room, int available) {
        System.out.println(room.getRoomType() + " Details:");
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Size: " + room.getSize() + " sqm");
        System.out.println("Price per night: $" + room.getPrice());
        System.out.println("Available: " + available + " rooms\n");
    }
}

/**
 * Abstract Room class defining common attributes
 */
abstract class Room {
    private int numberOfBeds;
    private int size; // in square meters
    private double price;

    public Room(int numberOfBeds, int size, double price) {
        this.numberOfBeds = numberOfBeds;
        this.size = size;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getRoomType();
}

/**
 * Single Room
 */
class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 20, 50.0);
    }

    @Override
    public String getRoomType() {
        return "Single Room";
    }
}

/**
 * Double Room
 */
class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 30, 80.0);
    }

    @Override
    public String getRoomType() {
        return "Double Room";
    }
}

/**
 * Suite Room
 */
class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 50, 150.0);
    }

    @Override
    public String getRoomType() {
        return "Suite Room";
    }
}