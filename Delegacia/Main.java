import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // DEFININDO NOME PARA DELEGACIA
        Delegacia Delegacia = new Delegacia("\n\tDELEGACIA DE POLICIA MILITAR DO RJ");
        // DEFININDO NOME E CARGO DOS JUÍZES
        Juizes juiz1 = new Juizes("CLAUDIO", "JUIZ");
        Juizes juiz2 = new Juizes("EDUARDO", "ADVOGADO");
        Juizes juiz3 = new Juizes("FLAVIO", "PROMOTOR");
        Juizes juiz4 = new Juizes("RENAN", "ADVOGADO2");
        Juizes juiz5 = new Juizes("BIANCA", "POLICIAL-CIVIL");
        Juizes diretor = new Juizes("CAMPBEL", "DIRETOR");

        Juizes[] todos_os_juizes = new Juizes[] { juiz1, juiz2, juiz3, juiz4, juiz5, diretor };

        // DEFININDO NOME E CRIME DOS LADRÕES
        Ladroes ladrao1 = new Ladroes("FLAVIN", "FURTO");
        Ladroes ladrao2 = new Ladroes("DUDU", "ASSASSINANTO");
        Ladroes ladrao3 = new Ladroes("BENE", "SEQUESTRO");
        Ladroes ladrao4 = new Ladroes("SAQUINHO", "TRAFICO");
        Ladroes ladrao5 = new Ladroes("VIVI", "DESACATO");
        Ladroes[] todos_os_ladroes = new Ladroes[] { ladrao1, ladrao2, ladrao3, ladrao4, ladrao5 };

        // DEFININDO O NOME E CARGO DOS POLICIAIS
        Policiais policial1 = new Policiais("Fernando", "Policial-Militar");
        Policiais policial2 = new Policiais("Maldin", "Policial-Rodoviario");
        Policiais policial3 = new Policiais("Cascata", "Policial-Federal");
        Policiais policial4 = new Policiais("Noronha", "POLICIAL-CIVIL");
        Policiais policial5 = new Policiais("Manjica", "BOPE");
        Policiais[] todos_os_policiais = new Policiais[] { policial1, policial2, policial3, policial4, policial5 };

        boolean menu = true;
        while (menu) {
            System.out.println("\n\t************************************");
            System.out.println("\n\tBEM VINDO AO DEPARTAMENTO DE POLICIA");
            System.out.println("\tAUTOR: Ronny Rocke");
            System.out.println("\tDate: 02/09/24\n");

            System.out.println(
                    "\t1: VERIFICAR INFO DA DELEGACIA \n\t2: VERIFICAR JUIZES:\n\t3: VERIFICAR PRESOS \n\t4: VERIFICAR POLICIAIS \n\t5: SAIR");
            System.out.println("\t************************************");

            System.out.print("\n\tO QUE DESEJA FAZER: ");
            int option = teclado.nextInt();

            switch (option) {
                case 1:
                    Delegacia.infoDelegacia();

                    break;

                case 2:
                    System.out.println("\n\t-----------------------");
                    for (Juizes juiz : todos_os_juizes) {
                        System.out.println("\n\tNOME: " + juiz.getNome());
                        System.out.println("\tCARGO: " + juiz.getCargo());
                    }
                    break;

                case 3:
                    System.out.println("\n\t-----------------------");

                    for (Ladroes ladrao : todos_os_ladroes) {
                        System.out.println("\n\tNOME: " + ladrao.getNome());
                        System.out.println("\tCRIME: " + ladrao.getCrime());
                    }
                    break;

                case 4:
                    System.out.println("\n\t-----------------------");

                    for (Policiais policial : todos_os_policiais) {
                        System.out.println("\n\tNOME: " + policial.getNome());
                        System.out.println("\tCARGO: " + policial.getCargo());
                    }
                    break;

                case 5:
                    System.out.println("\n\tOBRIGADO POR UTILIZAR O SISTEMA, VOLTE SEMPRE!\n");
                    menu = false;
                    break;
                default:
                    System.out.println("\n\tOPÇÃO INVÁLIDA!");
                    break;
            }
        }
        teclado.close();

    }
}
