package nju.xyf.request;

import nju.model.StaffData;

/**
 * author： xuyafan
 * description:
 */
public class Staff {

    private int id;
    private String imgUrl;
    private String name;
    private String age;
    private String number;//工号
    private String home;//籍贯
    private String gender; //性别
    private String phone; //联系方式
    private String serviceType; //服务类型
    private String star; //星级
    private String payRequired; //薪酬报价
    private String exp; //工作经验
    private String serviceCount; //服务户数
    private String appointmentCount; //预约户数
    private String comment; //综合评论

    public Staff() {
    }

    public Staff(StaffData data) {
        this.id = data.getId();
        this.imgUrl = data.getImgUrl();
        this.name = data.getName();
        this.age = data.getAge();
        this.number = data.getNumber();
        this.home = data.getHome();
        this.gender = data.getGender();
        this.phone = data.getPhone();
        this.serviceType = data.getServiceType();
        this.star = data.getStar();
        this.payRequired = data.getPayRequired();
        this.exp = data.getExp();
        this.serviceCount = data.getServiceCount();
        this.appointmentCount = data.getAppointmentCount();
        this.comment = data.getComment();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
