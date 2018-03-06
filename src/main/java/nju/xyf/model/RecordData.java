package nju.xyf.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
* author: xuyafan
* description: 订单 实体类
*/
@Entity
@Table(name = "record")
public class RecordData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @NotNull
    @Column(name = "employerId")
    private Integer employerId; //雇主id

    @NotNull
    @Column(name = "employeeId")
    private Integer employeeId; //雇员id
    //可以为空

    @NotNull
    @Column(name = "staffId")
    private Integer staffId; //客服员工id

    @NotNull
    @Column(name = "appointmentId")
    private Integer appointmentId; //预约表id


    @NotNull
    @Column(name = "recordDescription")
    private String recordDescription;

    /**
     订单详细信息

     {
     “订单状态”：“新建态、发布态、面试态、签约态、售后态”
     “付款”：“已付款”
     “付款金额”：“10000元”
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

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getRecordDescription() {
        return recordDescription;
    }

    public void setRecordDescription(String recordDescription) {
        this.recordDescription = recordDescription;
    }
}
