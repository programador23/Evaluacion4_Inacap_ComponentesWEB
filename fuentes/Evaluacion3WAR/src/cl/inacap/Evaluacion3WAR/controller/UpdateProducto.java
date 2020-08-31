package cl.inacap.Evaluacion3WAR.controller;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.Evaluacion3Modelo.dao.ServicioLocal;
import cl.inacap.Evaluacion3Modelo.dto.Producto;

/**
 * Servlet implementation class UpdateProducto
 */
@WebServlet("/UpdateProducto")
public class UpdateProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Inject
       private ServicioLocal servicio;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// update Producto
		List<Producto>productos;
		String mensaje="";
		
		int idproducto= Integer.parseInt(request.getParameter("txtidproducto"));
		String nombre=request.getParameter("txtnombre");
		String descripcion=request.getParameter("txtdescripcion");
		int precio=Integer.parseInt(request.getParameter("txtprecio"));
		int stock=Integer.parseInt(request.getParameter("txtstock"));
		int stockminimo=Integer.parseInt(request.getParameter("txtstockminimo"));
		String idcategoria=request.getParameter("txtidcategoria").toUpperCase() ;
		Producto po = new Producto(idproducto,nombre,descripcion,precio,stock,stockminimo,idcategoria);
		servicio.updateProducto(po);
		
		productos=this.servicio.productoAll();
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("ListaProductos").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
