package sample.models;

import javafx.beans.property.StringProperty;

public class User {
    private final StringProperty username;
    private final StringProperty password;

    public User(StringProperty username, StringProperty password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username.get();
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }
}
