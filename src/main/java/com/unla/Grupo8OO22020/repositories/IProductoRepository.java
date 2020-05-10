package com.unla.Grupo8OO22020.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.Grupo8OO22020.entities.Producto;

@Repository("productoRepository")
public interface IProductoRepository extends JpaRepository<Producto, Serializable> {

	public abstract Producto findByIdProducto(long idProducto);
	
	public abstract Producto findByDescripcion(String descripcion);
	
	
	
}