package Atividade1;

public class Funcionario {
    public String nome;
    public int idade;
    public String cargo;
    public Boolean ativo;

    public Funcionario(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
    }

    public void demitirFuncionario() {
        if (getAtivo()) {
            setAtivo(false);
            System.out.println("O funcionário " + getNome() + " foi demitido e está com situação: Inativo");
        } else {
            System.out.println("O funcionário" + getNome() + " já está inativo");

        }
    }

    public void trocarCargoFuncionario (String cargo) {
        setCargo(cargo);
        System.out.println("O funcionário " + getNome() + " foi promovido e agora é: " + getCargo());
    }

    public void pagarSalario() {
        System.out.println("O salário do funcionário " + getNome() + " foi pago.");
    }

    public void fazerAniversario() {
        this.idade++ ;
        System.out.println("O funcionário " + getNome() + " fez aniversário e agora tem " + getIdade() + " anos.");
    }

}
