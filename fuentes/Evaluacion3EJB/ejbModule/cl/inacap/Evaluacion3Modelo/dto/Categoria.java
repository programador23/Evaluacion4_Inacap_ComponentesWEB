package cl.inacap.Evaluacion3Modelo.dto;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Categoria
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Categoria.findAll",query="SELECT c FROM Categoria c")
	
})

public class Categoria implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	String idcategoria;
	
	String categoria;
	String detalle;
	

	


	public String getIdcategoria() {
		return idcategoria;
	}


	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	
	

	public Categoria(String idcategoria, String categoria, String detalle) {
		
		this.idcategoria = idcategoria;
		this.categoria = categoria;
		this.detalle = detalle;
	}


	public Categoria() {
		super();
	}
   
}
