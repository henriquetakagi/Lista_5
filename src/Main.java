public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Diego");
        aluno.setIdade(18);
        aluno.apresentar();

        System.out.println("==================Digievolução==================");

        Professor professor = new Professor();
        professor.setNome("Diego");
        professor.setIdade(29);
        professor.apresentar();

    }
}