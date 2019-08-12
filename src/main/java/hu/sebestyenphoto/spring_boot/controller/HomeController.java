package hu.sebestyenphoto.spring_boot.controller;

import hu.sebestyenphoto.spring_boot.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("home")
    public ModelAndView index(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("index");
        return mv;
    }
}
