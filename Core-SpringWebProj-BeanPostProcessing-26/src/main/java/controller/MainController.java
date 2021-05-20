package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDto;
import com.nt.dto.StudentDto;
import com.nt.service.RegistrationService;

@WebServlet(value = "/controller",loadOnStartup = 1)
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ApplicationContext ac = null;   
    RegistrationService service = null;
    public MainController() {
        super();
       
       
    }

	@Override
	public void init() throws ServletException {
		System.out.println("MainController.init()");	
		ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        System.out.println("container Created");
      service = ac.getBean("service",RegistrationService.class);
	
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqtype = request.getParameter("reqType");
	    RequestDispatcher rd =null;
	    String resultPage = null;
	   
		if(reqtype.equalsIgnoreCase("stdreg")) {
			StudentDto dto = null;
			
			dto = ac.getBean("sdto",StudentDto.class);
			dto.setId(Integer.parseInt(request.getParameter("sid")));
			dto.setName(request.getParameter("sname"));
			dto.setM1(Integer.parseInt(request.getParameter("m1")));
			dto.setM1(Integer.parseInt(request.getParameter("m2")));
			dto.setM1(Integer.parseInt(request.getParameter("m3")));
			String result =service.stdRegister(dto);
			request.setAttribute("result", result);
			resultPage = "/result.jsp";
			
		}
		else if(reqtype.equalsIgnoreCase("empreg")) {
			 EmployeeDto dto = null;
			 dto = ac.getBean("edto",EmployeeDto.class);
			 dto.setId(Integer.parseInt(request.getParameter("eid")));
			 dto.setName(request.getParameter("ename"));
			 dto.setSalary(Float.parseFloat(request.getParameter("salary")));
			 String result =service.empRegister(dto);
			 request.setAttribute("result", result);
			 resultPage = "/result.jsp";
		}
		
		rd = request.getRequestDispatcher(resultPage);
		rd.forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
    @Override
    public void destroy() {
    	System.out.println("MainController.destroy()");
    	((AbstractApplicationContext) ac).close();
    }
}
