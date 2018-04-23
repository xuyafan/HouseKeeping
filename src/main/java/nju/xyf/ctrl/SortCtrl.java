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
public class SortCtrl {

    @RequestMapping(value = "/sort/list", method = RequestMethod.GET)
    public String getSortList(HttpServletRequest request) {
        Resource resource = new ClassPathResource("sort_list.json");
        try {
            return FileUtil.readFile(resource.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping(value = "/sort/content", method = RequestMethod.GET)
    public String getSortContent(HttpServletRequest request) {
        Resource resource = new ClassPathResource("sort_content_1.json");
        try {
            return FileUtil.readFile(resource.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
