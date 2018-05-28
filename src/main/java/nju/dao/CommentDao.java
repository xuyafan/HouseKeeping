package nju.dao;

import nju.model.CommentData;
import nju.model.LocationData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentDao extends JpaRepository<CommentData, Integer> {
    List<CommentData> findAllByStaffId(int staffId);
}
