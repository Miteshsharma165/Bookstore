package com.bookstore.methodResources;

import java.text.SimpleDateFormat;

public class UtilToSqlDate {
	
	public static java.sql.Timestamp getSqldate(String date) {
		java.sql.Timestamp tempDate=new java.sql.Timestamp(0);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
		  java.util.Date utilDate= sdf.parse(date);
		  long l=utilDate.getTime();
		   java.sql.Timestamp sqlDate=new java.sql.Timestamp(l);
		   return sqlDate;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return tempDate;
		
	}
	

}
