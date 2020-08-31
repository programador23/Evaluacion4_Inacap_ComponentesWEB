package cl.inacap.Evaluacion3WAR.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.Evaluacion3Modelo.dao.ServicioLocal;
import cl.inacap.Evaluacion3Modelo.dto.Usuario;

/**
 * Servlet implementation class Valida
 */
@WebServlet("/Valida")
public class Valida extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       @Inject
       private ServicioLocal servicio;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Valida() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String nombre= request.getParameter("txtnombre");
		String password=request.getParameter("txtpassword");
		String A="";
		String B="b";
		
		List<Usuario> lista= this.servicio.getAll();
		
		
		Usuario user = null;
		
		for( Usuario u : lista) {
		if(u.getNombre().equals(nombre)&& u.getPassword().equals(password)) {
			user=u;
		}	
		}
		
		if(user!=null) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("inicioAdministrador.html");
			request.setAttribute("lista", lista);
			request.getRequestDispatcher("inicioAdministrador.html").forward(request, response);
			
		}else {
			request.setAttribute("error", "Usuario Incorrecto");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		
	}
		
		}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
