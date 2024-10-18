package Descontos;

// ESSE NÃO POSSUI DESCONTO
public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco;
    }
}
