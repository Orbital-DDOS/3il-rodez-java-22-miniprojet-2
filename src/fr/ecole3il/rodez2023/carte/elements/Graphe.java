package fr.ecole3il.rodez2023.carte.elements;

import java.util.List;
import java.util.Map;
public class Graphe<E> {

    private Map<Noeud<E>, Map<Noeud<E>,Double>>adjacence;
    private Noeud<E> depart;
    private Noeud<E> arrivee;
    private double cout;
    private Noeud<E> noeud;
    private List<Noeud<E>> noeuds;


    public void ajouterNoeud(Noeud<E> noeud){
        if(adjacence.containsKey(noeud)){
            return;
        }else
        {
            noeuds.add(noeud);
        }

    }
    public void ajouterArete(Noeud<E> depart, Noeud<E> arrivee, double cout){

    }
    public double getCoutArete(Noeud<E> depart, Noeud<E> arrivee){

        return 0;
    }
    public List<Noeud<E>> getNoeuds(){

        return null;
    }
    public List<Noeud<E>> getVoisins(Noeud<E> noeud){

        return null;
    }

}
