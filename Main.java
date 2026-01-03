public class Main {
    public static <portal> void main(String[] args) {

        JobListing job1 = new JobListing("Website Development",
                "Create a company website", 5000);
        JobListing job2 = new JobListing("Mobile App",
                "Build Android application", 800);

        Freelancer f1 = new Freelancer("Alice", "Java", 4.7);
        Freelancer f2 = new Freelancer("Bob", "Web Development", 4.3);

        Portal portal = new Portal("FreelanceHub", 2);

        portal.addJob(job1);
        portal.addJob(job2);

        portal.addFreelancer(f1);
        portal.addFreelancer(f2);

        System.out.println(portal.searchJobsByKeyword("app"));
        System.out.println(portal.searchFreelancersBySkill("java"));


        System.out.println(job1);
        System.out.println(job2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(portal);

        if (job1.getBudget() > job2.getBudget()) {
            System.out.println("Job 1 has higher budget");
        } else {
            System.out.println("Job 2 has higher budget");
        }
        if (f1.getRating() > f2.getRating()) {
            System.out.println(f1.getName() + " has higher rating");
        } else {
            System.out.println(f2.getName() + " has higher rating");
        }}}