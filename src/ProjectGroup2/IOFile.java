/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGroup2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Viet Anh
 */
public class IOFile {
    public void save(ArrayList<User> list, String file)
    {
        try(FileOutputStream out = new FileOutputStream (new File(file))){
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(list);
        }catch(Exception e){
            System.out.println("Got an exception");
        }
    }
    
    public void saveUsers(ArrayList<User> list){
        try(PrintWriter pw = new PrintWriter(new File("User.DAT"))){
            for (User u: list){
                pw.println(u.getName());
                pw.println(u.getPassword());

            }
            
        }catch(Exception e){
            System.out.println("Got an exception");
        }
    }
    
    public ArrayList readUser()
    {
        ArrayList<User> list = new ArrayList<>();
        try(Scanner reader = new Scanner(new File("User.DAT"))){
            while(reader.hasNext()){
                User u =new User();
                u.setName((String)(reader.nextLine()));
                u.setPassword((String)(reader.nextLine()));
                list.add(u);
            }
        }catch(Exception e){
            System.out.println("Got an exception");
        }
        return list;
    }
    
    public ArrayList read(String file)
    {
        ArrayList list = new ArrayList();
        try(FileInputStream out = new FileInputStream(new File(file))){
            ObjectInputStream oos = new ObjectInputStream (out);
            list = (ArrayList) oos.readObject();
        }catch(Exception e){
            System.out.println("Got an exception");
        }
        return list;
    }
}
