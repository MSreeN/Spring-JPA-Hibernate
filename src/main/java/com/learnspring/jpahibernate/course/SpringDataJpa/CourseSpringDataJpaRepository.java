package com.learnspring.jpahibernate.course.SpringDataJpa;

import com.learnspring.jpahibernate.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
