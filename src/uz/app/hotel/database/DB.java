package uz.app.hotel.database;

import uz.app.hotel.entity.*;
import uz.app.hotel.service.AdminService;
import uz.app.hotel.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private List<User> users = new ArrayList<>();
    private User currentUser;
    private List<Hotel> hotels = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    private static DB db;
    public static DB getInstance(){
        if (db == null)
            db=new DB();
        return db;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
