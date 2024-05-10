public class condicional {

    public static void main(String[] args) {

        condicaoIfElse();
        condicaoTernario();
        switchCase();

    }

    public static void condicaoIfElse(){

        double nota = 6;
        if (nota < 7 )
        System.out.println("Aluno reprovado");
        else
        System.out.println("Aluno aprovado");
        }

    public static void condicaoTernario(){
        double nota = 6;
        String resultado = nota < 7 ? "Aluno reprovado" : "Aluno aprovado";
        System.out.println(resultado);
    }

    public static void switchCase(){

        String tamanhoCamisa = "P";

        switch (tamanhoCamisa) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Tamanho invalido");
                break;
        }
    }

}
