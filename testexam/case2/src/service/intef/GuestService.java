package service.intef;

import model.guest.Guest;

import java.util.List;

public interface GuestService extends Service{

    void addGuest();
    void updateGuest(String GuestID);
    Guest GuestInfo();

}
