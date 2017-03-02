package Main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Main.dao.UserDao;
import Main.enity.User;



//@Controller
public class UserController {
	
	
	//  @Autowired
	  private   UserDao userDao;
	  
	  
    @RequestMapping("/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
      String userId;
      User user = userDao.findByEmail(email);
      if (user != null) {
        userId = String.valueOf(user.getId());
        return "The user id is: " + userId;
      }
      return "user " + email + " is not exist.";
    }
  }