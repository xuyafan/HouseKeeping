package nju.xyf.request;

import nju.model.UserData;

/**
 * author： xuyafan
 * description:
 */
public class User {
    private int id;
    private String avatar;  //头像
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(UserData data) {
        this.id = data.getId();
        this.avatar = data.getAvatar();
        this.username = data.getUsername();
        this.password = data.getPassword();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
