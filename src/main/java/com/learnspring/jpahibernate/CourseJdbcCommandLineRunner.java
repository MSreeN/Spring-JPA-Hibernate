package com.learnspring.jpahibernate;

import com.learnspring.jpahibernate.course.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    CourseJdbcRepository courseJdbcRepository;
    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn Aws now", "Sree"));
        courseJdbcRepository.insert(new Course(2, "Learn Kubernetes now", "Sree"));
        courseJdbcRepository.insert(new Course(3, "Learn Docker now", "Sree"));

        courseJdbcRepository.delete(3L);
    }
}
