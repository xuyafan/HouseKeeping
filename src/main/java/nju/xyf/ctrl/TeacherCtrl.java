package nju.xyf.ctrl;

import nju.common.ErrorCode;
import nju.model.ExampleData;

import nju.common.Response;
import nju.xyf.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TeacherCtrl {


    @Autowired
    TeacherService teacherService;


    @RequestMapping(value = "/teacher/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, @RequestParam(name = "email") String email,
                        @RequestParam(name = "password") String password) {
        String sessionId = request.getSession().getId();

        ExampleData teacher = teacherService.login(email, password, sessionId);
        if (teacher != null) {
            return new Response<ExampleData>().getBuilder()
                    .succ()
                    .data(teacher)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }

    }


}
