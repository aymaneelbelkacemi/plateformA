package com.PL.Spring.Metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.PL.Spring.DAO.UserDaoImp;
import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Professor;
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
		userDaoImp.addAdmin(admin);
		
	}

	@Override
	public void editAdmin(Admin admin) {
		userDaoImp.editAdmin(admin);
		
	}

	@Override
	public void deleteAdmin(Long userId) {
		userDaoImp.deleteAdmin(userId);
		
	}

	@Override
	public Admin findAdmin(Long userId) {
		return userDaoImp.findAdmin(userId);
	}

	@Override
	public Admin findAdminByName(String username) {
		return userDaoImp.findAdminByName(username);
	}

	@Override
	public List<Admin> getAllAdmins() {
		return userDaoImp.getAllAdmins();
		
	}

	@Override
	public void addProfessor(Professor professor) {
		userDaoImp.addProfessor(professor);
		
	}

	@Override
	public void editProfessor(Professor professor) {
		userDaoImp.editProfessor(professor);
		
	}

	@Override
	public void deleteProfessor(Long userId) {
		userDaoImp.deleteProfessor(userId);
		
	}

	@Override
	public Professor findProfessor(Long userId) {
		return userDaoImp.findProfessor(userId);
		
	}

	@Override
	public Professor findProfessorByName(String username) {
		return userDaoImp.findProfessorByName(username);
	}

	@Override
	public List<Professor> getAllProfessors() {
		return userDaoImp.getAllProfessors();
		
	}

}
