public class HotelRoom implements HotelRoomInterface {
    @Override
    public void book(String guestName) {
        System.out.println("Booked a room for " + guestName);
    }

    @Override
    public void clean() {
        System.out.println("Cleaned Room");
    }
}