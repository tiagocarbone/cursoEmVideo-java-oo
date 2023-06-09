// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ProjetoPessoas {
    public static void main(String[] args) {
       // Programa Principal

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("Masculino");
        p4.setSexo("Feminino");
        p2.setIdade(18);
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque ");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p3.receberAum(550.20f);
        p4.mudaTrabalho();
        p2.cancelarMatricula();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}