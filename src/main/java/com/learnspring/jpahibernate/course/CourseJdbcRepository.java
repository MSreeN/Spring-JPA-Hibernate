package com.learnspring.jpahibernate.course;

import com.learnspring.jpahibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private Course course;
    private static String query =
            """
                    insert into course (id, name, author)
                    values(?, ?, ?);
                    """;
    private static String delete_query=
            """
                    delete from course where id = ?
                    """;

    private static String select_Query =
            """
                    select * from course where id=?
                    """;
    public void insert(Course course){
        jdbcTemplate.update(query, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(Long id){
        jdbcTemplate.update(delete_query,id);
    }

    public Course findById(Long id){
        return jdbcTemplate.queryForObject(select_Query, new BeanPropertyRowMapper<>(Course.class), id);
    }


}
