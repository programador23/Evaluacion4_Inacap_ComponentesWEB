package cl.inacap.Evaluacion3Modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import cl.inacap.Evaluacion3Modelo.dto.Categoria;
import cl.inacap.Evaluacion3Modelo.dto.Producto;
import cl.inacap.Evaluacion3Modelo.dto.Usuario;

/**
 * Session Bean implementation class Servicio
 */
@Stateless
@LocalBean
public class Servicio implements ServicioLocal {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Evaluacion3EJB");

	/**
	 * Default constructor.
	 */
	public Servicio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Usuario> getAll() {
		// vista
		EntityManager em = this.emf.createEntityManager();
		try {
			List<Usuario> usuarios = em.createNamedQuery("Usuario.findAll", Usuario.class).getResultList();
			return usuarios;
		} catch (Exception ex) {
			return null;
		} finally {
			em.close();
		}

	}

	@Override
	public String add(Usuario s) {
		// agregar
		EntityManager em = this.emf.createEntityManager();
		try {

			em.persist(s);
			em.flush();
			return "Usuario registrado";

		} catch (Exception e) {

			return e.toString();
		} finally {
			em.close();
		}

	}

	@Override
	public void delete(int id) {
		// eliminar
		EntityManager em = this.emf.createEntityManager();
		Usuario s = new Usuario();
		try {
			s = em.find(Usuario.class, id);
			em.remove(s);
			em.flush();

		} catch (Exception e) {

		} finally {
			em.close();
		}

	}

	@Override
	public void update(Usuario su) {
		// actualizar
		try {
			EntityManager em = this.emf.createEntityManager();
			Usuario s = new Usuario();
			s = em.find(Usuario.class, su.getIdusuario());
			s.setNombre(su.getNombre());
			s.setApellido(su.getApellido());
			s.setCorreo(su.getCorreo());
			s.setPassword(su.getCorreo());
			s.setTipousuario(su.getTipousuario());
			em.merge(su);
			em.flush();
		} catch (Exception e) {

		} finally {
			emf.close();
		}
	}

	@Override
	public List<Producto> productoAll() {
		// lista todos los productos
		EntityManager em = this.emf.createEntityManager();
		try {
			List<Producto> productos = em.createNamedQuery("Producto.findAll", Producto.class).getResultList();
			return productos;
		} catch (Exception e) {
			return null;
		} finally {
			em.close();
		}
	}

	@Override
	public String agregarProducto(Producto p) {
		// TODO Auto-generated method stub
		EntityManager em = this.emf.createEntityManager();
		try {

			em.persist(p);
			em.flush();
			return "Producto registrado";

		} catch (Exception e) {

			return e.toString();
		} finally {
			em.close();
		}
	}

	@Override
	public void deleteProducto(int idproducto) {
		// TODO Auto-generated method stub
		EntityManager em = this.emf.createEntityManager();
		Producto p = new Producto();
		try {
			p = em.find(Producto.class, idproducto);
			em.remove(p);
			em.flush();
			
		} catch (Exception e) {

		} finally {
			
			em.close();
			
		}

	}

	@Override
	public String updateProducto(Producto po) {
		// TODO Auto-generated method stub
		EntityManager em = this.emf.createEntityManager();
		Producto p=new Producto();
		// actualizar
		try {
			
			p = em.find(Producto.class, po.getIdproducto());
			p.setNombre(po.getNombre());
			p.setDescripcion(po.getDescripcion());
			p.setPrecio(po.getPrecio());
			p.setStock(po.getStock());
			p.setStokminimo(po.getStokminimo());
			em.merge(po);
			em.flush();
			return "Producto Modificado con Exito";
		} catch (Exception e) {
			return e.toString();
		} finally {
			em.close();
			
		}	
		
	}

	@Override
	public String agregarCategoria(Categoria c) {
		// TODO Auto-generated method stub
		
		EntityManager em = this.emf.createEntityManager();
		try {

			em.persist(c);
			em.flush();
			return "Categoria registrada con Exito";

		} catch (Exception e) {

			return e.toString();
		} finally {
			em.close();
		}
	}

	@Override
	public List<Categoria> CategoriaAll() {
		
		EntityManager em = this.emf.createEntityManager();
		try {
			List<Categoria> categorias = em.createNamedQuery("Categoria.findAll", Categoria.class).getResultList();
			return categorias;
		} catch (Exception e) {
			return null;
		} finally {
			em.close();
		}
	}
	
	

	@Override
	public String updateCategoria(Categoria ca) {
		// TODO Auto-generated method stub
		EntityManager em = this.emf.createEntityManager();
		Categoria c=new Categoria();
try {
			
			c = em.find(Categoria.class, ca.getIdcategoria());
			c.setIdcategoria(ca.getIdcategoria());
			c.setCategoria(ca.getCategoria());
			c.setDetalle(ca.getDetalle());
			em.merge(ca);
			em.flush();
			return "Categoria Modificada con Exito";
		} catch (Exception e) {
			return e.toString();
		} finally {
			em.close();
		
		return null;
	}

	}

	@Override
	public List<Producto> getporCategoria(String idcategoria) {
		// TODO buscar por categoria
		EntityManager em = this.emf.createEntityManager();
		TypedQuery<Producto>filtraporcategoria = em.createNamedQuery("Producto.findByidcategoria",Producto.class);
		filtraporcategoria.setParameter("idcategoria", idcategoria);
		List<Producto>productos=filtraporcategoria.getResultList();
		em.close();
		return productos;
		
	}

	@Override
	public ArrayList<Usuario> getArrayUsuario() {
		EntityManager em = this.emf.createEntityManager();
		
			ArrayList<Usuario> lista = (ArrayList<Usuario>) em.createNamedQuery("Usuario.findAll", Usuario.class).getResultList();
			return lista;
		

	}
	}
