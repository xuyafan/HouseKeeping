package nju.xyf.request;

public class Order {

    public static final String ORDER_TYPE_IN = "预约中";
    public static final String ORDER_TYPE_ON = "已签单";
    public static final String ORDER_TYPE_COMPLETE = "已完成";


    private int id;
    private User user; //顾客
    private Staff staff; //员工
    private OrderCondition orderCondition; //查询条件
    private Location location;
    private String orderType; //订单状态：预约中、已签单、已完成

    private int locationId;
    private int userId;
    private int staffId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderCondition getOrderCondition() {
        return orderCondition;
    }

    public void setOrderCondition(OrderCondition orderCondition) {
        this.orderCondition = orderCondition;
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

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
