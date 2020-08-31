package cl.inacap.Evaluacion3Modelo.dto;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Producto.findAll", query = "SELECT p FROM Producto p")
	,@NamedQuery(name ="Producto.findByidcategoria", query= "SELECT po FROM Producto po WHERE po.idcategoria = :idcategoria")
})
	

public class Producto implements Serializable {
@Id
	
	private int idproducto;

	private String nombre;
	private String descripcion;
	private int precio;
	private int stock;
	private int stockminimo;
	private String idcategoria;
	
	
	private static final long serialVersionUID = 1L;

	public Producto() {
		super();
	}   
	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}   
	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}   
	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}   
	
	public int getStokminimo() {
		return stockminimo;
	}
	public void setStokminimo(int stockminimo) {
		this.stockminimo = stockminimo;
	}
	public String getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}
	public Producto(int idproducto, String nombre, String descripcion, int precio, int stock, int stockminimo,
			String idcategoria) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.stockminimo = stockminimo;
		this.idcategoria = idcategoria;
	}
   
}
