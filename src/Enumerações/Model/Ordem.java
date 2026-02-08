package Enumerações.Model;
import Enumerações.Enums.OrdemStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ordem {
    private int id;
    private LocalDateTime data;
    private OrdemStatus status;

    public Ordem(){}

    public Ordem(int id, LocalDateTime data, OrdemStatus status) {
        this.id = id;
        this.data = data;
        this.status = status;

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Pedido: " +
                "id: " + id +
                ", data e hora: " + data.format(formato) +
                ", status: " + status;
    }
}
