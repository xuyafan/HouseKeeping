package nju.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
* author: xuyafan
* description: 客服 实体类
 *
*/
@Entity
@Table(name = "service")
public class ServiceData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "gender")
    private String gender;

    @NotNull
    @Column(name = "age")
    private String age;

    @NotNull
    @Column(name = "phone")
    private String phone;

    @NotNull
    @Column(name = "home")
    private String home; //籍贯

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
