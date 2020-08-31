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
 * Servlet implementation class AgregarCategoria
 */
@WebServlet("/AgregarCategoria")
public class AgregarCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Inject
    private ServicioLocal servicio;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCategoria() {
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
		
		mensaje=servicio.agregarCategoria(ca);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("AgregarCategoria.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
