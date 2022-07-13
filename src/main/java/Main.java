public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.println("Managing Hotel");
        HotelRoomInterface hotelRoom1 = new HotelRoom();
        HotelRoomInterface hotelRoom2 = new HotelRoom();
        HotelFloor hotelFloor1 = new HotelFloor();
        hotelFloor1.addHotelRoom(hotelRoom1);
        hotelFloor1.addHotelRoom(hotelRoom2);
        hotelFloor1.book("Juan");
        hotelFloor1.clean();
        hotelFloor1.removeHotelRoom(hotelRoom2);
        hotelFloor1.book("Susan");
        hotelFloor1.clean();


    }
}
