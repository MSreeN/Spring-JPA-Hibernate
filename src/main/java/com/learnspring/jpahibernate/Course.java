package com.learnspring.jpahibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import org.springframework.stereotype.Component;

@Entity
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            initialValue = 1
    )
    private long id;
    @Column(
            name = "name"
    )
    private String name;
    private String author;

    public Course(long id, String name, String Author) {


        this.id = id;
        this.name = name;
        this.author = Author;
    }

    public Course(){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Author='" + author + '\'' +
                '}';
    }
}
