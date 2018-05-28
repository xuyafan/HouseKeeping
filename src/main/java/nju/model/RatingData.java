package nju.model;

import nju.xyf.request.Rating;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "rating")
public class RatingData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "orderId")
    private int orderId; //所属订单id

    @NotNull
    @Column(name = "userId")
    private int userId;

    @NotNull
    @Column(name = "orderLevel")
    private int orderLevel;

    @NotNull
    @Column(name = "staffLevel")
    private int staffLevel;

    @NotNull
    @Column(name = "serviceLevel")
    private int serviceLevel;

    @NotNull
    @Column(name = "content")
    private String content;

    @NotNull
    @Column(name = "datetime")
    private long datetime;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderLevel() {
        return orderLevel;
    }

    public void setOrderLevel(int orderLevel) {
        this.orderLevel = orderLevel;
    }

    public int getStaffLevel() {
        return staffLevel;
    }

    public void setStaffLevel(int staffLevel) {
        this.staffLevel = staffLevel;
    }

    public int getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(int serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }
}
