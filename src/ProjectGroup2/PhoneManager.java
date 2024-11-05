/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGroup2;

import java.util.ArrayList;

/**
 *
 * @author nhanv
 */
public class PhoneManager {

    private ArrayList<Phone> listPhone;
    private Phone phone;
    private int numOfPhone;

    public PhoneManager() {
        listPhone = new ArrayList<>();
        phone = new Phone();
        numOfPhone = 0;
    }

    public boolean addPhone(Phone phone) {
        if (listPhone != null) {
            listPhone.add(phone);
            numOfPhone++;
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Phone> getListPhone() {
        return listPhone;
    }

    public Phone findPhoneByPublisher(String Publisher) {
        for (Phone phone : listPhone) {
            if (phone.getPublisher().contains(Publisher)) {
                return phone;
            }
        }
        return null;
    }

    public Phone findPhoneByType(String type) {
        for (Phone phone : listPhone) {
            if (phone.getType().contains(type)) {
                return phone;
            }
        }
        return null;
    }

    public Phone findPhoneByColor(String color) {
        for (Phone phone : listPhone) {
            if (phone.getType().contains(color)) {
                return phone;
            }
        }
        return null;
    }

    public Phone findPhoneByRam(String ram) {
        for (Phone phone : listPhone) {
            if (phone.getRAM().contains(ram)) {
                return phone;
            }
        }
        return null;
    }
    
    public float calTo () {
        float total =0;
        ArrayList<Phone> list = getListPhone();
        for(Phone phone:list) {
            total+=phone.getPrice();
        }
        return total;
    }
    
    public ArrayList<Phone> isCheckList (ArrayList<Phone> list)
    {
        ArrayList <Phone> listBuy = new ArrayList<>();
        for(int i =0; i<listPhone.size();i++)
        {
            Phone temp = listPhone.get(i);
            if(temp.isCheck())
            {
                listBuy.add(temp);
            }
        }
        return listBuy;
    }
    
}
