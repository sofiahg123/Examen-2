package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import logica.Parcial;

public class ParcialTest {

    @Test
    public void probar_que_las_raices_salgan_correctas_cuando_son_reales() throws Exception {

        Parcial objeto_para_hacer_calculos = new Parcial();

        double valor_para_a = 2;
        double valor_para_b = -6;
        double valor_para_c = 4;

        double[] respuesta_final_de_raices = objeto_para_hacer_calculos.calcular_raices_de_ecuacion_cuadratica(valor_para_a, valor_para_b, valor_para_c);

        double valor_esperado_para_raiz_grande = 2.0;
        double valor_esperado_para_raiz_pequena = 1.0;

        assertEquals(valor_esperado_para_raiz_grande, respuesta_final_de_raices[0], 0.01);
        assertEquals(valor_esperado_para_raiz_pequena, respuesta_final_de_raices[1], 0.01);
    }

    @Test
    public void probar_que_se_genere_error_cuando_el_valor_numero_a_es_cero() {

        Parcial objeto_que_se_va_a_probar = new Parcial();

        Executable bloque_para_probar_error = new Executable() {
            public void execute() throws Throwable {
                double valor_para_a = 0;
                double valor_para_b = 5;
                double valor_para_c = 3;

                objeto_que_se_va_a_probar.calcular_raices_de_ecuacion_cuadratica(valor_para_a, valor_para_b, valor_para_c);
            }
        };

        assertThrows(Exception.class, bloque_para_probar_error);
    }

    @Test
    public void probar_que_se_genere_error_cuando_el_discriminante_es_negativo() {

        Parcial objeto_que_se_usa_para_probar = new Parcial();

        Executable bloque_que_deberia_lanzar_error = new Executable() {
            public void execute() throws Throwable {
                double valor_para_a = 1;
                double valor_para_b = 2;
                double valor_para_c = 5;

                objeto_que_se_usa_para_probar.calcular_raices_de_ecuacion_cuadratica(valor_para_a, valor_para_b, valor_para_c);
            }
        };

        assertThrows(Exception.class, bloque_que_deberia_lanzar_error);
    }
}


