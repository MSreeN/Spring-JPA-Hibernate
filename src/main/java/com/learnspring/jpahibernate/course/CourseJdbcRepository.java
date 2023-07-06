package com.learnspring.jpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String query =
            """
                    insert into course (id, name, author)
                    values(1, 'learn AWS', 'Sree')
                    """;
    public void insert(){
        jdbcTemplate.update(query);
    }
}
