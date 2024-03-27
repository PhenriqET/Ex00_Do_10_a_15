package Classes;
import java.util.Scanner;
import java.util.Objects;


public class Conta {
    private String numConta;
    private String titular;
    private int saldoAtual;
    
    //Metodos
    
    public Conta() {
        this.numConta = " ";
        this.titular = " ";
        this.saldoAtual = 0;
    }
    
    public Conta(String numConta, String titular, int saldoAtual) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldoAtual = saldoAtual;
    }
    
    public void copia(Conta copia) {
        this.numConta = copia.numConta;
        this.titular = copia.titular;
        this.saldoAtual = copia.saldoAtual;
    }
    
    //Depposito
    public void addSaldo(int deposito){
        this.saldoAtual = this.saldoAtual + deposito;
        System.out.println("Depositado!");
    }
    
    //Saque
    public void saqueSaldo(int saque){
        this.saldoAtual = this.saldoAtual - saque;
        System.out.println("Saque completo!");
    }
    
    //Atualizar Saldo apos Transaçao
    public void atualizarSaldo(){
        System.out.println("Atualizado...");
    }//MOCK, INCOMPLETO
    
    //Getters and Setters

    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
    @Override
    public String toString(){
        return "Conta { Numero da Conta: " + this.numConta
               + ", Titular: " + this.titular
               + ", Saldo Atual: " + this.saldoAtual + "}";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.numConta);
        hash = 59 * hash + Objects.hashCode(this.titular);
        hash = 59 * hash + Objects.hashCode(this.saldoAtual);
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
        final Conta other = (Conta) obj;
        if (!Objects.equals(this.numConta, other.numConta)) {
            return false;
        }
        if (!Objects.equals(this.titular, other.titular)) {
            return false;
        }
        return Objects.equals(this.saldoAtual, other.saldoAtual);
    }
    
    
    
}
