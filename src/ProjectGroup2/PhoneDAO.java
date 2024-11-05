/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGroup2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhanv
 */
public interface PhoneDAO {
    ArrayList<Phone> readDataFromFile(String fileName);
    boolean writeDataToFile(ArrayList<Phone> listPhone, String fileName);
}
