public class TorreHanoi {
    public static void resolveTorreHanoi(int numeroDeDiscos, String inicio, String destino, String auxiliar) {
        if(numeroDeDiscos == 1) {
            System.out.println("Disco " + numeroDeDiscos + " da torre " + inicio + " para a torre " + destino);
            return;
        }

        resolveTorreHanoi(numeroDeDiscos-1, inicio, auxiliar, destino);
        System.out.println("Disco " + numeroDeDiscos + " da torre " + inicio + " para a torre " + destino);
        resolveTorreHanoi(numeroDeDiscos-1, auxiliar, destino, inicio);
    }
}