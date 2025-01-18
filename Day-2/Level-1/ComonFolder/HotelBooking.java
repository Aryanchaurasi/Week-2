public class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() 
    {
        guestName="Aryan";
        nights=19;
        roomType="Deluxe";
    }

    // Parameterized constructor
    public HotelBooking(String guestName, int nights, String roomType) {
        this.guestName = guestName;
        this.nights = nights;
        this.roomType = roomType;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.nights = other.nights;
        this.roomType = other.roomType;
    }
    
    
    public void display() {
        System.out.println( "Guest  name='" + guestName + " and  nights= " + nights + " with roomType= " + roomType );
    }

    // Main method to demonstrate the copy constructor
    public static void main(String[] args) 
    {
        HotelBooking original = new HotelBooking("Aryan", 20, "Deluxe");
        HotelBooking clone = new HotelBooking(original);
        System.out.println("this is the orignal parameterised constructor");
        original.display();
        System.out.println("this is the clone of  parameterised constructor or copy constructor");
        clone.display();
    }
}
