package com.PL.Spring.Metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.PL.Spring.DAO.UserDaoImp;
import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.User;

@Transactional
public class UserServiceImp implements UserServiceInt{
	
	private UserDaoImp userDaoImp;

	public UserDaoImp getUserDaoImp() {
		return userDaoImp;
	}

	public void setUserDaoImp(UserDaoImp userDaoImp) {
		this.userDaoImp = userDaoImp;
	}

	@Override
	public void addUser(User user) {
		userDaoImp.addUser(user);
		
	}

	@Override
	public void editUser(User user) {
		userDaoImp.editUser(user);
		
	}

	@Override
	public void deleteUser(Long userId) {
		userDaoImp.deleteUser(userId);
		
	}

	@Override
	public User findUser(Long userId) {
		return userDaoImp.findUser(userId);
		
	}

	@Override
	public User findUserByName(String username) {
		return userDaoImp.findUserByName(username);
		
	}

	@Override
	public List<User> getAllUsers() {
		return userDaoImp.getAllUsers();
	}

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin findAdmin(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findAdminByName(String username) {
		return userDaoImp.findAdminByName(username);
	}

	@Override
	public List<Admin> getAllAdmins() {
		return userDaoImp.getAllAdmins();
		
	}

}
