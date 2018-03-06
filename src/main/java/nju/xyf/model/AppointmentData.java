package nju.xyf.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
* author: xuyafan
* description: 预约单 实体类
*/
@Entity
@Table(name = "appointment")
public class AppointmentData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @NotNull
    @Column(name = "employerId")
    private Integer employerId; //雇主id

    @NotNull
    @Column(name = "date")
    private Date date; //预约日期

    @NotNull
    @Column(name = "address")
    private String address; //服务地址

    @NotNull
    @Column(name = "serviceType")
    private String serviceType; //服务类型

    @NotNull
    @Column(name = "appointmentDescription")
    private String appointmentDescription; //预约说明

    /**orderDescription 说明
     * {
     "服务内容": "做饭-做家务-照顾自理老人",
     “保姆类型”：“住家型”or“不住家型”“钟点工”，
     “薪酬范围”：“5000-8000”，
     “年龄要求”：“30-40”，
     “工作经验”：“2年以上”or“不限”，
     “特殊需求”：“自定义”
     “籍贯要求”：“不限”
     }
     */



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Integer employerId) {
        this.employerId = employerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }
}
