package tian.pusen.entity;

import java.io.Serializable;

/**
 * Created by tianpusen on 2017/3/24.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    private String userID;
    private String userName;
    private String password;
    private String message;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
