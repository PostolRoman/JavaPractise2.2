public class Main {
    public static void main(String[] args) {

        HotelRoomBuilder builder = new HotelRoomBuilder();
        HotelRoom hotelRoom = builder.setBasicInfo("101", "Deluxe", true)
                .setPrice(250.0)
                .setRoomView("Ocean View")
                .build();

        System.out.println("Room Number: " + hotelRoom.getRoomNumber());
        System.out.println("Room Type: " + hotelRoom.getRoomType());
        System.out.println("Available: " + (hotelRoom.isAvailable() ? "Yes" : "No"));
        System.out.println("Price per Night: $" + hotelRoom.getPricePerNight());
        System.out.println("Room View: " + hotelRoom.getRoomView());
    }
}