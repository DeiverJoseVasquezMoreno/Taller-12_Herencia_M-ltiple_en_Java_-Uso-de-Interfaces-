public class Casa implements Movible {

    @Override
    public void moverse() {
        // Esta implementación no tiene sentido para una Casa
        System.out.println("Las casas no se mueven.");
    }
}