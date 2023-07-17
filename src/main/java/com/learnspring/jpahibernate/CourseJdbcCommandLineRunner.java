package com.learnspring.jpahibernate;

import com.learnspring.jpahibernate.course.CourseJdbcRepository;
import com.learnspring.jpahibernate.course.CourseJpaRepository;
import com.learnspring.jpahibernate.course.SpringDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    CourseJdbcRepository courseJdbcRepository;

//    @Autowired
//    CourseJpaRepository courseJpaRepository;
    @Autowired
    CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn Aws now jpa", "Sree"));
        repository.save(new Course(2, "Learn Kubernetes now jpa", "Sree"));
        repository.save(new Course(3, "Learn Docker now jpa", "Sree"));
        repository.deleteById(3L);

        Optional<Course> course = repository.findById(2L);
        System.out.println("-----------------");
        System.out.println(course);
    }
}
