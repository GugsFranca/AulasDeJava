package generics.exemplo;

public class Par<C,V>{
    private C chave;
    private V valor;

    public Par() {
    }

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public void setChave (C chave){
        this.chave = chave;
    }
    public C getChave(){
        return this.chave;
    }
    public void setValor(V valor){
        this.valor = valor;
    }
    public V getValor(){
        return this.valor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((chave == null) ? 0 : chave.hashCode());
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
        Par<?,?> other = (Par<?,?>) obj;
        if (chave == null) {
            if (other.chave != null)
                return false;
        } else if (!chave.equals(other.chave))
            return false;
        return true;
    }

    
}