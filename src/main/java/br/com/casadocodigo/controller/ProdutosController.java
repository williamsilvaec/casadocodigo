package br.com.casadocodigo.controller;


import br.com.casadocodigo.model.Produto;
import br.com.casadocodigo.repository.ProdutoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {

    @Autowired
    private ProdutoDAO produtoDAO;

    @RequestMapping("/produtos/form")
    public String form() {
        return "produtos/form";
    }

    @RequestMapping("/produtos")
    public String gravar(Produto produto) {
        System.out.println(produto);
        produtoDAO.gravar(produto);
        return "produtos/ok";
    }
}
