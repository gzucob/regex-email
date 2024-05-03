import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final Pattern EMAIL_REGEX = Pattern.compile (
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
    );
    /**
     * Valida se o endereço de e-mail fornecido é válido.
     * @param email O e-mail a ser validado.
     * @return true se o e-mail for válido, false caso contrário.
     **/
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return EMAIL_REGEX.matcher(email).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Digite um endereço de e-mail para validar (ou 'sair' para finalizar):");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("O e-mail \"" + input + "\" é válido? " + isValidEmail(input));
        }
        scanner.close();
    }
}
