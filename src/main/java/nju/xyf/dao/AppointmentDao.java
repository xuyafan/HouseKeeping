package nju.xyf.dao;

import nju.xyf.model.AppointmentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDao extends JpaRepository<AppointmentData, Integer> {

}
