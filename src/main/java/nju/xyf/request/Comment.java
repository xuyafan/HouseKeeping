package nju.xyf.request;

import nju.model.CommentData;

/**
 * author： xuyafan
 * description:
 */
public class Comment {
    private String context;
    private int userId;
    private int id;
    private int staffId;
    private long datetime;

    public Comment(CommentData data) {
        this.context = data.getContext();
        this.userId = data.getUserId();
        this.id = data.getId();
        this.staffId = data.getStaffId();
        this.datetime = data.getDatetime();
    }

    public Comment() {
    }

    private User user;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }
}
