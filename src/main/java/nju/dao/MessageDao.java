package nju.dao;

import nju.model.MessageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageDao extends JpaRepository<MessageData, Integer> {
    List<MessageData> findAllByOrderId(int orderId);
}
