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
import cl.inacap.Evaluacion3Modelo.dto.Usuario;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Inject
       private ServicioLocal servicio;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String btn=request.getParameter("btn");
		List<Usuario> usuarios;
		String mensaje="";
		int idusuario=0;
		String nombre="";
		String apellido="";
		String correo="";
		String password="";
		String tipousuario="";
		
		
	switch(btn) {
	case"1":
		List<Usuario> lista = this.servicio.getAll();
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("lista.jsp").forward(request, response);
		break;
	case"2":
		//agregar
		idusuario=Integer.parseInt(request.getParameter("txtidusuario"));
		nombre=request.getParameter("txtnombre");
		apellido=request.getParameter("txtapellido");
		correo=request.getParameter("txtcorreo");
		password=request.getParameter("txtpassword");
		tipousuario=request.getParameter("txttipousuario");
		Usuario s = new Usuario(idusuario,nombre,apellido,correo,password,tipousuario);
		
		
		mensaje=servicio.add(s);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("agregar.jsp").forward(request, response);
		break;
	case"3":
		//Eliminar
		idusuario=Integer.parseInt("txtidusuario");
		servicio.delete(idusuario);
	
		usuarios=this.servicio.getAll();
		request.setAttribute("usuarios", usuarios);
		request.getRequestDispatcher("listar.jsp").forward(request, response);
		break;
	case"4":
		//actulizar
		idusuario=Integer.parseInt("txtidusuario");
		nombre=request.getParameter("txtnombre");
		apellido=request.getParameter("txtapellido");
		correo=request.getParameter("txtcorreo");
		password=request.getParameter("txtpassword");
		tipousuario=request.getParameter("txttipousario");
		Usuario su= new Usuario(idusuario,nombre,apellido,correo,password,tipousuario);
		
		
		servicio.update(su);
		usuarios=this.servicio.getAll();
		break;
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
