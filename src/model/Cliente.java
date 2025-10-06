package src.model;

import src.interfaces.IFalarIngles;

public class Cliente extends Pessoa implements IFalarIngles{



    private Integer idade;
    public Cliente(String nome, String telefone, String cpf, Integer idade) {
        super(nome, telefone, cpf);
        this.idade = idade;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    @Override
    public void falarIngles() {
        // TODO Auto-generated method stub
       
    }

}

