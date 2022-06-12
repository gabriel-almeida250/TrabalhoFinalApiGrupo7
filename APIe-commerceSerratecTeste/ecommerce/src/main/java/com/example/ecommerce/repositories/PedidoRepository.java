package com.example.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.ecommerce.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

	@Transactional
	@Modifying
	@Query("update Pedido pedido set pedido.statusPedido = ?1 where pedido.idPedido = ?2")
	int updatePedidoStatus(Boolean status, Integer id);
}
