package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import logica.Parcial;

public class ParcialTest {

    @Test
    public void probar_raices_correctas() throws Exception {
        Parcial objeto_prueba = new Parcial();
        double[] respuesta = objeto_prueba.calcular_raices_de_ecuacion_cuadratica(1, -3, 2);
        assertEquals(2.0, respuesta[0], 0.01);
        assertEquals(1.0, respuesta[1], 0.01);
    }

    @Test
    public void probar_error_cuando_a_es_cero() {
        Parcial objeto_prueba = new Parcial();
        assertThrows(Exception.class, () -> {
            objeto_prueba.calcular_raices_de_ecuacion_cuadratica(2, -6, 4);
        });
    }

    @Test
    public void probar_error_discriminante_negativo() {
        Parcial objeto_prueba = new Parcial();
        assertThrows(Exception.class, () -> {
            objeto_prueba.calcular_raices_de_ecuacion_cuadratica(1, 2, 10);
        });
    }
}

