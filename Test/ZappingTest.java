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

}