public class Zapping {

    public static int cambioDeCanalOptimo(int canalOrigen, int canalDestino) {
        int difCanales = Math.abs(canalDestino - canalOrigen);
        int clicsDirectos = Math.min(difCanales, 99 - difCanales);
        int clicsIndirectos = Math.abs(difCanales - clicsDirectos);
        return clicsDirectos + clicsIndirectos;
    }

}
