package nju.dao;

import nju.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<EmployeeData, Integer> {

}
