class HotelRoom {
    private String roomNumber;
    private String roomType;
    private boolean isAvailable;
    private double pricePerNight;
    private String roomView;


    public HotelRoom(String roomNumber, String roomType, boolean isAvailable, double pricePerNight, String roomView) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.pricePerNight = pricePerNight;
        this.roomView = roomView;
    }


    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public String getRoomView() {
        return roomView;
    }
}
