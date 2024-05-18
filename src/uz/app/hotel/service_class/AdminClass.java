package uz.app.hotel.service_class;

import uz.app.hotel.database.DB;
import uz.app.hotel.entity.*;
import uz.app.hotel.service.AdminService;

import java.util.Objects;

import static uz.app.hotel.Utill.Utill.*;

public class AdminClass implements AdminService {
        DB db = DB.getInstance();
    @Override
    public void service() {
        switch (menu()){
            case 0 ->{
                System.out.println("See you soon!");
                return;
            }
            case 1 ->{
                addHotel();
            }
            case 2 ->{
                showHotel();
            }
            case 3 ->{
                showHotels();
            }
            case 4 ->{
                editHotel();
            }
            case 5 ->{
                deleteHotel();
            }
            case 6->{
                showUsers();
            }
            case 7->{
                showReservationHistory();
            }

        }
    }
    public int menu(){
        System.out.println("""
                0 -> exit
                1 -> Add Hotel
                2 -> Show Hotel
                3 -> Show Hotels
                4 -> Edit Hotel
                5 -> Delete Hotel
                6 -> Show Users
                7 -> Show Reserve history
                """);
        return intScanner.nextInt();
    }

    @Override
    public void addHotel() {
        System.out.println("Enter Hotel name: ");
        String hotelName = strScanner.nextLine();
        System.out.println("Enter Hotel Location(TASHKENT," +
                " NAMANGAN," +
                " BUXORO," +
                " ANDIJON," +
                " XORAZIM;): ");

        String hotelLoc = strScanner.nextLine();
        System.out.println("Enter Hotel floor: ");
        int floor = intScanner.nextInt();
        System.out.println("Enter Hotel RoomCount: ");
        int roomCount = intScanner.nextInt();
        switch (hotelLoc){
            case "TASHKENT"->{
                db.getHotels().add(new Hotel(hotelName, Location.TASHKENT, floor, roomCount));
            }
            case "NAMANGAN"->{
                db.getHotels().add(new Hotel(hotelName, Location.NAMANGAN, floor, roomCount));
            }
            case "BUXORO"->{
                db.getHotels().add(new Hotel(hotelName, Location.BUXORO, floor, roomCount));
            }
            case "ANDIJON"->{
                db.getHotels().add(new Hotel(hotelName, Location.ANDIJON, floor, roomCount));
            }
            case "XORAZIM"->{
                db.getHotels().add(new Hotel(hotelName, Location.XORAZIM, floor, roomCount));
            }
        }
        System.out.println("Hotel added");
    }

    @Override
    public void showHotel() {
        System.out.println("Enter Hotel ID");
        String id = strScanner.nextLine();
        for (Hotel hotel : db.getHotels()) {
            if (Objects.equals(hotel.getId().toString(), id)) {
                System.out.println(hotel);
                break;
            }
        }
    }

    @Override
    public void showHotels() {
        for (Hotel hotel : db.getHotels()) {
            System.out.println(hotel);
        }
    }

    @Override
    public void editHotel() {
        System.out.println("Enter Hotel Id");
        String id = strScanner.nextLine();
        for (Hotel hotel : db.getHotels()) {
            if (Objects.equals(hotel.getId().toString(), id)) {
                System.out.println("Enter Hotel name: ");
                hotel.setName(strScanner.nextLine());
                System.out.println("Enter Hotel Location(TASHKENT," +
                        " NAMANGAN," +
                        " BUXORO," +
                        " ANDIJON," +
                        " XORAZIM;): ");

                String hotelLoc = strScanner.nextLine();
                switch (hotelLoc){
                    case "TASHKENT"->{
                        hotel.setLocation(Location.TASHKENT);
                    }
                    case "NAMANGAN"->{
                        hotel.setLocation(Location.NAMANGAN);
                    }
                    case "BUXORO"->{
                        hotel.setLocation(Location.BUXORO);
                    }
                    case "ANDIJON"->{
                        hotel.setLocation(Location.ANDIJON);
                    }
                    case "XORAZIM"->{
                        hotel.setLocation(Location.XORAZIM);
                    }
                }
                System.out.println("Enter Hotel floors");
                hotel.setFloors(intScanner.nextInt());
                System.out.println("Enter Hotel Rooms: ");
                hotel.setRoomsCount(intScanner.nextInt());
            }
        }
    }

    @Override
    public void deleteHotel() {
        Hotel delHotel = new Hotel();
        System.out.println("Enter Hotel ID");
        String id = strScanner.nextLine();
        for (Hotel hotel : db.getHotels()) {
            if (Objects.equals(hotel.getId().toString(), id)) {
                delHotel =hotel;
                break;
            }
        }
        db.getHotels().remove(delHotel);
    }

    @Override
    public void showUsers() {
        for (User user : db.getUsers()) {
            System.out.println(user);
        }
    }

    @Override
    public void showReservationHistory() {
        for (Hotel hotel : db.getHotels()) {
            for (Room room : hotel.getRooms()) {
                for (Reservation reservation : room.getReservations()) {
                    System.out.println();
                }
            }
        }
    }
}
