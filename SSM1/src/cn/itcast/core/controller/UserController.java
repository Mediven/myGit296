package cn.itcast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService us;
	//入门程序  使用浏览器查询商品列表
	@RequestMapping(value="/savea.action")
	public void saveUser(User user){
		us.saveUser(user);
	}

}
