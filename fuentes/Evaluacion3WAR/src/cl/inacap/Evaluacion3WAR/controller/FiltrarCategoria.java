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
 * Servlet implementation class FiltrarCategoria
 */
@WebServlet("/FiltrarCategoria")
public class FiltrarCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Inject
       private ServicioLocal servicio;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FiltrarCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String idcategoria="C1";
		List<Producto> listaProducto=this.servicio.getporCategoria(idcategoria);
		List<Categoria> categorias=this.servicio.CategoriaAll();
		request.setAttribute("listaProducto", listaProducto);
		request.setAttribute("categoria", categorias);
		request.getRequestDispatcher("listaProducto.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
