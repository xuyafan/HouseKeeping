package nju.dao;

import nju.model.RecordData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordDao extends JpaRepository<RecordData, Integer> {

}
