package Polimorfismo.Ex002.Model.Exception;

import java.io.IOException;

public class ValidationIOException extends IOException {
    public ValidationIOException(String message) {
        super(message);
    }
}
