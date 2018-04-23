package nju.xyf.ctrl;

import nju.xyf.util.FileUtil;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class IndexCtrl {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        Resource resource = new ClassPathResource("index.json");
        try {
            return FileUtil.readFile(resource.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping(value = "/indexTest", method = RequestMethod.GET)
    public String indexTest(HttpServletRequest request) {
        Resource resource = new ClassPathResource("indexTest.json");
        try {
            return FileUtil.readFile(resource.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
