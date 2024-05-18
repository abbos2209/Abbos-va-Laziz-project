package uz.app.hotel.service_class;

import uz.app.hotel.service.AdminService;

public class AdminClass implements AdminService {


    @Override
    public void service() {

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
                8 -> Cancel Reservation
                9 -> Reserve For User
                """);
        return
    }

    @Override
    public void addHotel() {

    }

    @Override
    public void showHotel() {

    }

    @Override
    public void showHotels() {

    }

    @Override
    public void editHotel() {

    }

    @Override
    public void deleteHotel() {

    }

    @Override
    public void showUsers() {

    }

    @Override
    public void showReservationHistory() {

    }

    @Override
    public void calcelReservation() {

    }

    @Override
    public void reserveForUser() {

    }
}
