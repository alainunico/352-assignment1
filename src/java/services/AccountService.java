package services;

import models.User;

/**
 *
 * @author Alain Unico
 */
public class AccountService {
    
    public User login(String username, String password){
        
        if (username.equals("adam") || username.equals("betty") || username.equals("carl") 
           || username.equals("don") || username.equals("earl") || username.equals("fred") 
           || username.equals("grace") || username.equals("holly") || username.equals("isabell")
           || username.equals("john") || username.equals("kitty") || username.equals("lily")
           || username.equals("mark") || username.equals("nancy"))
            
            if (password.equals("password"))
            return new User(username, null);
           
          return null;
                 
}
}