package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaEmpresas {
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		request.setAttribute("empresas", lista);
		rd.forward(request, response);
	}
}
