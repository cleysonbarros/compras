package com.mscompra.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscompra.model.Pedido;
import com.mscompra.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@PostMapping
	public ResponseEntity<Pedido> salvar(@Valid @RequestBody Pedido pedido){
		return ResponseEntity.ok(pedidoService.salvar(pedido));
	}

}
