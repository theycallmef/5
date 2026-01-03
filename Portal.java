import java.util.ArrayList;
import java.util.List;
public class Portal {
    private String portalName;
    private List<JobListing> jobs;
    private List<Freelancer> freelancers;

    public Portal(String portalName, int i) {
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
    public List<Freelancer> getFreelancers() {
        return freelancers;
    }
    public List<Freelancer> searchFreelancersBySkill(String skill) {
        List<Freelancer> result = new ArrayList<>();
        for (Freelancer f : freelancers) {
            if (f.getSkill().toLowerCase().contains(skill.toLowerCase())) {
                result.add(f);
            }
        }
        return result;
    }

    public List<JobListing> searchJobsByKeyword(String keyword) {
        List<JobListing> result = new ArrayList<>();
        for (JobListing job : jobs) {
            if (job.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || job.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(job);
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "Portal{" +
                "portalName='" + portalName + '\'' +
                ", jobs=" + jobs.size() +
                ", freelancers=" + freelancers.size() +
                '}';
    }

    public void postJob() {
    }
}
