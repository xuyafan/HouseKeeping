package nju.xyf.request;

import nju.model.ServiceData;

/**
 * author： xuyafan
 * description:
 */
public class Service {


    private Integer id;

    private String avatar;  //头像


    private String name;


    private String gender;


    private String age;


    private String phone;

    private String home; //籍贯

    public Service(ServiceData data) {
        this.id = data.getId();
        this.avatar = data.getAvatar();
        this.name = data.getName();
        this.gender = data.getGender();
        this.age = data.getAge();
        this.phone = data.getPhone();
        this.home = data.getHome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
}
