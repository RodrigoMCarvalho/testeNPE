package testenull.modelo;

import java.util.List;

public class Usuario {

    private String nomeCompleto;
    private String cpf;
    private List<CartaoDeCredito> cartoes;

    public Usuario(String nomeCompleto, String cpf, List<CartaoDeCredito> cartoes) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.cartoes = cartoes;
    }

    public Usuario(String nomeCompleto, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
    }

    public Usuario() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<CartaoDeCredito> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<CartaoDeCredito> cartoes) {
        this.cartoes = cartoes;
    }

}
