package uz.app.hotel.service_class;

import uz.app.hotel.database.DB;
import uz.app.hotel.entity.Hotel;
import uz.app.hotel.entity.Reservation;
import uz.app.hotel.entity.Room;
import uz.app.hotel.service.UserService;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

import static uz.app.hotel.Utill.Utill.*;

public class UserClass implements UserService {
        DB db = DB.getInstance();
    @Override
    public void service() {
            switch (menu()){
                case 0 ->{
                    System.out.println("See you soon!");
                    return;
                }
                case 1 ->{
                    showHotels();
                }
                case 2 ->{
                    showReservations();
                }
                case 3 ->{
                    reserve();
                }
                case 4 ->{
                    cancelReservation();
                }
                case 5 -> {
                    rescheduleReservation();
                }
                case 6 ->{
                    showHistory();
                }

    }
    }
    public int menu(){
        System.out.println("""
                0 -> exit
                1 -> Show Hotels
                2 -> Show Reservations
                3 -> Reserve room
                4 -> Cancel reservation
                5 -> reschedule Reservation
                6 -> Show history
                """);
        return intScanner.nextInt();
    }

    @Override
    public void showHotels() {
        for (Hotel hotel : db.getHotels()) {
            System.out.println(hotel);
        }

    }

    @Override
    public void showReservations() {
        for (Hotel hotel : db.getHotels()) {
            for (Room room : hotel.getRooms()) {
                for (Reservation reservation : room.getReservations()) {
                    System.out.println(reservation);
                }
            }
        }

    }

    @Override
    public void reserve() {
        System.out.println("choose hotel");
        showHotels();
        System.out.println("enter id");
        String id = strScanner.nextLine();
        for (Hotel hotel : db.getHotels()) {
            if (Objects.equals(hotel.getId().toString(),id)){
                db.setCurrentHotel(hotel);
                break;
            }
        }
        int l = 1;
        for (Room room : db.getCurrentHotel().getRooms()) {
            System.out.println(l++ + " " + room);
        }
        System.out.println("choose room");
        int choice = intScanner.nextInt();
        Room room = db.getCurrentHotel().getRooms().get(choice - 1);
        System.out.println("enter start date(yyyy-mm-dd)");
        String start = strScanner.nextLine();
        LocalDate localDate = LocalDate.parse(start);
        System.out.println("enter end date(yyyy-mm-dd)");
        String end = strScanner.nextLine();
        LocalDate localDateEnd = LocalDate.parse(end);
        //room.setReservations(room.getReservations().add(db.getCurrentUser(),db.getCurrentHotel(), localDate, localDateEnd));
    }

    @Override
    public void cancelReservation() {

    }

    @Override
    public void rescheduleReservation() {

    }

    @Override
    public void showHistory() {

    }
}
