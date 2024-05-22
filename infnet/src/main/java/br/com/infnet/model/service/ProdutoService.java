package br.com.infnet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.domain.Produto;
import br.com.infnet.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
    
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }
    
    public Optional<Produto> getProdutoById(Long id) {
        return produtoRepository.findById(id);
    }
    
    public Produto updateProduto(Long id, Produto produtoDetails) {
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        
        produto.setNome(produtoDetails.getNome());
        produto.setDescricao(produtoDetails.getDescricao());
        produto.setPreco(produtoDetails.getPreco());
        
        return produtoRepository.save(produto);
    }
    
    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
