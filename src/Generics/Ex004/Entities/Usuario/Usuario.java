package Generics.Ex004.Entities.Usuario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Usuario implements Comparable<Usuario> {
    private String nomeUsua;
    private LocalDateTime dataHora = LocalDateTime.now();

    public Usuario() {
    }

    public Usuario(String nomeUsua) {
        this.nomeUsua = nomeUsua;
    }

    public String getNomeUsua() {
        return nomeUsua;
    }

    public void setNomeUsua(String nomeUsua) {
        this.nomeUsua = nomeUsua;
    }

    public String getDataHora() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataHora.format(dateTimeFormatter);
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }


    @Override
    public int compareTo(Usuario outro) {
        return - getDataHora().compareTo(outro.getDataHora());
    }

    @Override
    public String toString() {
        return getNomeUsua() + ", " + getDataHora();
    }
}
