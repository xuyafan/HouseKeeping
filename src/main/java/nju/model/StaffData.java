package nju.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 家政人员实体类（保姆，月嫂，家政等）
 */
@Entity
@Table(name = "staff")
public class StaffData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @NotNull
    @Column(name = "imgUrl")
    private String imgUrl; //头像url

    @NotNull
    @Column(name = "number")
    private String number; //工号

    @NotNull
    @Column(name = "name")
    private String name; //姓名

    @NotNull
    @Column(name = "gender")
    private String gender; //性别

    @NotNull
    @Column(name = "age")
    private String age; //年龄

    @NotNull
    @Column(name = "phone")
    private String phone; //联系方式

    @NotNull
    @Column(name = "home")
    private String home; //籍贯

    @NotNull
    @Column(name = "serviceType")
    private String serviceType; //服务类型

    @NotNull
    @Column(name = "star")
    private String star; //星级

    @NotNull
    @Column(name = "payRequired")
    private String payRequired; //薪酬报价

    @NotNull
    @Column(name = "exp")
    private String exp; //工作经验


    @Column(name = "serviceCount")
    private String serviceCount; //服务户数


    @Column(name = "appointmentCount")
    private String appointmentCount; //预约户数


    @Column(name = "comment")
    private String comment; //综合评论

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getPayRequired() {
        return payRequired;
    }

    public void setPayRequired(String payRequired) {
        this.payRequired = payRequired;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(String serviceCount) {
        this.serviceCount = serviceCount;
    }

    public String getAppointmentCount() {
        return appointmentCount;
    }

    public void setAppointmentCount(String appointmentCount) {
        this.appointmentCount = appointmentCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
