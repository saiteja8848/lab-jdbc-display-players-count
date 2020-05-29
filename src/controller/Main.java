package controller;

import java.sql.SQLException;

import dao.SkillDAO;

public class Main{
	public static void main(String args[]) throws SQLException {
   
		SkillDAO skillDao = new SkillDAO();
		skillDao.skillCount();
	
				
	}
}
