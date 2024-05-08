package service.intef;

import model.guest.Staff;

import java.util.List;

public interface StaffService extends Service {
    List findAll();
    void addNewStaff();
    void updateStaff() ;
    void deleteStaff() ;
    void searchStaff() ;
    Staff inputStaffInfo() ;
    void sortIDStaff() ;
}
