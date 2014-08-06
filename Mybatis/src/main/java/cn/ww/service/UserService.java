package cn.ww.service;

import cn.ww.mapper.LogDao;
import cn.ww.mapper.UserDao;
import cn.ww.model.Log;
import cn.ww.model.User;

public class UserService {

	private UserDao userDao;
	private LogDao logDao;
	public void add(User user) {
		userDao.add(user);
		Log log = new Log();
		log.setMessage("a user saved!");
		logDao.add(log);
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
	public LogDao getLogDao() {
		return logDao;
	}

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
