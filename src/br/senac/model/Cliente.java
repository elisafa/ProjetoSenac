
package br.senac.model;

public class Cliente extends Usuario{
    private int agencia;
    private int conta;
    private float saldo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "agencia=" + agencia + ", conta=" + conta +"Nome: " + super.getNome()+ ", saldo=" + saldo + '}';
    }

   
       
}
