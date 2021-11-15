package br.com.uvass.camisanerd.model.repository;

import br.com.uvass.camisanerd.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class ProdutoRepository {
    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Produto cadastrar(Produto produto) throws Exception {
        String sql = "INSERT INTO produto(id, nome, descricao, preco, fotoUrl, dataCadastro, dataUltimaAtualizacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getFotoUrl(),
                produto.getDataCadastro(),
                produto.getDataUltimaAtualizacao()
        );

        if(insert == 1) {
            return produto;
        }

        throw new Exception("Erro ao cadastrar o Produto");
    }

    public List<Produto> buscar() throws Exception {
        String sql = "SELECT * FROM produto";
        List<Produto> search = (List<Produto>) jdbcTemplate.query(sql, new ProdutoMapper());

        if (search.size() > 0) {
            return (List<Produto>) jdbcTemplate.query(sql, new Object[]{}, new ProdutoMapper());
        }
        throw new Exception("Nenhum produto encontrado");
    }

    public List<Produto> buscarPorNome(String nome) throws Exception {
        String sql = "SELECT * FROM produto WHERE nome = ?";
        List<Produto> search = (List<Produto>) jdbcTemplate.query(sql, new ProdutoMapper(), nome);

        if (search.size() > 0) {
            return (List<Produto>) jdbcTemplate.query(sql, new Object[]{nome}, new ProdutoMapper());
        }
        throw new Exception("Nenhum produto encontrado com esse nome");
    }

    public List<Produto> buscarPorFaixaPreco(Float valorMinimo, Float valorMaximo) throws Exception {
        String sql = "SELECT * FROM produto WHERE preco >= ? AND preco <= ?";
        List<Produto> search = (List<Produto>) jdbcTemplate.query(sql, new ProdutoMapper(), valorMinimo, valorMaximo);

        if (search.size() > 0) {
            return (List<Produto>) jdbcTemplate.query(sql, new Object[]{valorMinimo, valorMaximo}, new ProdutoMapper());
        }
        throw new Exception("Nenhum produto encontrado com preço dentro desta faixa de valores");
    }
}
