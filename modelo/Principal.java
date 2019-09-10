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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario objFunc01 = new Funcionario();
        
        objFunc01.setNome("Willian");
        objFunc01.setSalario(800);
        objFunc01.setCPF("111.111.111-11");
        
        System.out.println("Nome do funcionario: " + objFunc01.getNome());
        System.out.println("Salário: " + objFunc01.getSalario());
        System.out.println("CPF: " + objFunc01.getCPF());
        System.out.println("Info: " + objFunc01.getInformacao() + "\n");
        
        Gerente objGer01 = new Gerente();
        
        objGer01.setNome("Willian");
        objGer01.setSalario(5800);
        objGer01.setCPF("222.222.222-22");
        objGer01.setSetor("TI");
        objGer01.setSenha("1a2b45");
 
        System.out.println("Nome do gerente: " + objGer01.getNome());
        System.out.println("Salário: " + objGer01.getSalario());
        System.out.println("CPF: " + objGer01.getCPF());
        System.out.println("Setor: " + objGer01.getSetor());
        System.out.println("Senha: " + objGer01.getSenha());
        System.out.println("Info: " + objGer01.getInformacao() + "\n");
        objGer01.getAutenticacao("1223123");
        
        Funcionario objFunc02 = new Gerente();
        //casting entre objetos (CLASSES);
        //da mesma forma que vimos em tipos PRIMITIVOS
        //Gerente objGer02 = (Gerente) new Funcionario();
        
        //atribuição entre objetos
        //usando casting
        //objFunc02 = objGer02;
        //objGer02 = (Gerente) objFunc02;
        
    }
    
}
