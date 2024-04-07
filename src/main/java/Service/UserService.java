package Service;

import dao.UserDao;
import food.User;  
  
public class UserService {  
      
    private UserDao userDao;  
      
    public UserService() {
        this.userDao = new UserDao();
    }  
      
    public int addUser(User user) {
       return userDao.addUser(user);
    }  
      
    public User getUserByNameAndPassword(String name, String password){
        return userDao.getUserByNameAndPassword(name, password);  
    }     

}
