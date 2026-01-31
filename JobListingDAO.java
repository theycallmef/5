import config.DatabaseConnection;
import domain.JobListing;

import java.sql.*;
public class JobListingDAO {

    public void addJob(JobListing job) throws SQLException {
        String sql =
                "INSERT INTO job_listing (title, description, budget) VALUES (?, ?, ?)";

        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, job.getTitle());
        stmt.setString(2, job.getDescription());
        stmt.setDouble(3, job.getBudget());

        stmt.executeUpdate();
    }

    public void getAllJobs() throws SQLException {
        String sql = "SELECT * FROM job_listing";

        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("title") + " | " +
                            rs.getDouble("budget")
            );
        }
    }

    public void updateBudget(int id, double newBudget) throws SQLException {
        String sql =
                "UPDATE job_listing SET budget = ? WHERE id = ?";

        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setDouble(1, newBudget);
        stmt.setInt(2, id);

        stmt.executeUpdate();
    }

    public void deleteJob(int id) throws SQLException {
        String sql = "DELETE FROM job_listing WHERE id = ?";

        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
}