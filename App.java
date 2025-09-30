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

        Cliente cliente1 = new Cliente("Manoel Da Silva", "2199998888", "12345678901");

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
    }   

}
