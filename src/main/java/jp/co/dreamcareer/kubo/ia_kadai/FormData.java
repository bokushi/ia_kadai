package jp.co.dreamcareer.kubo.ia_kadai;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FormData {
    private String lecturer;
    private String date;
    private String time;
    private String course;
    private String feedback;

    @Id
    @GeneratedValue
    private int id;

    public FormData(String lecturer, String date, String time, String course, String feedback) {
        this.lecturer = lecturer;
        this.date = date;
        this.time = time;
        this.course = course;
        this.feedback = feedback;
    }

    public FormData() {
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
