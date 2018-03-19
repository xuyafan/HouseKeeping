package nju.xyf.service;

import nju.model.CustomerData;

public interface ICustomerService {

    CustomerData signIn(String email, String password);

    CustomerData signUp(String name, String gender, String email, String phone, String password);
}
