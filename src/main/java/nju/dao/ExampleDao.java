package nju.dao;

import nju.model.ExampleData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleDao extends JpaRepository<ExampleData, Long> {

    ExampleData findByEmailAndPassword(String email, String password);

    ExampleData save(ExampleData teacherData);
}
