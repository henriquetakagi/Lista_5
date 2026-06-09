public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Pedro", 100);
        Gerente g = new Gerente("Ana", 300);

        
        System.err.println(f.calcularBonus());
        System.out.println(g.calcularBonus());
        
    }
}