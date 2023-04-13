import java.util.Scanner;
class  BMExercicio06 {
    public  static  void  main ( String [] args ) {
        Scanner sc = new Scanner(System.in);

        int  dia = 1 ;

        while ( dia != 0 ) {
             System.out.print( "Informe um numero de 1 a 7: " );
             dia = sc.nextInt();
             switch(dia){
                case 1:
                    System.out.println("Dia da semana: Domingo\n");
                    break;
                case 2:
                    System.out.println("Dia da semana: Segunda-feira\n");
                    break;
                case 3:
                    System.out.println( "Dia da semana: Terça-feira\n");
                    break; 
                case 4:
                    System.out.println( "Dia da semana: Quarta-feira\n" );
                    break;
                case 5:
                    System.out.println( "Dia da semana: Quinta-feira\n");
                    break; 
                case 6:
                    System.out.println("Dia da semana: Sexta-feira\n" );
                    break;
                case 7:
                    System.out.println("Dia da semana: Sábado\n" );
                    break;
                default:
                System.out.println("");
                }
        }

        sc.close();
    }
}

