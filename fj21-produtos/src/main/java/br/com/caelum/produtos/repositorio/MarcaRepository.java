package br.com.caelum.produtos.repositorio;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import br.com.caelum.produtos.modelo.Marca;

public interface MarcaRepository extends Repository<Marca, Long> {
	
	List<Marca> findAll(Sort ordenacao); // ordenacao dinamica
	List<Marca> findAllByOrderByNomeAsc();
	
	// listar marcas com quantidade minima de produtos
	@Query(value = "select m.* from marca m " 
			+ " inner join produto p on m.id = p.marca_id "
			+ " group by m.id, m.nome "
			+ "having count(m.id) >= :quantidade", nativeQuery = true)
	List<Marca> marcasComQuantidadeMinimaDeProdutos(int quantidade);
}
