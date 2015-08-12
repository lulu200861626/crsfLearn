package com.crsf.lulu.Controller.test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by lulu on 15/8/5.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value = {"/",""})
    public String home(Model m,String t) {
        if(t == null||t.length() <= 0)
            t = "";
        m.addAttribute("bdstoken",t);
        return "index";
    }
    @RequestMapping(value = {"home"})
    public String index(Model m,String t) {
        if(t == null||t.length() <= 0)
            t = "";
        m.addAttribute("bdstoken",t);
        return "index";
    }
    @RequestMapping(value = {"csdn"})
    public String elm(Model m,String t) {
        if(t == null||t.length() <= 0)
            t = "擅长哪一方面";
        m.addAttribute("hi",t);
        return "elm";
    }
}
