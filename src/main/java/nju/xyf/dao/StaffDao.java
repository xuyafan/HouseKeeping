package nju.xyf.dao;

import nju.xyf.model.RecordData;
import nju.xyf.model.StaffData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<StaffData, Integer> {

}
