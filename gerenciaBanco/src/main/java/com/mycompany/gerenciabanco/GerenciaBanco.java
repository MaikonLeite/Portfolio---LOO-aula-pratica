/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

//biblioteca para entrada de dados
import java.util.Scanner;

/**
 *
 * @author Maikon Leite
 */

class Cliente{
    private String nome;
    private String sobrenome;    
    private String cpf;
    private double saldo;


public Cliente(String nome, String sobrenome, String cpf){
    this.nome = nome;
    this.sobrenome = sobrenome ;
    this.cpf = cpf;
    this.saldo = 0.0;
}

//metodos da classe Cliente
public void consultarSaldo(){
    System.out.println ("Saldo disponivel: R$" + saldo);
}
//Fim do metodo consultar saldo

public void depositar(double valor){
    if(valor >0){
        saldo += valor;
        System.out.println("Deposito de R$" + valor +"\n ** Realizado com sucesso. **");
    }else{
        System.out.println("Valor de deposito invalido.");
    }
    }
//Fim do metodo depositar

public void sacar(double valor){
    if(valor >0 && valor <= saldo){
        saldo -= valor;
        System.out.println("Saque de R$" + valor +"\n ** Realizado com sucesso. **");
    }else{
        System.out.println("Valor de saque invalido ou saldo insuficiente.");
    }
    }
//Fim do metodo sacar
}
//Fim da classe Cliente

public class GerenciaBanco {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ola! Infome seu nome por favor:");
        String nome = scanner.nextLine();
        System.out.println("Agora infome seu sobrenome por favor:");
        String sobrenome = scanner.nextLine();
        System.out.println("Agora infome seu cpf por favor:");
        String cpf = scanner.nextLine();
        //Objeto da classa Cliente
    Cliente cliente = new Cliente(nome, sobrenome, cpf);
    
boolean proceguir = true;
while (proceguir){
    System.out.println("No que posso ajudar?");
    System.out.println("1 - Consultar Saldo.");
    System.out.println("2 - Realizar Deposito.");
    System.out.println("3 - Realizar Saque.");
    System.out.println("4 - Finalizar Operacao.");

int selecione = scanner.nextInt();
    switch(selecione){
    case 1:
        cliente.consultarSaldo();
        break;
    case 2:
        System.out.println("Informe o valor para deposito:");
        double valorDeposito = scanner.nextDouble();
        cliente.depositar(valorDeposito);
        break;
    case 3:
        System.out.println("Informe o valor para saque:");
        double valorSaque = scanner.nextDouble();
        cliente.sacar(valorSaque);
        break;
    case 4:
        proceguir = false;
        System.out.println("Encerrando operação, volte sempre!");
        break;
    default:
        System.out.println("Opção invalida, tente novamente.");
        break;
}
}
scanner.close();
}
}








