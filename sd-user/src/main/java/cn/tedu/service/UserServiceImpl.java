package cn.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.User;
import cn.tedu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	public List<User> find() {
		return userMapper.find();
	}
	
	public User get(Integer id){
		return userMapper.get(id);
	}


	public void add(User user) {
		userMapper.insert(user);
	}
	
	public void update(User user) {
		userMapper.update(user);
		
	}
	
	public void delete(Integer id) {
		userMapper.delete(id);
		System.out.println("************");
	}
	
	
}
