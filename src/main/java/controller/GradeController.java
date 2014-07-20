package controller;

import input.Score;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: X
 * Date: 7/20/14
 * Time: 2:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@SessionAttributes
public class GradeController {

    @RequestMapping(value = "/addScore", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("score")
    Score score, BindingResult result) {

        System.out.println("First Name:" + score.getScore());

        return "redirect:contacts.html";
    }

    @RequestMapping("/scores")
    public ModelAndView showContacts() {

        return new ModelAndView("grade", "command", new Score());
    }
}
