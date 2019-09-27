package cn.jbit.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sping_boot {

    @RequestMapping("hello.html")
    public @ResponseBody
    String demo(){
        return "111";
    }
}

