package com.learnspring.jpahibernate;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private long id;
    private String courseName;
    private String courseAuthor;

    public Course(long id, String courseName, String courseAuthor) {
        this.id = id;
        this.courseName = courseName;
        this.courseAuthor = courseAuthor;
    }

    public Course(){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }



    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseAuthor='" + courseAuthor + '\'' +
                '}';
    }
}
