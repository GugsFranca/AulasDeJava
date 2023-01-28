package generics.caixaComHeranca;

class CaixaIntTeste {
    public static void main(String[] args) {
       // CaixaInt<String> caixaA = new CaixaInt<>();
       // caixaA.guardar("Não era Int???");
       // String caisaA = caixaA.abrir();
       // System.out.println(caisaA);
       //Funciona so se fosse class CaixaInt<TIPO>

        CaixaInt caixaB = new CaixaInt();
        caixaB.guardar(12);
        int caisaB = caixaB.abrir();
        System.out.println(caisaB);
    }

}
