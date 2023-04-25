import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    public void testCambioDeCanalDe0a0() {
        // Arrange
        int canalOrigen = 0;
        int canalDestino = 0;
        int clicsEsperados = 0;

        // Act
        int clicsObtenidos = Zapping.cambioDeCanalOptimo(canalOrigen, canalDestino);

        // Assert
        assertEquals(clicsEsperados, clicsObtenidos);
    }

    @Test
    public void testCambioDeCanalDe1a2() {
        // Arrange
        int canalOrigen = 1;
        int canalDestino = 2;
        int clicsEsperados = 1;

        // Act
        int clicsObtenidos = Zapping.cambioDeCanalOptimo(canalOrigen, canalDestino);

        // Assert
        assertEquals(clicsEsperados, clicsObtenidos);
    }

    @Test
    public void testCambioDeCanalDe10a30() {
        // Arrange
        int canalOrigen = 10;
        int canalDestino = 30;
        int clicsEsperados = 20;

        // Act
        int clicsObtenidos = Zapping.cambioDeCanalOptimo(canalOrigen, canalDestino);

        // Assert
        assertEquals(clicsEsperados, clicsObtenidos);
    }

    @Test
    public void testCambioDeCanalDe2a99() {
        // Arrange
        int canalOrigen = 2;
        int canalDestino = 99;
        int clicsEsperados = 2;

        // Act
        int clicsObtenidos = Zapping.cambioDeCanalOptimo(canalOrigen, canalDestino);

        // Assert
        assertEquals(clicsEsperados, clicsObtenidos);
    }

    @Test
    public void testCambioDeCanalDe5a63() {
        // Arrange
        int canalOrigen = 5;
        int canalDestino = 63;
        int clicsEsperados = 41;

        // Act
        int clicsObtenidos = Zapping.cambioDeCanalOptimo(canalOrigen, canalDestino);

        // Assert
        assertEquals(clicsEsperados, clicsObtenidos);
    }

    @Test
    public void testCambioDeCanalDe63a5() {
        // Arrange
        int canalOrigen = 63;
        int canalDestino = 5;
        int expectedDistanciaOptima = 41;

        // Act
        int actualDistanciaOptima = Zapping.cambioDeCanalOptimo(canalOrigen, canalDestino);

        // Assert
        assertEquals(expectedDistanciaOptima, actualDistanciaOptima);
    }

    @Test
    public void testCambioDeCanalDe1a51() {
        // Arrange
        int canalOrigen = 1;
        int canalDestino = 51;
        int expectedDistanciaOptima = 49;

        // Act
        int actualDistanciaOptima = Zapping.cambioDeCanalOptimo(canalOrigen, canalDestino);

        // Assert
        assertEquals(expectedDistanciaOptima, actualDistanciaOptima);
    }




}