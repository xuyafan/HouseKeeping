package nju.xyf.service;

import nju.dao.CustomerDao;
import nju.model.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public CustomerData signIn(String email, String password) {
        CustomerData customerData = customerDao.findByEmailAndPassword(email, password);
        if(customerData !=null){
            return customerData;
        }
        return null;
    }

    @Override
    public CustomerData signUp(String name, String gender, String email, String phone, String password) {
        CustomerData customerData =new CustomerData(name,gender,email,phone,password);
        return customerDao.save(customerData);

    }
}
