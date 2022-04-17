package com.mscompra.service.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mscompra.model.Pedido;

import lombok.SneakyThrows;

@Service
public class Producer {

	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private ObjectMapper mapper;
	
	@SneakyThrows
	@PostMapping
	public void enviarPedido(Pedido pedido)  {
		rabbitTemplate.convertAndSend(queue.getName(), mapper.writeValueAsString(pedido));
	}
}
