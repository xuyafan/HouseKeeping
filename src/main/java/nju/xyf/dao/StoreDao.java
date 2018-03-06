package nju.xyf.dao;

import nju.xyf.model.StoreData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDao extends JpaRepository<StoreData, Integer> {

}
