import java.time.LocalDate;  // Importa a classe LocalDate para lidar com datas
import java.time.Period;     // Importa a classe Period para calcular a diferença entre datas
import java.util.Scanner;

public class Funcionario {
    private String nome, cargo;
    private LocalDate anoContratacao;
    private float salarioMensal;
    public Funcionario(String nome, String cargo, LocalDate anoContratacao, float salarioMensal) {
        this.nome = nome;
        this.cargo = cargo;
        this.anoContratacao = anoContratacao;
        this.salarioMensal = salarioMensal;
    }
    Scanner scanner = new Scanner(System.in);

    public int anosTrabalhados(){
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(anoContratacao, dataAtual);
        return periodo.getYears();
    }

    public void exibirInformacoes(){
        System.out.println("\nNome: "+ nome);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Anos trabalhados na empresa: " + anosTrabalhados()+"\n");
    }

    public void reajusteSalario(){
        System.out.println("Aumento ou Decrecimo?");
        int xis = scanner.nextLine();
        if(xis.equals("Aumento"));
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public LocalDate getAnoContratacao() {
        return anoContratacao;
    }
    public void setAnoContratacao(LocalDate anoContratacao) {
        this.anoContratacao = anoContratacao;
    }
    public float getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", anoContratacao=" + anoContratacao
                + ", salarioMensal=" + salarioMensal + "]";
    }
}
