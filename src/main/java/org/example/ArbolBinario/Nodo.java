package org.example.ArbolBinario;

public class Nodo {
    protected int dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(int valor){
        dato=valor;
        izdo=dcho=null;
    }
    public Nodo (Nodo ramaIzdo, int valor, Nodo ramaDcho){
        dato=valor;
        izdo=ramaIzdo;
        dcho=ramaDcho;
    }

    public int valorNodo(){return dato;}
    public Nodo GetSubardolIzdo(){return izdo;}
    public Nodo GetSuberdolDcho(){return dcho;}
    public void nuevoValor(int d){dato=d;}
    public void SetRamaIzdo(Nodo n){izdo=n;}
    public void SetRamadDcho(Nodo n){dcho=n;}

    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }









}
