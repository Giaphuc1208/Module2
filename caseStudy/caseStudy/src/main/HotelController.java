package main;

import compositional.Booking;
import compositional.Guest;
import room.Room;

import java.util.ArrayList;
import java.util.List;

public class HotelController {
    private List<Guest> guests;

    public HotelController() {
        guests = new ArrayList<>();
    }

    public void add(Guest guest) {
        this.guests.add(guest);
    }

    public boolean delete(String passport) {
        Guest person = this.guests.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return false;
        } else {
            this.guests.remove(person);
            return true;
        }
    }

    public int calculator(String passport) {
        Guest guest = this.guests.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (guest == null) {
            return 0;
        }
        return guest.getRoom().getPrice() * guest.getNumberRent();
    }

    public void show() {
        this.guests.forEach(p -> System.out.println(p.toString()));
    }

    public void bubbleSort() {
        int n = guests.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (guests.get(j).getPassport().compareTo(guests.get(j + 1).getPassport()) > 0) {
                    Guest temp = guests.get(j);
                    guests.set(j, guests.get(j + 1));
                    guests.set(j + 1, temp);
                }
            }
        }
    }
}