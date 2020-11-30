package br.com.cwi.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cwi.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
