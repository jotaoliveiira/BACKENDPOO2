package src.model;

public enum EnumTipo {
    
    BASICO ("báisco"),
     MASTER ("Master"), 
     PRESIDENCIAL ("Suite presidencial");

    private String valor;

    private EnumTipo (String valor){
        this.valor = valor;
    }
    public String getValor() {
        return valor;
    }
    
}
