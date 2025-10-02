import java.util.ArrayList;
import java.util.Comparator;

import src.model.Camareira;
import src.model.Cliente;
import src.model.EnumTipo;
import src.model.Gerente;
import src.model.Quarto;
import src.model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();

        
/* 
        Recepcionista recepcionista1 = new Recepcionista("Valéria", "217779998", "98765432101");

        recepcionista1.atenderOTelefone();
        recepcionista1.falarIngles();

        Camareira camareira1 = new Camareira("Joana", "21953138455", "12345678902");
        camareira1.arrumarACama();
        camareira1.limparQuarto();
        //DEU uma dor de barriga na Valéria, N vai poderr trabalhar

        Gerente gerente1 = new Gerente("Fábio", "21953435433", "9876432102");

        gerente1.atenderOTelefone();
        gerente1.falarIngles();

        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.MASTER);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("207A");
        quarto2.setValor(200.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        System.out.println(quarto1.getTipo());
        System.out.println(quarto2.getTipo().getValor() );
        */
        Cliente cliente1 = new Cliente("Manoel Da Silva", "2199998888", "12345678901", 42);
        Cliente cliente2 = new Cliente("Fulano", "2199998888", "12345678901" , 18);
        Cliente cliente3 = new Cliente("ciclano Rodrigues", "2199998888", "12345678901" , 21);
        Cliente cliente4 = new Cliente("Beutrano Rodrigues", "2199998888", "12345678901", 34);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(cliente1);//0
        clientes.add(cliente2);//1
        clientes.add(cliente3);//2
        clientes.add(cliente4);//3

        clientes.stream().count();
         clientes.stream()
         .limit(2)
         .forEach(c -> System.out.println(c.getNome()));


         clientes.stream()
         .skip(2)
        .forEach(c -> System.out.println(c.getNome()));

       // var resultado3 = clientes.stream().sorted();

         clientes.stream()
         .filter(c -> c.getIdade() > 25)
        .forEach(c -> System.out.println(c.getNome()));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        clientes.stream()
         .filter(c ->c.getNome().contains("Rodrigues"))
        .forEach(c -> System.out.println(c.getNome()));


        clientes.stream()
         .filter(c ->c.getNome().startsWith("B"))
        .forEach(c -> System.out.println(c.getNome()));

        
        clientes.stream().map(Cliente ::getNome);
        

    }   

}
