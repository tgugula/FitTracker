package pl.edu.wszib.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="selected_habits")
public class SelectedHabit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String habit;
    private Date ctime;

    public SelectedHabit(Integer id, String habit, Date ctime) {
        this.id = id;
        this.habit = habit;
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}