package com.unla.Grupo8OO22020.services;

import java.util.List;
import com.unla.Grupo8OO22020.entities.Pedido;
import com.unla.Grupo8OO22020.models.PedidoModel;

public interface IPedidoService {
	
	public abstract List<Pedido> getAll();
	   
    public abstract List<PedidoModel> getAlls();
	
	public abstract  PedidoModel insert(PedidoModel pedidoModel);
	
	public abstract PedidoModel update(PedidoModel pedidoModel);
	
	public abstract boolean remove(long idPedido);

	public abstract PedidoModel findByIdPedido(long idPedido);

}