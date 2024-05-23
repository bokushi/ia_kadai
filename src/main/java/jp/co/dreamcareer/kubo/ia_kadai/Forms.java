package jp.co.dreamcareer.kubo.ia_kadai;

import jakarta.validation.constraints.NotBlank;

public class Forms {
    @NotBlank(message = "入力必須です")
    private String lecturer;

    @NotBlank(message = "入力必須です")
    private String date;
        
    @NotBlank(message = "入力必須です")
    private String time;

    @NotBlank(message = "入力必須です")
    private String course;

    @NotBlank(message = "入力必須です")
    private String feedback;

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

}
