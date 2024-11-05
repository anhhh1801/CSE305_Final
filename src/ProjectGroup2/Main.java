/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGroup2;

import java.util.Scanner;

/**
 *
 * @author nhanv
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PhoneManager manager = new PhoneManager();
        for (int i = 0;i<2; i++) {
            String id = scan.next();
            String name = scan.next();
            String type = scan.next();
            String publisher = scan.next();
            String RAM = scan.next();
            String color = scan.next();
            float price = scan.nextFloat();
            Phone phone = new Phone(id, name, type, publisher, RAM, color, price);
            manager.addPhone(phone);
            System.out.println(manager.calTo());
            
        }
    }
}
