
public class ParametrosInvalidosException extends Exception {
    
    // Construtor padrão
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    // Construtor que permite personalizar a mensagem
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
