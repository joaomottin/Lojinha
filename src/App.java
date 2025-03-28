import java.util.Scanner;
import java.time.LocalDate; 

public class App {
    public static void main(String[] args) throws Exception {

       /* Funcionario funcionario1 = new Funcionario("João", "Estagiário", LocalDate.parse("2010-07-31"), 5000);*/

    Funcionario funcionarios[] = {
        new Funcionario("João", "Gerente", LocalDate.parse("2010-07-31"), 5000),
        new Funcionario("Maria", "Analista", LocalDate.parse("2015-05-20"), 4500)
    };
        System.out.println("\n---MENU---");
        System.out.println("\n1. Informações do funcionário");
        System.out.println("\n2. Reajustar salário");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                for (int i=0; i < funcionarios.length;i++){funcionarios[i].exibirInformacoes();}
            break;
        
            case 2: 
                


            break;

            default:
                break;
        }
    }
}
