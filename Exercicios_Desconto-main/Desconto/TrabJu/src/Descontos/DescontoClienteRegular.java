package Descontos;
// ESSE POSSUI 10% DE DESCONTO
public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public double calcular(double preco) {
        return preco * 0.90;
    }
}
