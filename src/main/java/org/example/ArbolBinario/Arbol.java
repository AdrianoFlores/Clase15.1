package org.example.ArbolBinario;

public class Arbol {
    private Nodo raiz;
    public Arbol(){this.raiz=null;}

    public void insertar(int dato){
        if (this.raiz==null){
            this.raiz=new Nodo(dato);

        }else{
            this.insertar(this.raiz,dato);
        }
    }

    private void insertar(Nodo padre, int dato){
        if (dato<padre.valorNodo()){
            if(padre.GetSubardolIzdo()==null){
                padre.SetRamaIzdo(new Nodo(dato));
            }else {
                insertar(padre.GetSubardolIzdo(), dato);

            }
        }else if(dato>padre.valorNodo()){
            if(padre.GetSubardolDcho()==null){
                padre.SetRamadDcho(new Nodo(dato));
            }else {
                insertar(padre.GetSuberdolDcho(),dato)
            }
        }
    }












}
