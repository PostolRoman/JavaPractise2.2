class HotelRoomBuilder {
    private String roomNumber;
    private String roomType;
    private boolean isAvailable;
    private double pricePerNight;
    private String roomView;

    public HotelRoomBuilder() {

        this.roomNumber = "000";
        this.roomType = "Standard";
        this.isAvailable = true;
        this.pricePerNight = 100.0;
        this.roomView = "City View";
    }

    public HotelRoomBuilder setBasicInfo(String roomNumber, String roomType, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        return this;
    }

    public HotelRoomBuilder setPrice(double pricePerNight) {
        this.pricePerNight = pricePerNight;
        return this;
    }

    public HotelRoomBuilder setRoomView(String roomView) {
        this.roomView = roomView;
        return this;
    }

    public HotelRoom build() {
        return new HotelRoom(roomNumber, roomType, isAvailable, pricePerNight, roomView);
    }
}
