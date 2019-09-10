/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Funcionario {
    //Inicialmente os ATR serão PRIVATE
    //Mudar os modificadores dos atributos
    //para PROTECTED de modo que esses atributos
    //da classe Funcionario(PAI) tenham
    //visibilidade dentro da hierarquia de Herança
    //na classe gerente.
    protected String nome;
    protected double salario;
    protected String CPF;
    
    //Construtores GETTER e SETTER

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String CPF) {
        this.nome = nome;
        this.salario = salario;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getInformacao(){
        return "Funcionario: " + this.nome +  " Recebe " + this.salario;
    }
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }
    
    
    
    
    
}
