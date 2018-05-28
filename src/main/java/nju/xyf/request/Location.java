package nju.xyf.request;

import nju.model.LocationData;

public class Location {
    private int id;
    private String name; //联系人
    private String phone; //手机号
    private String address;//地址
    private String addressDetail;//详细地址
    private int userId;

    public Location() {
    }

    public Location(LocationData data) {
        this.id = data.getId();
        this.userId = data.getUserId();
        this.name = data.getName();
        this.phone = data.getPhone();
        this.address = data.getAddress();
        this.addressDetail = data.getAddressDetail();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
