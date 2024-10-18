package Descontos;
// ESSE POSSUI 20% DE DESCONTO
public class DescontoClienteVIP implements DescontoStrategy {
    @Override
    public double calcular(double preco) {
        return preco * 0.80;
    }
}
