/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGroup2;

import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class UserManagement {
    
    private ArrayList<User> listUsers;
    
    public UserManagement()
    {
        listUsers = new ArrayList<>();
    }
    
    public boolean addListUsers(User user)
    {
        if(listUsers!=null)
        {
            listUsers.add(user);
            return true;
        }return false;
    }
    
    public boolean findUserByName(String name,ArrayList<User> listUsers) {
        for (int i = 0; i < listUsers.size(); i++) {
            User temp = listUsers.get(i);
            if (temp.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    

    public ArrayList<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(ArrayList<User> listUsers) {
        this.listUsers = listUsers;
    }
    
    
}
