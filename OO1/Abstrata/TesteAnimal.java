package OO1.Abstrata;

public class TesteAnimal {
    public static void main(String[] args) {
        Mamifero a = new Cachorro();
        System.out.println(a.Mamar());
        System.out.println(a.mover());
        System.out.println(a.respirara());
    }


}
