package nju.xyf.request;

import nju.model.MessageData;

import java.util.Date;

/**
 * author： xuyafan
 * description:
 */
public class Message {

    private Integer id;

    private int orderId; //所属订单id

    private int userId; //客户id

    private int serviceId; //客服id

    private String content; //内容

    private long datetime; //时间

    private User user;

    private Service service;

    public Message() {
    }

    public Message(MessageData data) {
        this.id = data.getId();
        this.orderId = data.getOrderId();
        this.userId = data.getUserId();
        this.serviceId = data.getServiceId();
        this.content = data.getContent();
        this.datetime = data.getDatetime();
    }

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

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
