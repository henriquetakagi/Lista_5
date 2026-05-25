import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BigDecimal produto = new BigDecimal("49.90");
        BigDecimal desconto = produto.multiply(new BigDecimal("0.05"));
        BigDecimal valorTotal = produto.multiply(new BigDecimal("3"));
        BigDecimal descontoTotal = desconto.multiply(new BigDecimal("3"));
        BigDecimal produtoTotal = valorTotal.subtract(descontoTotal);

        System.out.println("Produto: "+ produtoTotal);

    }
}