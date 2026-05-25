//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int nota = 8;
    Integer notaObj = nota;

    System.out.println("Nota: " + nota);
    System.out.println("NotaObj: " + notaObj);
    System.out.println("O tipo é: " + notaObj.getClass().getSimpleName());
    }
}