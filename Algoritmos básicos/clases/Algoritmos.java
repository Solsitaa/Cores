public class Algoritmos {
    public static void main(String[] args) {
        // esto es para los numeros paressssss
        int numParImpar = 5;
        if (numParImpar % 2 == 0) {
            System.out.println(numParImpar + " es un número par");
        } else {
            System.out.println(numParImpar + " no es un número par");
        }
        
        // este es pa los numeros primos, recordar preguntar sobre los ciclos, me cuestan todavía
        int numPrimo = 7;
        if (esPrimo(numPrimo)) {
            System.out.println(numPrimo + " es primo");
        } else {
            System.out.println(numPrimo + " no es primo");
        }
        
        String palabra = "Oso";
        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra en reversa: " + stringEnReversa(palabra));
        System.out.println("¿Es palíndromo? " + esPalindromo(palabra));
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static String stringEnReversa(String texto) {
        String reversa = "";// D:
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversa += texto.charAt(i);
        }
        return reversa;
    }
    
    public static boolean esPalindromo(String texto) {
        return texto.equals(stringEnReversa(texto));
    }
}