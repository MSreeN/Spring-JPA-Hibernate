package com.learnspring.jpahibernate.course;

import com.learnspring.jpahibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
    private String schema_Query =
            """
                    show columns from course;
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

//    public void getTableSchema(){
//        String schema = jdbcTemplate.query(schema_Query, new ResultSetExtractor<String>() {
//            @Override
//            public String extractData(ResultSet rs) throws SQLException, DataAccessException {
//             while(rs.next()){
//                 System.out.println();
//            }
//        });
//    }


}
