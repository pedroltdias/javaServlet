package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class HelloWorld extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res){
		
		
	}
}
