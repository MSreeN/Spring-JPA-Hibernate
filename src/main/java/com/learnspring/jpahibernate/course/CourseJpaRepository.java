package com.learnspring.jpahibernate.course;


import com.learnspring.jpahibernate.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }

    public void deleteById(Long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
