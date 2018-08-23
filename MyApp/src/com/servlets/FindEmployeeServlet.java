package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Employee;
import com.pojo.EmployeeDAO;

/**
 * Servlet implementation class FindEmployeeServlet
 */
@WebServlet("/showAll")
public class FindEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> list = dao.findAllEmployees();
		request.setAttribute("employees", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
		dispatcher.forward(request, response);
		
	}

}
