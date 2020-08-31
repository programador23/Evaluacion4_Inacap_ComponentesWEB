package cl.inacap.Evaluacion3WAR.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.Evaluacion3Modelo.dao.ServicioLocal;
import cl.inacap.Evaluacion3Modelo.dto.Producto;

/**
 * Servlet implementation class ControladorProducto
 */
@WebServlet("/ControladorProducto")
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Inject
       private ServicioLocal servicio;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String mensaje="";

		
		
		int idproducto= Integer.parseInt(request.getParameter("txtidproducto"));
		String nombre=request.getParameter("txtnombre");
		String descripcion=request.getParameter("txtdescripcion");
		int precio=Integer.parseInt(request.getParameter("txtprecio"));
		int stock=Integer.parseInt(request.getParameter("txtstock"));
		int stockminimo=Integer.parseInt(request.getParameter("txtstockminimo"));
		String idcategoria=request.getParameter("txtidcategoria").toUpperCase() ;
		Producto p = new Producto(idproducto,nombre,descripcion,precio,stock,stockminimo,idcategoria);
		
		mensaje=servicio.agregarProducto(p);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("AgregarProducto.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
