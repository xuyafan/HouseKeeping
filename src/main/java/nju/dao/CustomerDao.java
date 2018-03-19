package nju.dao;

import nju.model.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<CustomerData, Long> {
    CustomerData findByEmailAndPassword(String email, String password);

}
