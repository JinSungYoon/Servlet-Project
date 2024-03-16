package me.whiteship;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

@org.springframework.stereotype.Controller("/simple")
public class SimpleController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("simple");
    }
}
