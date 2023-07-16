package com.learnspring.jpahibernate;

import com.learnspring.jpahibernate.course.CourseJdbcRepository;
import com.learnspring.jpahibernate.course.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    CourseJdbcRepository courseJdbcRepository;

    @Autowired
    CourseJpaRepository courseJpaRepository;
    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.insert(new Course(1, "Learn Aws now jpa", "Sree"));
        courseJpaRepository.insert(new Course(2, "Learn Kubernetes now jpa", "Sree"));
        courseJpaRepository.insert(new Course(3, "Learn Docker now jpa", "Sree"));
        courseJpaRepository.deleteById(3L);

        Course course = courseJpaRepository.findById(2L);
        System.out.println("-----------------");
        System.out.println(course);
    }
}
