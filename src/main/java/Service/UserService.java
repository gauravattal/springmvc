package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.userDao;
import entity.user;

@Service
public class UserService {

	
	@Autowired
	public userDao userDao;

	public void save(user user) {
		
	userDao.save(user);
	
	}
	
	
	
}
