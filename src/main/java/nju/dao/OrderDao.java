package nju.dao;

import nju.model.OrderData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDao extends JpaRepository<OrderData, Integer> {
    List<OrderData> findAllByUserId(int userId);

    List<OrderData> findAllByStaffId(int staffId);
}
