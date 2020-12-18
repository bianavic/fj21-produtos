package br.com.caelum.produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.produtos.modelo.Marca;
import br.com.caelum.produtos.repositorio.MarcaRepository;

@RestController
public class MarcaController {
	
	@Autowired
	private MarcaRepository marcas;
	
	@GetMapping("/marcas")
	public ResponseEntity<List<Marca>> marcasOrdenadas() {
		// return ResponseEntity.ok(marcas.findByOrderByNameAsc());
		return ResponseEntity.ok(marcas.findAll(Sort.by("nome")));
	}

	@GetMapping("/marcas/multiplas-categorias")
	public ResponseEntity<List<Marca>> marcasComMuitasCategorias(@RequestParam(defaultValue = "3") int quantidade) {
		return ResponseEntity.ok(marcas.marcasComQuantidadeMinimaDeProdutos(quantidade));

	}
}
