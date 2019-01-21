package com.company.mediator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("админ уже есть либо не хватает прав");
        }
    }

    public void addUser(User u) {
        if (admin != null) {
            if (u instanceof JustUser) {
                users.add(u);
            } else throw new RuntimeException("админ не может войти в другой чат");
        } else throw new RuntimeException("в чате нет админа ");
    }

    @Override
    public void sednMessage(String message, User user) {
        if (user instanceof Admin) {
            for (User u : users) {
                u.getMessage(user.getName() + " : " + message);
            }
        }
        if (user instanceof JustUser) {
            for (User u : users) {
                if ((u != user) && (u.isEnable())) {
                    u.getMessage(user.getName() + " : " + message);
                }
            }
        }
        if (admin.isEnable()) {
            admin.getMessage(user.getName() + " : " + message);
        }
    }
}
