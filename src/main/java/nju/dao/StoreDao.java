package nju.dao;

import nju.model.StoreData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDao extends JpaRepository<StoreData, Integer> {

}
