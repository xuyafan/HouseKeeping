package nju.dao;

import nju.model.StarData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StarDao extends JpaRepository<StarData, Integer> {
    StarData findByUserIdAndStaffId(int userId, int staffId);

    List<StarData> findAllByUserId(int userId);
}
