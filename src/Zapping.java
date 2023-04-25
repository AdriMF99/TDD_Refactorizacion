public class Zapping {

    public static int cambioDeCanalOptimo(int canalOrigen, int canalDestino) {
        int distancia = Math.abs(canalDestino - canalOrigen);
        if (distancia > 49) {
            distancia = 99 - distancia;
        }
        return distancia;
    }
}
