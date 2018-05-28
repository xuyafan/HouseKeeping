package nju.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * author: xuyafan
 * description: 订单 实体类
 */
@Entity
@Table(name = "orderData")
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "orderType")
    private String orderType; //订单状态：预约中、已签单、已完成


    @NotNull
    @Column(name = "userId")
    private Integer userId; //雇主id

    @NotNull
    @Column(name = "staffId")
    private Integer staffId; //雇员(保姆月嫂等)id


    //可以为空
    @Column(name = "serviceId")
    private Integer serviceId; //客服员工id


    /**
     * 具体服务条件
     */

    @Column(name = "locationId")
    private Integer locationId; //服务地址Id


    @Column(name = "serviceType")
    private String serviceType; //服务类型

    @Column(name = "startDate")
    private Long startDate;

    @Column(name = "endDate")
    private Long endDate;


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

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }


    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
