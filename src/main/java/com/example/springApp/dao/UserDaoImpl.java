package com.example.springApp.dao;

import com.example.springApp.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void add(User user) {
        em.persist(user);
    }

    @Override
    public void edit(User user) {
        em.merge(user);
    }

    @Override
    public void delete(long id) {
        em.remove(getUserById(id));
    }

    @Override
    public User getUserById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> listUsers() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public UserDetails getUserByName(String s) {
        return em.createQuery("SELECT u from User u WHERE u.username = :username", User.class).
                setParameter("username", s).getSingleResult();
    }
}
