package com.gyf.szcrm.model;

import java.util.Date;

public class CourseCategory {
    private int id;
    private String course_name;
    private Date publish_datetime;
    private int status;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Date getPublish_datetime() {
        return publish_datetime;
    }

    public void setPublish_datetime(Date publish_datetime) {
        this.publish_datetime = publish_datetime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
