package nju.xyf.dao;

import nju.xyf.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<EmployeeData, Integer> {

}
