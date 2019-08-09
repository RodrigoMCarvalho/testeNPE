package testenull;

import java.util.Optional;

public class TesteOptinal {

    private String nome;

    public static void main(String[] args) {
        TesteOptinal ot = new TesteOptinal();
        System.out.println(ot.nome);

        Optional<String> optional = Optional.ofNullable(ot.nome);
        System.out.println(optional.get().toUpperCase());
    }

}
