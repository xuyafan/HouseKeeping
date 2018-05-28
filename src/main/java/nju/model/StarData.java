package nju.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 收藏关系
 */
@Entity
@Table(name = "star")
public class StarData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "userId")
    private Integer userId;

    @NotNull
    @Column(name = "staffId")
    private Integer staffId;


    @Column(name = "starTime")
    private Long starTime; //收藏时间

    @NotNull
    @Column(name = "isStar")
    private Boolean isStar = false;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Long getStarTime() {
        return starTime;
    }

    public void setStarTime(Long starTime) {
        this.starTime = starTime;
    }

    public Boolean getStar() {
        return isStar;
    }

    public void setStar(Boolean star) {
        isStar = star;
    }
}
