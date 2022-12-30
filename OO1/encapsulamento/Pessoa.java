package OO1.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;

    Pessoa(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120){
        this.idade= novaIdade;
        }
    }
    public String getNome(){
        return nome.substring(0,1).toUpperCase().concat(nome.substring(1)); //faz a primeira letra do nome ficar maiúscula
    }
    public void setNome(String Nome){
        this.nome = Nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + getNome() + " e eu tenho " + getIdade() + " anos de idade";
    }
}
