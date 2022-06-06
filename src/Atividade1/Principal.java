package Atividade1;

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Lucas", 27, "Desenvolvedor Júnior");
        Funcionario f2 = new Funcionario("Maria", 27, "Desenvolvedor Júnior");
        Funcionario f3 = new Funcionario("Ana", 32, "Desenvolvedor Senior");
        Funcionario f4 = new Funcionario("João", 27, "Desenvolvedor Pleno");

        f1.demitirFuncionario();

        f2.trocarCargoFuncionario("Desenvolvedor Pleno");

        f3.fazerAniversario();

        f4.pagarSalario();
    }
}
