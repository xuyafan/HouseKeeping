package nju.xyf.service;

import nju.model.ExampleData;


public interface TeacherService {


	ExampleData login(String email, String password, String sessionId);
}
