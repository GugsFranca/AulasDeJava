package excecao;

public class Aluno {

    public final String nome;
    public final float nota;

    public Aluno(String nome, float nota){
        this.nome = nome;
        this.nota = nota;
    }
    public String toString(){
        return "Aluno "+ nome + " tirou nota " + nota;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + Float.floatToIntBits(nota);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Float.floatToIntBits(nota) != Float.floatToIntBits(other.nota))
            return false;
        return true;
    }

    
}
