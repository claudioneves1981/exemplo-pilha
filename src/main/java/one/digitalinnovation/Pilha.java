package one.digitalinnovation;

public class Pilha<T> {

    private No<T> refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(T object){
        No novoNo = new No(object);
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public T pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return (T) noPoped.getDado();
        }
        return null;
    }

    public T top(){
        return refNoEntradaPilha.getDado();
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "----------------\n";
        stringRetorno +="    Pilha\n";
        stringRetorno += "----------------\n";

        No noAuxiliar =  refNoEntradaPilha;

        while(true){
            if(noAuxiliar!= null){
                stringRetorno +="[No{dado="+ noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "----------------\n";
        return stringRetorno;
    }
}
