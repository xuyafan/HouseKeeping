package nju.xyf.service;

import nju.xyf.model.ExampleData;


public interface TeacherService {


	ExampleData login(String email, String password, String sessionId);
}
