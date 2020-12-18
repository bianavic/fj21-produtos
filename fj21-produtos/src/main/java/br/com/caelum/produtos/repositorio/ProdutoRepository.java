package br.com.caelum.produtos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import br.com.caelum.produtos.modelo.Produto;

public interface ProdutoRepository extends Repository<Produto, Long> {
	
	Produto findById(Long id);

	List<Produto> findByPreco(double preco);
	List<Produto> findByMarcaNome(String nome);
	
	List<Produto> findAll();
}
