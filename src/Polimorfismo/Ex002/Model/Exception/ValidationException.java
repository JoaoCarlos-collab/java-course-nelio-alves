package Polimorfismo.Ex002.Model.Exception;

public class ValidationException extends RuntimeException{

    public ValidationException(String message) {
        super(message);
    }
}
