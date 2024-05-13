// Classe personalizada de exceção para parâmetros inválidos
public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() { super(); }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
