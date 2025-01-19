package figuras;

/**
 * Esta clase representa una circunferencia, donde sacamos el radio, color y area.
 *
 * @author Cristo Santana Arencibia
 */
public class Circunferencia {
    private double radio;

    /**
     * Esta clase es un constructor de la clase Circunferencia
     *
     * @param radio indica el radio de la circunferencia
     *
     */

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Imprime los calculos de diametro, area y el color de la circunferencia
     *
     * @param color indica el color de la circunferencia
     */
    public void imprimir(String color) {
        color = "rojo";
        System.out.println("Di�metro: " + radio * 2);
        System.out.println("Color: " + color);
        double area = 3.1416 * radio * radio;
        System.out.println(area);
    }

    /**
     * Comprueba si los numeros de las circunferencias son iguales teniendo en cuenta el decimal o no.
     *
     * @param considerarDecimales es el boolean para revisar si coinciden los decimales o no
     *
     * @param otro son los datos de la otra circunferencia
     *
     * @return devuelve si los radios son iguales o no.
     */

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
/**
* Getter de los metodos, devuelve el radio de la circunferencia
 *
 * @return radio deuvelve el radio de la circunferencia
 * */
	public double getRadio() {
		return radio;
	}

    /**
     * Setter del metodo Radio.
     * @param radio es el parametro del radio de la circunferencia
     */
	public void setRadio(double radio) {
		this.radio = radio;
	}
}

