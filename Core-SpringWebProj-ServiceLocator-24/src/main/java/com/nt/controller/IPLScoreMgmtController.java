package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IPLScoreMgmt;

@WebServlet("/controller")
public class IPLScoreMgmtController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ApplicationContext ac = null;
    private IPLScoreMgmt service = null;
    public IPLScoreMgmtController() {
        super();
        System.out.println("IPLScoreMgmtController.IPLScoreMgmtController()");
        
    }
   @Override
   public void init() throws ServletException {
	System.out.println("IPLScoreMgmtController.init()");
	ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	 service = ac.getBean("service",IPLScoreMgmt.class);
	
   }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IPLScoreMgmtController.doGet()");
		int mid = 0;
		RequestDispatcher rd = null;
		mid = Integer.parseInt(request.getParameter("mid"));
		
		String result = service.getScoreById(mid);
		request.setAttribute("result",result);
		rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IPLScoreMgmtController.doPost()");
		doGet(request, response);
	}

}
