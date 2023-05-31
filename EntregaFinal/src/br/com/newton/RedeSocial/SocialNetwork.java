package br.com.newton.RedeSocial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
class SocialNetwork {
    private List<User> users;

    public SocialNetwork() {
        this.users = new ArrayList<>();
    }

    public void registerUser(String name, String email, String password) {
        User newUser = new User(name, email, password);
        users.add(newUser);
    }

    public User login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void addFriend(User user, User friend) {
        user.addFriend(friend);
        friend.addFriend(user);
    }

    public void removeFriend(User user, User friend) {
        user.removeFriend(friend);
        friend.removeFriend(user);
    }

    public void sendMessage(User user, User friend, String message) {
        user.sendMessage(friend, message);
    }

    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
