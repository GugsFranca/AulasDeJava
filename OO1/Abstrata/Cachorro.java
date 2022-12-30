package OO1.Abstrata;

public class Cachorro extends Mamifero{

    @Override
    public String mover() {
        return "Usando as patas";
    }

    @Override
    public String Mamar() {
        return "Usando leite";
    }
}
