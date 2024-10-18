package Compras;

import Descontos.DescontoStrategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras(DescontoStrategy descontoStrategy) {
        this.produtos = new ArrayList<>();
        this.descontoStrategy = descontoStrategy;
    }

    public CarrinhoDeCompras() {

    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotalComDesconto() {
        if (descontoStrategy == null) {
            throw new IllegalStateException("Estratégia de desconto não definida.");
        }
        double total = 0.0;
        for (Produto produto : produtos) {
            total += descontoStrategy.calcularDesconto(produto.getPreco());
        }
        return total;
    }
}
