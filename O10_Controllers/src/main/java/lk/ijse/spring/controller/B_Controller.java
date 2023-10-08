package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : Chavindu
 * created : 10/8/2023-4:26 PM
 **/

@Controller
@RequestMapping("/item")
public class B_Controller {
    @GetMapping
    public ModelAndView test(){
        ModelAndView m= new ModelAndView("/item");
        m.addObject("ID","I001");
        return m;
    }
}
