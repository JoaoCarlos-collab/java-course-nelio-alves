package Enumerações.SistemaContratos.Entities.Trabalhador;
import Enumerações.SistemaContratos.Entities.Contratos.Contratos;
import Enumerações.SistemaContratos.Entities.Departamento.Departamento;
import Enumerações.SistemaContratos.Entities.Enumeracao.Enumeracao;
import java.util.ArrayList;
import java.util.Calendar;

public class Trabalhador {
    private String nome;
    private Enumeracao nivelProgramador;
    private Double baseSalario;
    private String nivelProgString;

    private Departamento departamento;
    private ArrayList <Contratos> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, Enumeracao nivelProgramador, Double baseSalario, String nivelProgString, Departamento departamento) {
        this.nome = nome;
        this.nivelProgramador = nivelProgramador;
        this.baseSalario = baseSalario;
        this.nivelProgString = nivelProgString;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Enumeracao getNivelProgramador() {
        return nivelProgramador;
    }

    public void setNivelProgramador(Enumeracao nivelProgramador) {
        this.nivelProgramador = nivelProgramador;
    }

    public Double getBaseSalario() {
        return baseSalario;
    }

    public void setBaseSalario(Double baseSalario) {
        this.baseSalario = baseSalario;
    }

    public String getNivelProgString() {
        return nivelProgString;
    }

    public void setNivelProgString(String nivelProgString) {
        this.nivelProgString = nivelProgString;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Contratos> getContratos() {
        return contratos;
    }

    public void adicionarContratos(Contratos novosContratos){
        contratos.add(novosContratos);
    }

    public void removerContratos(Contratos novosContratos){
        contratos.remove(novosContratos);
    }

    public Double totalRenda(int mes, int ano){

        Double soma = baseSalario;
        Calendar calendario = Calendar.getInstance();
        for (Contratos c : contratos){
            calendario.setTime(c.getDataContrato());
            int c_mes = 1 + calendario.get(Calendar.MONTH);
            int c_ano = calendario.get(Calendar.YEAR);
            if (mes == c_mes && ano == c_ano){
                soma += c.valorTotal();
            }
        }
        return soma;
    }

    public String fichaTecFunc() {
        return  "\n"+
                "Ficha técnica do funcionário"+
                "\n-------------------------------------------------------"+
                "\nNome: "+nome+
                "\nDepartamento: "+departamento.getDepartamento()+
                "\nTipo de funcionário: "+nivelProgString+
                "\nBase salarial: "+baseSalario+
                "\n-------------------------------------------------------";
    }

    public String fichaTecCont(){
        int numero = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (Contratos c : contratos){
            numero += 1;
            stringBuilder.append(c.exibirContrato(numero));
        }
        return stringBuilder.toString();
    }
}
