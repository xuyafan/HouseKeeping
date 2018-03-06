package nju.xyf.dao;

import nju.xyf.model.EmployerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<EmployerData, Integer> {

}
