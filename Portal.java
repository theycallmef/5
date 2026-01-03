import java.util.ArrayList;
import java.util.List;
public class Portal {
    private String portalName;
    private List<JobListing> jobs;
    private List<Freelancer> freelancers;

    public Portal(String portalName) {
        this.portalName = portalName;
        this.jobs = new ArrayList<>();
        this.freelancers = new ArrayList<>();
    }

    public String getPortalName() {
        return portalName;
    }

    public void setPortalName(String portalName) {
        this.portalName = portalName;
    }

    public void addJob(JobListing job) {
        jobs.add(job);
    }

    public void addFreelancer(Freelancer freelancer) {
        freelancers.add(freelancer);
    }
    public List<JobListing> getJobs() {
        return jobs;
    }
    public List<Freelancer> getFreelancers() {
        return freelancers;
    }

    @Override
    public String toString() {
        return "Portal{" +
                "portalName='" + portalName + '\'' +
                ", jobs=" + jobs.size() +
                ", freelancers=" + freelancers.size() +
                '}';
    }
}
