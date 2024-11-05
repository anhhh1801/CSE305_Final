package ProjectGroup2;


import java.io.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Viet Anh
 */
public class DAO {
    private String pathFolder = "D:\\CSE 203\\ProjectGroup";
    private String fileName_Byte = "UserAsByte.txt";
    
    
    public DAO()
    {
        File folder = new File(pathFolder);
        if (!folder.exists())
        {
            try {
                folder.mkdirs();
            }catch(Exception ex){
                
            }
        }
        
        File fileName_Byte = new File(pathFolder);
        if (!fileName_Byte.exists())
        {
            try {
                fileName_Byte.mkdirs();
            }catch(Exception ex){
                
            }
        }
    }
    
    public ArrayList<User> restoreDataFromFile () throws ClassNotFoundException
    {
        ArrayList<User> listCD = new ArrayList<>();
        File file_byte = new File(pathFolder +"\\"+fileName_Byte);
        
        try{
            FileInputStream fis = new FileInputStream (file_byte);
            ObjectInputStream ois = new ObjectInputStream (fis);
            
            listCD = (ArrayList<User>) ois.readObject();
        }catch (IOException ex)
        {
            
        }
        return listCD;
    }
    
    public void saveDataAsByte (ArrayList<User> newList)
    {
        File file_byte = new File (pathFolder + "\\" + fileName_Byte);
        
        try {
            FileOutputStream fos = new FileOutputStream(file_byte);
            ObjectOutputStream oos = new ObjectOutputStream (fos);
            
            oos.writeObject(newList);
            oos.flush();
        } catch(IOException ex){
            
        }
    }
}
