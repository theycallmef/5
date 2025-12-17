public class Main {
    public static void main(String[] args) {

        JobListing job1 = new JobListing("Website Development",
                "Create a company website", 500);
        JobListing job2 = new JobListing("Mobile App",
                "Build Android application", 800);

        Freelancer f1 = new Freelancer("Alice", "Java", 4.7);
        Freelancer f2 = new Freelancer("Bob", "Web Development", 4.3);

        Portal portal = new Portal("FreelanceHub", 2);

        System.out.println(job1);
        System.out.println(job2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(portal);

        // Сравнение вакансий
        if (job1.getBudget() > job2.getBudget()) {
            System.out.println("Job 1 has higher budget");
        } else {
            System.out.println("Job 2 has higher budget");
        }

        // Сравнение фрилансеров
        if (f1.getRating() > f2.getRating()) {
            System.out.println(f1.getName() + " has higher rating");
        } else {
            System.out.println(f2.getName() + " has higher rating");
        }

        portal.postJob();
    }
}