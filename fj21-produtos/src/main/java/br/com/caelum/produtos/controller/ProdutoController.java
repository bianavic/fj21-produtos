package br.com.caelum.produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.produtos.modelo.Produto;
import br.com.caelum.produtos.repositorio.ProdutoRepository;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtos;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> todosOsProdutos(@RequestParam(required = false) String nomeDaMarca) {
		if (nomeDaMarca == null) {
			return ResponseEntity.ok(produtos.findAll());
		} else {
			return ResponseEntity.ok(produtos.findByMarcaNome(nomeDaMarca));

		}		
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> porId(@PathVariable Long id) {
		return ResponseEntity.ok(produtos.findById(id));
	}

}
