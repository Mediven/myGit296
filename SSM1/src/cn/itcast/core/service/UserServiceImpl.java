package cn.itcast.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.dao.UserDao;
import cn.itcast.core.pojo.User;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserDao ud ;
	@Override
	public void saveUser(User user) {
ud.saveUser(user);
	}

}
