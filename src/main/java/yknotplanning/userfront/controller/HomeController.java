package yknotplanning.userfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import yknotplanning.userfront.domain.User;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bahr2772 on 12/9/16.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){ return "redirect:/index"; }


    @RequestMapping("/index")
    public String index (){ return "index"; }


    @GetMapping(value = "/signup")
    public String signup(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "signup";
    }

  /*  @PostMapping(value = "/signup")
    public String signupPost(@ModelAttribute("user") User user, Model model){

        if (userService.checkUserExists(user.getUsername(), user.getEmail())) {

            if (userService.checkEmailExists(user.getEmail()))
                model.addAttribute("usernameExists", true);

            if (userService.checkUsernameExists(user.getUsername()))
                model.addAttribute("usernameExists", true);

            return "signup";

        } else {
            Set<UserRole> userRoles = new HashSet<>();
            userRoles.add(new UserRole(user, roleDao.findByName("USER")));
            userService.createUser(user, userRoles);

            return "redirect:/";
        }

    }*/


}
