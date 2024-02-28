package fr.ecole3il.rodez2023.carte.elements;

import java.util.List;

public class Noeud<E> {
    E E;
    List<Noeud<E>> voisins ;
    public E getValeur(){

        return E;
    }
    public List<Noeud<E>> getVoisins(){
        return voisins;
    }
    public void ajouterVoisin(Noeud<E> voisin){
        voisins.add(voisin);

    }
}