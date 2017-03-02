package Main.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Main.enity.User;



 
@Transactional
public interface UserDao extends CrudRepository<User, Long> {
  public User findByEmail(String email);
} 