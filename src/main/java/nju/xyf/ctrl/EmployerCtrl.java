package nju.xyf.ctrl;


import nju.common.ErrorCode;
import nju.common.Response;
import nju.model.CustomerData;
import nju.xyf.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@RestController
public class EmployerCtrl {

    @Autowired
    ICustomerService iCustomerService;


    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public String signIn(HttpServletRequest request, @RequestParam(name = "email") String email,
                        @RequestParam(name = "password") String password) {


        CustomerData customerData = iCustomerService.signIn(email, password);
        if (customerData != null) {
            return new Response<CustomerData>().getBuilder()
                    .succ()
                    .data(customerData)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }


    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public String signUp(HttpServletRequest request,
                         @RequestParam(name = "name") String name,
                         @RequestParam(name = "email") String email,
                         @RequestParam(name = "phone") String phone,
                        @RequestParam(name = "password") String password) {


        CustomerData customerData = iCustomerService.signUp(name, "男",email, phone, password);
        if (customerData != null) {
            return new Response<CustomerData>().getBuilder()
                    .succ()
                    .data(customerData)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }

    }
}
