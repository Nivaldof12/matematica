package br.com.infnet.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.model.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
