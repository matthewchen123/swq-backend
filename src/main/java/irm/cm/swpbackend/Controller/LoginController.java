package irm.cm.swpbackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import irm.cm.swpbackend.Entity.User;
import irm.cm.swpbackend.Result.Result;
import irm.cm.swpbackend.Service.UserService;

@CrossOrigin
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @RequestMapping(value = "/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        System.out.println(requestUser);
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        System.out.println(username);

        User user = userService.get(username, requestUser.getPassword());
        if (null == user) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/register")
    @ResponseBody
    public Result Register(@RequestBody User registeUser) {
        System.out.println(registeUser);
        User user1 = userService.get(registeUser.getUsername(), registeUser.getPassword());
        User user2 = registeUser;
        if (null == user1) {// 用户已经存在
            userService.saveUser(user2);
            return new Result(200);
        } else {
            return new Result(400);
        }

    }

    @RequestMapping(value = "/finduser")
    @ResponseBody
    public String findUser() {
        List<User> us = userService.findAllUser();
        for (User u : us) {
            System.out.println(u);
        }
        return "success";
    }

}
