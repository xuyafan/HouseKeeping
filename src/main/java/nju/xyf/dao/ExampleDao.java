package nju.xyf.dao;

import nju.xyf.model.ExampleData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleDao extends JpaRepository<ExampleData, Integer> {

    ExampleData findByEmailAndPassword(String email, String password);

    ExampleData save(ExampleData teacherData);
}
