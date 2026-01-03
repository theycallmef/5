public class Freelancer extends User {

    private String skill;
    private double rating;

    public Freelancer(String name, String skill, double rating) {
        super(name);          // имя передаём в User
        this.skill = skill;
        setRating(rating);
    }

    @Override
    public String getRole() {
        return "FREELANCER";
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 0 and 5");
        }
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "name='" + getName() + '\'' +
                ", role='" + getRole() + '\'' +
                ", skill='" + skill + '\'' +
                ", rating=" + rating +
                '}';
    }
}
