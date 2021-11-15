package br.com.uvass.camisanerd.controller;

import br.com.uvass.camisanerd.model.entity.Produto;
import br.com.uvass.camisanerd.model.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {
        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) throws Exception {
        return produtoRepository.cadastrar(produto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Produto> buscar() throws Exception {
        return produtoRepository.buscar();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/busca-por-nome")
    public List<Produto> buscarPorNome(@RequestParam String nome) throws Exception {
        return produtoRepository.buscarPorNome(nome);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/busca-por-faixa-preco")
    public List<Produto> buscarPorFaixaPreco(@RequestParam Float valorMinimo, Float valorMaximo) throws Exception {
        return produtoRepository.buscarPorFaixaPreco(valorMinimo, valorMaximo);
    }

}
