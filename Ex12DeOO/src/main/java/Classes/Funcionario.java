package Classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String id;
    private List<Projeto> projetos;
    
    //Metodos
    
    public Funcionario() {
        this.nome = " ";
        this.id = " ";
        this.projetos = new ArrayList<>();
    }
    
    public Funcionario(String nome, String id, List<Projeto> projetos) {
        this.nome = nome;
        this.id = id;
        this.projetos = projetos;
    }
    
    public void copia(Funcionario copia) {
        this.nome = copia.nome;
        this.id = copia.id;
        this.projetos = copia.projetos;
    }
    
    //Getters and Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }
    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
    
    
    @Override
    public String toString(){
        return " Funcionario { Nome: " + this.nome
               + ", ID: " + this.id
               + ", Projetos: " + this.projetos + "}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.projetos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.projetos, other.projetos);
    }
    
    
    
}
