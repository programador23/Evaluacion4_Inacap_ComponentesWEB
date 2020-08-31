package cl.inacap.Evaluacion3WAR.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import cl.inacap.Evaluacion3Modelo.dao.ServicioLocal;
import cl.inacap.Evaluacion3Modelo.dto.Usuario;

/**
 * Application Lifecycle Listener implementation class ListenerUsuario
 *
 */
@WebListener
public class ListenerUsuario implements ServletContextListener {
@Inject
private ServicioLocal servicio;
    /**
     * Default constructor. 
     */
    public ListenerUsuario() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	List<Usuario> lista = this.servicio.getAll();
    	sce.getServletContext().setAttribute("listausuario", lista);
    	
    }
	
}
