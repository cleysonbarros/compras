package com.workercompras.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@ToString
public class Pedido  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nome;
	
	private Long produto;
	
	private BigDecimal valor;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date compra;
	
	private String cpfCliente;
	
	private String cep;

}
