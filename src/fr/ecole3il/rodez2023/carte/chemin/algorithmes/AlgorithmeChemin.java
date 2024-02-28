package fr.ecole3il.rodez2023.carte.chemin.algorithmes;

import fr.ecole3il.rodez2023.carte.elements.Carte;
import fr.ecole3il.rodez2023.carte.elements.Chemin;

public interface AlgorithmeChemin {
    Chemin trouverChemin(Carte carte, int x, int y, int x1, int y1);
}
