package Enumerações.SistemaContratos.Entities.Contratos;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contratos {
    private String tipoContrato;
    private Date dataContrato;
    private Double valorHora;
    private Double quantHoras;
    private Double totalArrecadado;
    public Contratos() {
    }

    public Contratos(String tipoContrato, Date dataContrato, Double valorHora, Double quantHoras) {
        this.tipoContrato = tipoContrato;
        this.dataContrato = dataContrato;
        this.valorHora = valorHora;
        this.quantHoras = quantHoras;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(Double quantHoras) {
        this.quantHoras = quantHoras;
    }

    public Double valorTotal(){

        return valorHora*quantHoras;
    }


    public String exibirContrato(int numero){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        return  "\n-------------------------------------------------------"+
                "\nFicha técnica do "+numero+"° contrato"+
                "\n-------------------------------------------------------"+
                "\nTipo de contrato: "+tipoContrato+
                "\nData de inicio do contrato: "+formatoData.format(dataContrato)+
                "\nValor da hora de trabalho: "+valorHora+
                "\nQuantidade de horas de trabalho: "+quantHoras+
                "\nValor total arrecadado nesse contrato: "+valorTotal()+
                "\n-------------------------------------------------------"+
                "\n";
    }
}
