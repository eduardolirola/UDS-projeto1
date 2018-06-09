import java.util.Scanner;




public class funcao {


    public static String converteInteiroParaRomano (int numeroconvertido) {


         switch(numeroconvertido){
            case 1:
                return  "I";
            case 2:
                return  "II";
            case 3:
                return  "III";
            case 4:
                return  "IV";
            case 5:
                return  "V";
            case 6:
                return  "VI";
            case 7:
                return  "VII";
            case 8:
                return  "VIII";
            case 9:
                return  "IX";
            case 10:
                return   "X";
            default:
                return  "Numeros corretos é de 1 a 10";
        }
}


    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero:");
        int retorno = scanner.nextInt();
        System.out.println("O Numero Escolhido Foi: " + retorno);
        System.out.println(converteInteiroParaRomano(retorno));





    }

}
