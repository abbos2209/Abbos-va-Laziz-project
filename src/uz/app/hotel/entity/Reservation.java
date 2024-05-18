package uz.app.hotel.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Reservation {
    private final String  id= UUID.randomUUID().toString();
    private User user;
    private Hotel hotel;
    private LocalDate startDate;
    private LocalDate endDate;

    public Reservation(User user, Hotel hotel, Integer floor, Integer room, LocalDate startDate, LocalDate endDate) {
        this.user = user;
        this.hotel = hotel;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", hotel=" + hotel +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
