public abstract class User {
    private String name;

    public User(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + getRole() + '\'' +
                '}';
    }
}

