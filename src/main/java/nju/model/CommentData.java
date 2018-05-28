package nju.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "comment")
public class CommentData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @NotNull
    @Column(name = "userId")
    private int userId;

    @NotNull
    @Column(name = "staffId")
    private int staffId;

    @NotNull
    @Column(name = "context")
    private String context;

    @NotNull
    @Column(name = "datetime")
    private long datetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }
}
