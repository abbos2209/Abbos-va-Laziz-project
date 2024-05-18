package uz.app.hotel.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Room {
        private Integer roomNumber;
        private Integer floor;
        private List<Reservation> reservations = new ArrayList<>();

        public Integer getRoomNumber() {
                return roomNumber;
        }

        public void setRoomNumber(Integer roomNumber) {
                this.roomNumber = roomNumber;
        }

        public Integer getFloor() {
                return floor;
        }

        public void setFloor(Integer floor) {
                this.floor = floor;
        }

        public List<Reservation> getReservations() {
                return reservations;
        }

        public void setReservations(List<Reservation> reservations) {
                this.reservations = reservations;
        }

        @Override
        public String toString() {
                return "Room{" +
                        "roomNumber=" + roomNumber +
                        ", floor=" + floor +
                        ", reservations=" + reservations +
                        '}';
        }
}
