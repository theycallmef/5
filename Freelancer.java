public class Freelancer {
    private String name;
    private String skill;
    private double rating;

    public Freelancer(String name, String skill, double rating) {
        this.name = name;
        this.skill = skill;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.rating = rating;
    }
    public void setBudget(double budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("Budget cannot be negative");
        }
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", rating=" + rating +
                '}';
    }
}
