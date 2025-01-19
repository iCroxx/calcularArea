package figuras;

/**
 * Esta clase es para la comprobación del funcionamiento del código.
 *
 * @author Cristo Santana Arencibia
 */
public class Test {
    /**
     * Constructor predeterminado de clase Test
     */
    public Test() {
    }

    /**
     * Método principal que ejecuta la aplicación de test.
     *
     * @param args Comprueba los radios de las circunferencias para posteriormente
     *             compararlos y determinar si son iguales o no, considerando decimales.
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);

        if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");

        if (c2.esIgual(true, c3))
            System.out.println("c2 y c3: iguales considerando decimales");
    }
}


