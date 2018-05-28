package nju.dao;

import nju.model.LocationData;
import nju.model.OrderData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationDao extends JpaRepository<LocationData, Integer> {
    List<LocationData> findAllByUserId(int userId);
}
