package nju.dao;

import nju.model.StaffData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<StaffData, Integer> {

}
