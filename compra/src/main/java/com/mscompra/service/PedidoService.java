package com.mscompra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscompra.model.Pedido;
import com.mscompra.repository.PedidoRepository;
import com.mscompra.service.rabbitmq.Producer;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private Producer producer;
	
	public Pedido salvar(Pedido pedido) {
		pedido= pedidoRepository.save(pedido);
	    producer.enviarPedido(pedido);
	    return pedido;
	}
	
	
	

}
