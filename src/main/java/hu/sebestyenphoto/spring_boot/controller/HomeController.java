package hu.sebestyenphoto.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("home")
    public String index(HttpServletRequest request){
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        System.out.println("hi " + name);
        session.setAttribute("name", name);
        return "index";
    }
}
