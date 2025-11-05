package presentacion;

import logica.Parcial;

public class Principal {

    public static void main(String[] args) {

        Parcial objeto_para_hacer_calculos = new Parcial();

        try {
            double[] resultado_caso_correcto = objeto_para_hacer_calculos.calcular_raices_de_ecuacion_cuadratica(1, -3, 2);
            System.out.println("correcto: riaz1 = " + resultado_caso_correcto[0] + "raiz2 = " + resultado_caso_correcto[1]);
        } catch (Exception error) {
            System.out.println("Error: " +error.getMessage());
        }

        try {
            double[] resultado_con_a_igual_a_cero = objeto_para_hacer_calculos.calcular_raices_de_ecuacion_cuadratica(0, 4, 2);
            System.out.println("A=0:raiz1 = " + resultado_con_a_igual_a_cero[0] + "raiz2 = " + resultado_con_a_igual_a_cero[1]);
        } catch (Exception error) {
            System.out.println("Error (A=0):" + error.getMessage());
        }

        try {
            double[] resultado_sin_raices_reales = objeto_para_hacer_calculos.calcular_raices_de_ecuacion_cuadratica(1, 2, 5);
            System.out.println("sin raices reales: raiz1 = " + resultado_sin_raices_reales[0] + "raiz2 = " + resultado_sin_raices_reales[1]);
        } catch (Exception error) {
            System.out.println("No hay raíces reales " + error.getMessage());
        }
    }
}
