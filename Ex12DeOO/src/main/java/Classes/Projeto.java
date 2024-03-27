package Classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Projeto {
    private String nome;
    private String codigo;
    private List<Funcionario> funcionarios;
    
    //Metodos
    
    public Projeto() {
        this.nome = " ";
        this.codigo = " ";
        this.funcionarios = new ArrayList<>();
    }
    
    public Projeto(String nome, String codigo, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.codigo = codigo;
        this.funcionarios = funcionarios;
    }
    
    public void copia(Projeto copia) {
        this.nome = copia.nome;
        this.codigo = copia.codigo;
        this.funcionarios = copia.funcionarios;
    }
    
    //Getters and Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
