package com.sg.trraining.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.catalina.User;

import com.sg.training.model.Order;

@WebServlet("/order-now")
public class OrderNowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out=response.getWriter()){
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
			Date date=new Date();
			User user=(User) request.getSession().getAttribute("auth");
			if(auth!=null) {
				String productId=request.getParameter("id");
				int productQuantity=Integer.parseInt(request.getParameter("quantity"));
				if(productQuantity<=0) {
					productQuantity=1;
				}
				Order orderModel =new Order();
				orderModel.setId(Integer.parseInt(productId));
				orderModel.setUid(auth.getId());
				orderModel.setQuantity(Integer.parseInt(productQuantity));
				orderModel.setDate(formatter.formate(date));
				
				
			}else {
				response.sendRedirect("login.jsp");
			}
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
