/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGroup2;

/**
 *
 * @author Viet Anh
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class loadData implements PhoneDAO {

    @Override
    public ArrayList<Phone> readDataFromFile(String fileName) {
        ArrayList<Phone> listPhone = new ArrayList<>();
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String id = scanner.nextLine();
                String name = scanner.nextLine();
                String type = scanner.nextLine();
                String publisher = scanner.nextLine();
                String ram = scanner.nextLine();
                String color = scanner.nextLine();
                float price = Float.parseFloat(scanner.nextLine());
                Phone phone = new Phone(id, name, type, publisher, ram, color, price);
                listPhone.add(phone);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return listPhone;
    }

    @Override
    public boolean writeDataToFile(ArrayList<Phone> listPhone, String fileName) {

        return false;
    }

}
