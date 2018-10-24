/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author socamporomani
 */
public class Conta {
    private String nomeCliente;
    private String numConta;
    private double saldo;
    
    public Conta(String nomeCliente, String numConta, double saldo){
        this.nomeCliente=nomeCliente;
        this.numConta=numConta;
        this.saldo=saldo;
    }
    
    public void setNome(String nome){
        
    }
    public void setConta(String conta){
        
    }
    public void setSaldo(double saldo){
            
    }
    public String getNome(){
        return nomeCliente;
    }
    public String getConta(){
        return numConta;
    }
    public double getSaldo(){
        return saldo;
    }
 
    public boolean ingreso(float cantidad){
        if(cantidad<=0){
            return false;
        }
        else{
            saldo=cantidad+saldo;
            return true;
        }
    }
    public boolean reintegro(float cantidad){
        if(saldo>cantidad){
           saldo=cantidad-saldo;
            return true;
        }
        else{
            return false;
        }
    }
 }
