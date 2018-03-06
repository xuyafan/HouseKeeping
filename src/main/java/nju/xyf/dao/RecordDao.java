package nju.xyf.dao;

import nju.xyf.model.EmployerData;
import nju.xyf.model.RecordData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordDao extends JpaRepository<RecordData, Integer> {

}
