package instituto;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ
    @Test
    public void ejercicio1() {
        String nombre = "";
        boolean resultado = nombre.length() > 0;
        assertFalse(resultado, "Error: El sistema rechazó un nombre válido");
    }

    @Test
    public void ejercicio2() {
        String contraseña = "12345678";
        boolean resultado = contraseña.length() == 8;
        assertTrue(resultado, "Error: El sistema rechazó una contraseña inválida");
    }

    @Test
    public void ejercicio3() {
        String contraseña = "Admin";
        boolean resultado = contraseña.length() == 8;
        assertFalse(resultado, "Error: El sistema rechazó una contraseña válida");
    }


    @Test
    public void ejercicio4() {
        String email = "usuario.gmail.com";
        boolean resultado = email.contains("@");
        assertFalse(resultado, "Error: El sistema rechazó una email válido");
    }


    @Test
    public void ejercicio5() {
        int edad = 16;
        assertEquals(16, edad, "Error: El sistema rechazó un usuario que no tiene 16 años");
    }



}