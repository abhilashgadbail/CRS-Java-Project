package com.lti.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	
	private static Connection connection = null;
	
	public static Connection getConnection() {
		
        if (connection != null)
            return connection;
        else {
            try {
            	Properties prop = new Properties();
              //  InputStream inputStream = DBUtils.class.getClassLoader().getResourceAsStream("./config.properties");
               // prop.load(inputStream);
            	
            	 //FileReader reader=new FileReader("./config.properties");  
                 
            	    //Properties p=new Properties();  
            	  //  prop.load(reader);  
            	
            	
                String driver = prop.getProperty("driver");
                String url = prop.getProperty("url");
                String user = prop.getProperty("user");
                String password = prop.getProperty("password");
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs", "root", "root");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } /*catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            return connection;
        }

    }


}

