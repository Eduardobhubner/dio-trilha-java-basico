import java.util.Locale;
import java.util.Scanner;

public class excecoes extends Exception {

    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu CEP!");
        String cep = scanner.next();

        try {
            String cepValidado = formataCep(cep);
            System.out.println(cepValidado);
        } catch (CepExpection e) {
            System.out.println("CEP invalido, precisa conter 8");
        }
 
        scanner.close();

    }


    static String formataCep(String cep) throws CepExpection {

        if (cep.length() != 8 ) {
            throw new CepExpection();
        }

        Thread.dumpStack();


        return "06333-102";
    }

}
