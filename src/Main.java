class Main {
    public static void main(String[]args)

    {
        String nome="eduardo";
        String sobrenome="Lirola";
        Integer idade= 30;
        Boolean sexoFeminino= false;
        Double peso= 75.500;

        System.out.println("Oi");
        System.out.println("Meu nome é: "+ nome + " " + sobrenome);
        System.out.println("Tenho: " + idade + " Anos e Meu peso é: " + peso + "Kg");

//        Verificação de idade

        if (idade<=18) {
            System.out.println("Novinho");
        }

        else if (idade>18 && idade<=30) {
            System.out.println("Novão Ainda");
        }

        else if (idade>30) {
            System.out.println("Tiozão");
        }




    }
 }

