package testenull;

import java.time.LocalDate;
import java.util.List;
import testenull.modelo.CartaoDeCredito;
import testenull.modelo.Usuario;

public class TesteNull {

    public static void main(String[] args) {
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito("Rodrigo M Carvalho", "5152877727714129", "317",
                LocalDate.of(2019, 6, 9));
        Usuario usuario = new Usuario("Rodrigo Moreira Carvalho", "75475962820");
        System.out.println(cartaoExistente(cartaoDeCredito, usuario));
        List<CartaoDeCredito> list = informarCartoes(cartaoDeCredito, usuario);
        System.out.println(list);
    }

    public static boolean cartaoExistente(CartaoDeCredito cartaoDeCredito, Usuario usuario) {
        if (usuario.getCartoes() != null) {
            for (CartaoDeCredito cartao : usuario.getCartoes()) {
                if (cartaoDeCredito.getNumero().equals(cartao.getNumero())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static List<CartaoDeCredito> informarCartoes(CartaoDeCredito cartaoDeCredito, Usuario usuario) {
        if (null != usuario.getCartoes()) {
            for (CartaoDeCredito cartao : usuario.getCartoes()) {
                if (cartaoDeCredito.getNumero().equals(cartao.getNumero())) {
                    return usuario.getCartoes();
                }
            }
        }
        return usuario.getCartoes();
    }
}
