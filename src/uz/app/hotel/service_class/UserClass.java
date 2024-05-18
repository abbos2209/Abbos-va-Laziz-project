package uz.app.hotel.service_class;

import uz.app.hotel.database.DB;
import uz.app.hotel.service.UserService;
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

    }

    @Override
    public void showReservations() {

    }

    @Override
    public void reserve() {

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
