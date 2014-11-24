package com.PL.Spring.Metier;

import java.util.List;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Entities.Student;
import com.PL.Spring.Entities.User;

public interface UserServiceInt {
	
	void addUser(User user);
	void editUser(User user);
	void deleteUser(Long userId);
	User findUser(Long userId);
	User findUserByName(String username);
	List<User> getAllUsers();
	
	void addAdmin(Admin admin);
	void editAdmin(Admin admin);
	void deleteAdmin(Long userId);
	Admin findAdmin(Long userId);
	Admin findAdminByName(String username);
	List<Admin> getAllAdmins();
	
	void addProfessor(Professor professor);
	void editProfessor(Professor professor);
	void deleteProfessor(Long userId);
	Professor  findProfessor(Long userId);
	
	void addStudent(Student student);
	void editStudent(Student student);
	void deleteStudent(Long userId);
	Student findStudent(Long userId);
	Student findStudentByName(String username);
	List<Student> getAllStudents();
	Professor findProfessorByName(String username);
	List<Professor> getAllProfessors();

}
