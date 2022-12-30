package classe;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Sampaio";
        u1.email = "pedrosampaio@gay.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Sampaio";
        u2.email = "pedrosampaio@gay.com";

        System.out.println(u1 == u2);
        System.out.println(u1.nome.equals(u2.nome));
        System.out.println(u1.equals(u2));
    }
}
