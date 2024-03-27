package Classes;
import java.util.Objects;
import java.util.Scanner;

public class Transacao {
    private String idTransacao;
    private String tipo;
    private int valor;
    private String data;
    private Conta conta;
    
    //Metodos
    
    public Transacao() {
        this.idTransacao = " ";
        this.tipo = " ";
        this.valor = 0;
        this.data = " ";
        this.conta = new Conta();
    }
    
    public Transacao(String idTransacao, String tipo, int valor, String data, Conta conta) {
        this.idTransacao = idTransacao;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.conta = conta;
    }
    
    public void copia (Transacao copia){
        this.idTransacao = copia.idTransacao;
        this.tipo = copia.tipo;
        this.valor = copia.valor;
        this.data = copia.data;
        this.conta = copia.conta;
    }
    
    public void deposito(){
        Scanner read = new Scanner(System.in);
        System.out.println("Valor a ser depositado: ");
        this.valor = read.nextInt();
        conta.addSaldo(this.valor);
    }
    
    public void saque(){
        Scanner read = new Scanner(System.in);
        System.out.println("Valor a ser depositado: ");
        this.valor = read.nextInt();
        conta.saqueSaldo(this.valor);
    }
    
    //Enviando saldo de uma conta pra outra
    public void transacao(Conta c2){
        Scanner read = new Scanner(System.in);
        this.valor = read.nextInt();
        conta.saqueSaldo(this.valor);
        c2.addSaldo(this.valor);
        System.out.println("Transferido...");
    }
    
    //Getters and Setters

    public String getIdTransacao() {
        return idTransacao;
    }
    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    @Override
    public String toString(){
        return "Transacao { ID: " + this.idTransacao
               + ", Tipo: " + this.tipo
               + ", Valor: " + this.valor
               + ", Data: " + this.data
               + ", Conta: " + this.data + "}";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.idTransacao);
        hash = 11 * hash + Objects.hashCode(this.tipo);
        hash = 11 * hash + this.valor;
        hash = 11 * hash + Objects.hashCode(this.data);
        hash = 11 * hash + Objects.hashCode(this.conta);
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
        final Transacao other = (Transacao) obj;
        if (this.valor != other.valor) {
            return false;
        }
        if (!Objects.equals(this.idTransacao, other.idTransacao)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return Objects.equals(this.conta, other.conta);
    }
    
}
