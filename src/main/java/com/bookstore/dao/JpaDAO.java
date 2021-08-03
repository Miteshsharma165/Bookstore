package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;



public class JpaDAO<T> {

	protected EntityManager entityManager;

	public JpaDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public T create(T t) {
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.flush();
		entityManager.refresh(t);
		entityManager.getTransaction().commit();
		return t;
	}

	public T update(T t) {
		entityManager.getTransaction().begin();
		entityManager.merge(t);
		entityManager.getTransaction().commit();
		return t;
	}

	public T find(Class<T> type, Object Userid) {
		entityManager.getTransaction().begin();
		T entity = entityManager.find(type, Userid);
		if (entity != null) {
			entityManager.getTransaction().commit();
		}

		return entity;

	}

	public void delete(Class<T> type, Object id) {

		entityManager.getTransaction().begin();
		Object reference = entityManager.getReference(type, id);
		entityManager.remove(reference);
		entityManager.getTransaction().commit();

	}

	public List<T> findbyName(String Query) {
		Query query = entityManager.createQuery(Query);
		List<T> list = query.getResultList();// It returns row by row in a list form but How?
		return list;
	}

	public List<T> findbyEmail(String Query,String name, String parameter) {
		Query query = entityManager.createQuery(Query);// Gap not in =:email
		   query.setParameter(name, parameter);//"from Users e where e.deptNumber =:deptNo;"
          return query.getResultList();

	}

	public long countRows(String Query) {
		Query query = entityManager.createQuery(Query);
		return (long) query.getSingleResult();
	}

}
