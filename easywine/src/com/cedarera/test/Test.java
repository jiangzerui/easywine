package com.cedarera.test;

import java.awt.image.SampleModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ file_name Test.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2013-4-16上午9:56:30
 * @ description
 * @ reviewed_by 
 */
public class Test {
   
	
	//1364745600
	//1366128000
	public static void main(String[] args) throws ParseException {
		
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   Date d = sdf.parse("2013-04-17");
	   System.out.println( d.getTime());
	   
	   Date d1 = new Date(d.getTime());
	   System.out.println(d1);
	}
	
}
