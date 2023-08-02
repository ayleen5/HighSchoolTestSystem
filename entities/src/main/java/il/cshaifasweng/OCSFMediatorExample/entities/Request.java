package il.cshaifasweng.OCSFMediatorExample.entities;
import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "requests")
public class Request implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String teacherName;
    private int minutes;
    private String explaination;
    private boolean isDone;
    private String examId;

    public Request(){}
    public Request(Teacher teacher, int minutes, String explaination, String examId){
        this.teacherName = teacher.getName();
        this.minutes = minutes;
        this.explaination = explaination;
        this.isDone = false;
        this.examId = examId;
    }

    public void copy(Request q) {
        this.id = q.getId();
        this.examId = q.getExamId();
        this.explaination = q.getExplaination();
        this.minutes = q.getMinutes();
        this.isDone = q.getIsDone();
        this.teacherName = q.getTeacherName();
    }

    public int getId() {
        return this.id;
    }

    public boolean getIsDone(){return this.isDone;}
    public void setIsDone(){this.isDone = !(this.isDone); }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getExplaination() {
        return explaination;
    }

    public void setExplaination(String explaination) {
        this.explaination = explaination;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }
}