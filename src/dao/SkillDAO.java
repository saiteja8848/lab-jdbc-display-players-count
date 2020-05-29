package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {

	public TreeMap<Skill, Integer> skillCount() throws SQLException {
		Connection connection = ConnectionManager.getConnection();

		if (connection != null) {
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM SKILL";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString(2)+"-"+count(rs.getInt(1)));
			}

		}
		return null;
	}
	
	public int count(int id) throws SQLException {
		
		int count=0;
		Connection connection = ConnectionManager.getConnection();
		if(connection!=null) {
			
			Statement stmt = connection.createStatement();
			String sql = "select count(sid) from cricketplayers where sid ="+id;
			ResultSet rs = stmt.executeQuery(sql);			
			while (rs.next()) {
				count = Integer.parseInt(rs.getString("count(sid)"));				
			}
		 
		}
		return count;
	}
}
