public class Lampada {
    private boolean estado;

    public Lampada(boolean estadoInicial) {
        this.estado = estadoInicial;
        if (estado) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }

    public boolean isAcesa() {
        return estado;
    }

    public void acender() {
        estado = true;
        System.out.println("A lâmpada foi acesa.");
    }

    public void apagar() {
        estado = false;
        System.out.println("A lâmpada foi apagada.");
    }
}
