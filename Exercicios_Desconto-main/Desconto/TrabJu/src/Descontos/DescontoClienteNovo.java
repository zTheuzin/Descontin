package Descontos;

// ESSE NÃO POSSUI DESCONTO
public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double calcular(double preco) {
        return preco;
    }
}
