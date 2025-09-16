import clases.Algoritmos; //no sé si quedó bien hecho la importación :c
public class Aplicación {
    public static void main(String[] args) {
        boolean esPrimo = Algoritmos.esPrimo(17);
        boolean esPalindromo = Algoritmos.esPalindromo("oso");
        String stringEnReversa = Algoritmos.stringEnReversa("hola");
        
        System.out.println(esPrimo + " " + esPalindromo + " " + stringEnReversa);
    }
}