package cl.inacap.Evaluacion3WAR.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.Evaluacion3Modelo.dao.ServicioLocal;
import cl.inacap.Evaluacion3Modelo.dto.Categoria;

/**
 * Servlet implementation class UpdateCategoria
 */
@WebServlet("/UpdateCategoria")
public class UpdateCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
     @Inject
     private ServicioLocal servicio;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mensaje="";
		String idcategoria=request.getParameter("txtidcategoria");
		String categoria=request.getParameter("txtcategoria");
		String detalle=request.getParameter("txtdetalle");
		Categoria ca=new Categoria(idcategoria,categoria,detalle);
		servicio.updateCategoria(ca);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("ListaCategoria").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
