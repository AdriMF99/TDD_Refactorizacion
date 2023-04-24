public class Zapping {

    public static int cambioDeCanalOptimo(int canalOrigen, int canalDestino) {
        int difCanales = Math.abs(canalDestino - canalOrigen);
        int clicsDirectos = Math.min(difCanales, 99 - difCanales);
        int clicsIndirectos = 1 + Math.min(canalOrigen, canalDestino) + (99 - Math.max(canalOrigen, canalDestino));
        return Math.min(clicsDirectos, clicsIndirectos);
    }







}
