package nju.dao;

import nju.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserData, Integer> {
    UserData findByUsernameAndPassword(String username, String password);

}
