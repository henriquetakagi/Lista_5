//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Integer a = 127;
    Integer b = 127;

    System.out.println(a == b);

    Integer c = 200;
    Integer d = 200;

    System.out.println(c == d);
    System.out.println(c.equals(d));

    }
}