package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Transient;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;

    // inject entity manager
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent); // save student entities into database
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student ORDER BY lastName", Student.class);
        // queries use class/ attribute name, not table/ column name
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE lastName = :theData", Student.class);
        query.setParameter("theData", theLastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent); // update the modified row
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student theStudent = entityManager.find(Student.class, id);
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        return entityManager.createQuery("DELETE FROM Student ").executeUpdate(); // return the deleted rows number
    }
}
