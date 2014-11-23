package com.PL.Spring.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.User;




public class UserDaoImp implements UserDaoInt,AdminDaoInt{

	@PersistenceContext
	private EntityManager em;
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void addUser(User user) {
		em.persist(user);	
	}

	@Override
	public void editUser(User user) {
		this.em.merge(user);
		
	}

	

	@Override
	public User findUserByName(String username) {
		Query query=this.em.createQuery("SELECT o from User o where o.user_name =:username");
		query.setParameter("username", username);
		return (User)query.getSingleResult();
		
	}

	@Override
	public List<User> getAllUsers() {
		Query query=this.em.createQuery("SELECT o from User o");
		return query.getResultList();
	}


	@Override
	public void deleteUser(Long userId) {
		User u=em.getReference(User.class, userId);
		em.remove(u);
		
	}

	@Override
	public User findUser(Long userId) {
		return em.find(User.class, userId);
	}

	@Override
	public void addAdmin(Admin admin) {
		
		
		em.persist(admin);
		
	}

	@Override
	public void editAdmin(Admin admin) {
		
		this.em.merge(admin);
	}

	@Override
	public void deleteAdmin(Long userId) {
		Admin a=em.getReference(Admin.class, userId);
		em.remove(a);
		
	}

	@Override
	public Admin findAdmin(Long userId) {
		return em.find(Admin.class, userId);
	}

	@Override
	public Admin findAdminByName(String username) {
		Query query=this.em.createQuery("SELECT o from Admin o where o.user_name =:username");
		query.setParameter("username", username);
		return (Admin)query.getSingleResult();
	}

	@Override
	public List<Admin> getAllAdmins() {
		Query query=this.em.createQuery("SELECT o from Admin o");
		return query.getResultList();
	}

}
