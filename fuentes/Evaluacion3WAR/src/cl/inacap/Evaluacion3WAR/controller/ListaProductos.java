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
import cl.inacap.Evaluacion3Modelo.dto.Categoria;
import cl.inacap.Evaluacion3Modelo.dto.Producto;

/**
 * Servlet implementation class ListaProductos
 */
@WebServlet("/ListaProductos")
public class ListaProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
      @Inject
      private ServicioLocal servicio;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//lista de productos
		List<Producto> listaProductos =this.servicio.productoAll();
		List<Categoria> categorias=this.servicio.CategoriaAll();
		request.setAttribute("listaProducto", listaProductos);
		request.setAttribute("categorias", categorias);
		request.getRequestDispatcher("listaProducto.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
