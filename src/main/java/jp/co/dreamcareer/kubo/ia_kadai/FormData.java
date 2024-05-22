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
}
