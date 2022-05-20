package ende.ende.modelo;

/**
 *
 */
public class Jugador {

    // número de partidas ganadas
    public int exitos;

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar() {
        String opcion = "";
        Integer c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                opcion = ("piedra");
                break;
            case 1:
                opcion = ("papel");
                break;
            case 2:
                opcion = ("tijeras");
        }
        return opcion;
    }

    public void setExitos() {
        exitos++;
    }

    public int getExitos() {
        return (exitos);
    }
}
