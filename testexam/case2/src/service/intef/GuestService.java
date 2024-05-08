package service.intef;

import model.guest.Guest;

import java.util.List;

public interface GuestService extends Service{
    List findAll();
    void addGuest();
    void updateGuest(String GuestID);
    Guest GuestInfo();

}
