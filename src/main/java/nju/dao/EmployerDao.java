package nju.dao;

import nju.model.EmployerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<EmployerData, Integer> {

}
