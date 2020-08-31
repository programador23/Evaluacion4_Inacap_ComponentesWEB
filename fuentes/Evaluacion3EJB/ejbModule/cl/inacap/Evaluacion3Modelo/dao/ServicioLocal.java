package cl.inacap.Evaluacion3Modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;

import cl.inacap.Evaluacion3Modelo.dto.Categoria;
import cl.inacap.Evaluacion3Modelo.dto.Producto;
import cl.inacap.Evaluacion3Modelo.dto.Usuario;


@Local
public interface ServicioLocal {
	//vista  usuario
	public List<Usuario>getAll();
	//agregar
	public String add(Usuario s);
	//eliminar
	public void delete(int idUsuario);
	//modificar
	public void update(Usuario su);
	//vista Producto
	public List<Producto>productoAll();
	//agregar producto
	public String agregarProducto(Producto p);
	//eliminar producto
	public void deleteProducto(int idproducto);
	//actualizar producto
	public String updateProducto(Producto po);
	
	//agregar categoria
	public String agregarCategoria(Categoria c);
	//lista categoria
	public List<Categoria>CategoriaAll();
	//modificar categoria
	public String updateCategoria(Categoria c);
	
	 public List<Producto>getporCategoria(String idcategoria);
	 
	 public ArrayList<Usuario>getArrayUsuario();
	 
}
