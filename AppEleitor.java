public class AppEleitor {
    public static void main(String[] args) {
        int idade = 66;
        String classeEleitoral;

        if (idade < 16) {
            classeEleitoral = "impossibilitado de votar";
        }
        if (idade >= 18 && idade <= 65) {
            classeEleitoral = "obrigado a votar";
        } else {
            classeEleitoral = "voto facultativo";
        }

        System.out.println("O eleitor com " + idade + " anos é " + classeEleitoral);

    }
}