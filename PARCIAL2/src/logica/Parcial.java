package logica;

public class Parcial {

    public double[] calcular_raices_de_ecuacion_cuadratica(double numero_a, double numero_b, double numero_c) throws Exception {

        double copia_numero_a = numero_a;
        double copia_numero_b = numero_b;
        double copia_numero_c = numero_c;

        if (copia_numero_a == 0) {
            throw new Exception("El valor del primer número no puede ser 0.");
        }

        double paso_calculo_b_al_cuadrado = copia_numero_b * copia_numero_b;
        double paso_calculo_4_por_a = 4 * copia_numero_a;
        double paso_calculo_4_por_a_por_c = paso_calculo_4_por_a * copia_numero_c;

        double valor_discriminante = paso_calculo_b_al_cuadrado - paso_calculo_4_por_a_por_c;

        if (valor_discriminante < 0) {
            throw new Exception("No existen raíces reales.");
        }

        double raiz_cuadrada_del_discriminante = Math.sqrt(valor_discriminante);

        double numerador_con_suma = (-copia_numero_b) + raiz_cuadrada_del_discriminante;
        double numerador_con_resta = (-copia_numero_b) - raiz_cuadrada_del_discriminante;

        double denominador_final = 2 * copia_numero_a;

        double primera_respuesta_final = numerador_con_suma / denominador_final;
        double segunda_respuesta_final = numerador_con_resta / denominador_final;

        double[] arreglo_respuesta_final_si_todo_sale_bien = { primera_respuesta_final, segunda_respuesta_final };

        return arreglo_respuesta_final_si_todo_sale_bien;
    }
}
