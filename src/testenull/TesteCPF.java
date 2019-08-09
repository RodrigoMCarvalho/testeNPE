package testenull;

import testenull.modelo.Usuario;

public class TesteCPF {

    public static void main(String[] args) {
        String cpfNovo = null;
        Usuario usuario = new Usuario();
        usuario.setNomeCompleto("Rodrigo Moreira Carvalho");
        usuario.setCpf("1111111119");

        if (usuario.getCpf() != null) {
            if (usuario.getCpf().endsWith("9")) {
                System.out.println("Termina com 9");
                cpfNovo = usuario.getCpf().replace("9", "8");
            } else {
                System.out.println("Não termina com 9");
            }
        }
        System.out.println("Funcionou");
        System.out.println(usuario.getCpf());
        System.out.println(cpfNovo);
    }
}
