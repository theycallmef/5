public class Portal {
    private String portalName;
    private int jobCount;

    public Portal(String portalName, int jobCount) {
        this.portalName = portalName;
        this.jobCount = jobCount;
    }

    public String getPortalName() {
        return portalName;
    }

    public void setPortalName(String portalName) {
        this.portalName = portalName;
    }

    public int getJobCount() {
        return jobCount;
    }

    public void setJobCount(int jobCount) {
        this.jobCount = jobCount;
    }

    public void postJob() {
        jobCount++;
        System.out.println("New job posted. Total jobs: " + jobCount);
    }

    @Override
    public String toString() {
        return "Portal{" +
                "portalName='" + portalName + '\'' +
                ", jobCount=" + jobCount +
                '}';
    }
}
