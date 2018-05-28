package nju.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * author: xuyafan
 * description: 店面 实体类
 */
@Entity
@Table(name = "store")
public class StoreData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @NotNull
    @Column(name = "name")
    private String name; //店面名称


    @Column(name = "address")
    private String address; //地址


    @NotNull
    @Column(name = "phone")
    private String phone; //联系电话

    @NotNull
    @Column(name = "staffId")
    private Integer staffId; //负责员工id

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}
