package nju.dao;

import nju.model.AppointmentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDao extends JpaRepository<AppointmentData, Integer> {

}
