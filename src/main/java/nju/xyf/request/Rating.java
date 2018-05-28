package nju.xyf.request;

import nju.model.RatingData;

/**
 * author： xuyafan
 * description:
 */
public class Rating {
    private int id;

    private int orderLevel;

    private int staffLevel;

    private int serviceLevel;

    private int userId;

    private int orderId;

    private String content;

    private long datetime;

    private User user;

    public Rating() {
    }

    public Rating(RatingData data) {
        this.id = data.getId();
        this.orderLevel = data.getOrderLevel();
        this.staffLevel = data.getStaffLevel();
        this.serviceLevel = data.getServiceLevel();
        this.userId = data.getUserId();
        this.orderId = data.getOrderId();
        this.content = data.getContent();
        this.datetime = data.getDatetime();
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
