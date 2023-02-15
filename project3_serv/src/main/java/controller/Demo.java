package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Studentdao;
import dto.Student;



public class Demo extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=arg0.getParameter("stdid");
		int stdid=Integer.parseInt(s1);
		
		String stdname=arg0.getParameter("stdname");
		
		Student student=new Student();
		student.setStdid(stdid);
		student.setStdname(stdname);
		
		Studentdao studentdao=new Studentdao();
		studentdao.Insert(student);
	}

}
