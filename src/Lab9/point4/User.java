package Lab9.point4;

import java.util.Objects;

public class User {
    private String name;

    public User() {
        name = null;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(user.getName(), this.name);
    }

}

