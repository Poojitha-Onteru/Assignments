package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.model.LeaderBoard;

public class LeaderBoardDao {
	
	public List<LeaderBoard> getLeaderboardByQuiz(int quizId) {
        List<LeaderBoard> leaderboard = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT u.username, u.email, qa.score, qa.total_questions " +
                          "FROM quiz_attempts qa " +
                          "INNER JOIN users u ON qa.user_id = u.user_id " +
                          "WHERE qa.quiz_id = ? " +
                          "ORDER BY qa.score DESC, qa.attempted_at ASC";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, quizId);
            
            ResultSet rs = pstmt.executeQuery();
            int srNo = 1;
            while (rs.next()) {
                LeaderBoard entry = new LeaderBoard();
                entry.setSrNo(srNo++);
                entry.setUsername(rs.getString("username"));
                entry.setEmail(rs.getString("email"));
                entry.setScore(rs.getInt("score"));
                entry.setTotalQuestions(rs.getInt("total_questions"));
                leaderboard.add(entry);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return leaderboard;
    }
    
    public List<LeaderBoard> getAllLeaderboard() {
        List<LeaderBoard> leaderboard = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT u.username, u.email, SUM(qa.score) as total_score, SUM(qa.total_questions) as total_questions " +
                          "FROM quiz_attempts qa " +
                          "INNER JOIN users u ON qa.user_id = u.user_id " +
                          "GROUP BY u.user_id " +
                          "ORDER BY total_score DESC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            int srNo = 1;
            while (rs.next()) {
                LeaderBoard entry = new LeaderBoard();
                entry.setSrNo(srNo++);
                entry.setUsername(rs.getString("username"));
                entry.setEmail(rs.getString("email"));
                entry.setScore(rs.getInt("total_score"));
                entry.setTotalQuestions(rs.getInt("total_questions"));
                leaderboard.add(entry);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return leaderboard;
    }

}
