package service.data;

import model.guest.Staff;

import java.util.Comparator;

public class StaffSortID implements Comparator<Staff> {
    @Override
    public int compare(Staff o1, Staff o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
