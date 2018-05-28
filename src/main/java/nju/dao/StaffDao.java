package nju.dao;

import nju.model.StaffData;
import nju.xyf.request.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffDao extends JpaRepository<StaffData, Integer> {

}
