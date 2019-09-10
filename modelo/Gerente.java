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
public class Gerente extends Funcionario {
    
    private String setor;
    private String senha;
    
    //Construtor GETTER e SETTER

    public Gerente() {
    }

    public Gerente(String setor, String senha, String nome, double salario, String CPF) {
        // palavra reservada: SUPER
        //this.nome = nome;
        //this.salario = salario;
        //this.CPF = CPF;
        super(nome, salario, CPF);
        this.setor = setor;
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //public void setNome(String nome) {
    //    this.nome = nome;
    //}
    
    /*sobrecarga (override) permite o uso
      do conceito de polimorfismo da orientação a Objetos
      usando para isto a anotação @Override.
    */
    @Override
    public String getInformacao(){
        return "Gerente: " + this.nome +  " Recebe " + this.salario;
    }
    
    @Override
    public double getBonificacao(){
        return this.salario * 0.15;
    }
    
    public boolean getAutenticacao(String senha){
        /*
        Comparação Strings usamos Equals
        Comparação int usamos ==
        */
        if (this.senha.equals(senha)){
            System.out.println("Acesso Permitido!");
            return true;
        }
        else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
}
