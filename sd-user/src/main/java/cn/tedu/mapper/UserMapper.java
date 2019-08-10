package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.pojo.User;

public interface UserMapper {
	
	//映射到 数据库操作
	@Select("select * from user")
	public List<User> find();
	
	@Select("select * from user where id=#{id}")
	public User get(Integer id);
	
	
	@Insert("insert into user (name,birthday,address) values(#{name},#{birthday},#{address})")
	public void insert(User user);
	
	@Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
	public void update(User user);
	
	@Delete("delete from user where id=#{id}")
	public void delete(Integer id);
	
}
