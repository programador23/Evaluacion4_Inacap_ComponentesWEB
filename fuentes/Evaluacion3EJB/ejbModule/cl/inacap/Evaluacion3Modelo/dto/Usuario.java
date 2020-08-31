package cl.inacap.Evaluacion3Modelo.dto;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

@NamedQueries({
	@NamedQuery(name="Usuario.findAll",query="SELECT s FROM Usuario s")
	,@NamedQuery(name="Usuario.inicio",query="SELECT u FROM Usuario u WHERE u.nombre = :nombre AND u.password = :password")
})
public class Usuario implements Serializable {

	
	




	private static final long serialVersionUID = 1L;
	@Id
	private int idusuario;
	
	private String nombre;
	private String apellido;
	private String correo;
	private String password;
	
	private String tipousuario;
	
	
	

	

	






	public String getTipousuario() {
		return tipousuario;
	}






	public void setTipousuario(String tipousuario) {
		this.tipousuario = tipousuario;
	}






	public int getIdusuario() {
		return idusuario;
	}






	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}






	public String getNombre() {
		return nombre;
	}






	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






	public String getApellido() {
		return apellido;
	}






	public void setApellido(String apellido) {
		this.apellido = apellido;
	}






	public String getCorreo() {
		return correo;
	}






	public void setCorreo(String correo) {
		this.correo = correo;
	}






	public String getPassword() {
		return password;
	}






	public void setPassword(String password) {
		this.password = password;
	}





	public Usuario(int idusuario, String nombre, String apellido, String correo, String password, String tipousuario) {
		
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.password = password;
		this.tipousuario = tipousuario;
	}



	public Usuario() {
		super();
		
	}

	
	}
   





