package nju.dao;

import nju.model.RatingData;
import nju.model.ServiceData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingDao extends JpaRepository<RatingData, Integer> {
    RatingData findByOrderId(int orderId);
}
