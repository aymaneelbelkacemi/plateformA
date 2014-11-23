package com.PL.Spring.DAO;

import java.util.List;

import com.PL.Spring.Entities.Admin;


public interface AdminDaoInt {

	void addAdmin(Admin admin);
	void editAdmin(Admin admin);
	void deleteAdmin(Long userId);
	Admin findAdmin(Long userId);
	Admin findAdminByName(String username);
	List<Admin> getAllAdmins();
	
}
