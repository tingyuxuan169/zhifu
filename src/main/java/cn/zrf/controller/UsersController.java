package cn.zrf.controller;

import cn.zrf.pojo.Users;
import cn.zrf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author ZhangRongFei
 * @date 2019/8/30 16:19
 */
@Controller
public class UsersController {
    @Autowired
    UsersService usersService;

    //查询
    public ModelAndView findAll(){
        List<Users> list = usersService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("list",list);
        //指向页面
        modelAndView.setViewName("");
        return modelAndView;
    }
    //注册
    public void save(Users users){
        usersService.save(users);
    }
}
