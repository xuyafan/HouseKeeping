package nju.xyf.service;

import nju.dao.ExampleDao;
import nju.model.ExampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TeacherServiceImpl implements TeacherService {

    private ExampleDao teacherDao;

    @Autowired
    public TeacherServiceImpl(ExampleDao teacherDao) {
        this.teacherDao = teacherDao;
    }



    @Override
    public ExampleData login(String email, String password, String sessionId) {
        if(null!=teacherDao.findByEmailAndPassword(email, password)){
            ExampleData teacherData = teacherDao.findByEmailAndPassword(email, password);
            teacherData.setSession(sessionId);
            teacherData.setLastLogin(new Date());
            teacherDao.save(teacherData);
        }

        return teacherDao.findByEmailAndPassword(email, password);

    }
}
