public class Lacoderepeticao {

    public static void main(String[] args) {

        for (int x=0; x<=10; x++) {
            System.out.println("numero " + x);
            System.out.println(converteInteiroParaRomano(x));


        }

    }



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
}