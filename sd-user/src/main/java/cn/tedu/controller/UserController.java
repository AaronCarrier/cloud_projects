package cn.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.pojo.User;
import cn.tedu.service.UserService;

//标识身份
@RestController		//返回值变成json格式，支持RESTFul格式
public class UserController {
	//调用service层
	@Autowired
	private UserService userService;
	
	//查询所有
	//浏览器：http://localhost:8060/user/find，最终浏览器上就展示json串
	@RequestMapping("/user/find")
	public List<User> find() {
		return userService.find();
	}
	
	@RequestMapping("/user/get/{id}")
	public User get(@PathVariable Integer id) {
		return userService.get(id);
	}
	
	
	@RequestMapping("/user/add/{name}/{birthday}/{address}")
	public String add(User user) {
		userService.add(user);
		return"add successfully";
	}
	
	@RequestMapping("/user/update/{name}/{birthday}/{address}/{id}")
	public String update(User user) {
		userService.update(user);
		return "update successfully";
	}
	
	@RequestMapping("/user/delete/{id}")
	public String delete(@PathVariable Integer id) {
		userService.delete(id);
		return"delete successfully";
	}

	
}
