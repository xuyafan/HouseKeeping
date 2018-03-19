package nju.dao;

import nju.model.ServiceData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDao extends JpaRepository<ServiceData, Long> {

}
