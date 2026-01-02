public class JobListing {
    private String title;
    private String description;
    private double budget;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public JobListing(String title, String description, double budget) {
        this.title = title;
        this.description = description;
        setBudget(budget);
    }

    public void setBudget(double budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("Budget cannot be negative");
        }
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    @Override
    public String toString() {
        return "JobListing{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", budget=" + budget +
                '}';
    }
}
