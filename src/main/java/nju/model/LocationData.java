package nju.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "location")
public class LocationData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "name")
    private String name; //联系人

    @NotNull
    @Column(name = "phone")
    private String phone; //手机号

    @NotNull
    @Column(name = "address")
    private String address;//地址


    @Column(name = "addressDetail")
    private String addressDetail;//详细地址

    @Column(name = "userId")
    private Integer userId;//所属用户的id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
