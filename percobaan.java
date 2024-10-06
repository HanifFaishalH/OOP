import java.util.UUID;

public class percobaan {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        
        System.out.println("Generated UUID: " + uuid.toString());

        // Convert UUID to String
        String uuidString = uuid.toString();
        System.out.println("UUID as String: " + uuidString);

        // Parse a UUID from a String
        UUID parsedUUID = UUID.fromString(uuidString);
        System.out.println("Parsed UUID: " + parsedUUID.toString());

        // Check if two UUIDs are equal
        UUID anotherUUID = UUID.randomUUID();
        System.out.println("Another UUID: " + anotherUUID.toString());
        System.out.println("Are the two UUIDs equal? " + uuid.equals(anotherUUID));
    }
}