package br.com.alura.escola;

// VALUE OBJECT
public class Email {

    private String endereco;

    public Email(String endereco) {
        if(endereco == null || !endereco.matches("^[\\w.-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
        this.endereco = endereco;
    }

}
