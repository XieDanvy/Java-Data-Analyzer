# Analyseur et Scraper de Statistiques Sportives (Java)

Ce projet est une application Java orientée objet (POO) conçue pour extraire (scraper) et analyser des statistiques de joueurs (notamment de basket-ball, au vu des métriques traitées telles que les pourcentages à 2 points et 3 points). 

L'application récupère des données textuelles ou HTML depuis un cache ou une source distante, les transforme en objets Java exploitables, puis applique des algorithmes d'analyse pour en tirer des statistiques globales.

## Architecture du Projet

Le projet est divisé en plusieurs classes ayant des responsabilités uniques, respectant ainsi les principes de la programmation orientée objet :

* **`Main.java`** : Le point d'entrée de l'application. Il orchestre le flux d'exécution en récupérant le contenu (via un `ContentProxy` implicite), en lançant le scraping, puis en affichant les données. **Fait technique notable** : cette classe utilise l'**API de Réflexion Java (`java.lang.reflect`)** pour itérer dynamiquement sur les attributs des objets et appeler les méthodes d'analyse sans avoir à les coder en dur.
* **`ItemsScrapper.java`** : Le moteur d'extraction. Sa mission est de parcourir le code source (HTML, JSON ou texte brut) et de le découper pour hydrater une liste d'objets `Item`.
* **`ItemAnalyzer.java`** : Le moteur d'analyse. Il prend en entrée la liste des objets `Item` générée par le scraper et propose des méthodes pour calculer diverses statistiques métiers.
* **`Item.java`** *(Classe modèle implicite)* : Représente l'entité extraite (un Joueur). Elle contient les attributs métier : nom, équipe, poste, pourcentage à 2 points et pourcentage à 3 points.
* **`ContentProxy.java`** *(Implicite)* : Service chargé de récupérer la source de données (probablement une page web), avec un système de gestion de cache en cas d'erreur de connexion (`IOException`).
* **`WebPageFetcher.java`** : Nouveau composant réseau. Responsable de l'ouverture des connexions HTTP, de l'envoi des requêtes GET et de la lecture des flux de données distants (HTML/JSON).

## Fonctionnalités (Métriques d'Analyse)

Une fois les données extraites, la classe `ItemAnalyzer` a pour objectif de fournir les informations suivantes :
1.  **Rang 1 Joueur** (`getRang1Joueur`) : Identifier le meilleur joueur selon les critères de l'ensemble de données.
2.  **Équipe la plus récurrente** (`getTeamPlusRecurrent`) : Trouver l'équipe qui revient le plus souvent dans le jeu de données.
3.  **Poste le plus récurrent** (`getPostePlusRecurrent`) : Déterminer la position/le rôle le plus représenté parmi les joueurs extraits.
4.  **Meilleur pourcentage à 2 points** (`getPlusHautPourcentage2Point`) : Extraire le taux de réussite maximum à 2 points.
5.  **Meilleur pourcentage à 3 points** (`getPlusHautPourcentage3Point`) : Extraire le taux de réussite maximum à 3 points.

## État du Projet (À compléter)

Le code actuel fournit l'**architecture et le squelette** de l'application. Pour que le programme soit 100% fonctionnel, les éléments suivants doivent être implémentés par le développeur :

- [ ] **Logique de Scraping** : Remplacer la boucle infinie et les `null` dans `ItemsScrapper.java` par de vraies expressions régulières (Regex) ou un parseur HTML (comme Jsoup) pour extraire les données de la variable `pageSource`.
- [ ] **Logique d'Analyse** : Remplacer les retours `null` dans `ItemAnalyzer.java` par des algorithmes de tri, de comptage (ex: `HashMap` pour compter les récurrences) et de recherche de maximums sur la liste `items`.

## Exécution

### Prérequis
* Java Development Kit (JDK) 8 ou supérieur.

### Lancement
1. Placez-vous à la racine du projet.
2. Compilez les fichiers Java :
   ```bash
   javac fr/pantheonsorbonne/ufr27/miashs/poo/*.java
    ```
3. Executez la classe principale
   ```bash
   java fr.pantheonsorbonne.ufr27.miashs.poo.Main
   ```

### Sortie
Si la source de données est correctement extraite, la console affichera d'abord la liste détaillée de chaque joueur (Nom, Équipe, Poste, etc.), suivie d'une section analytique générée dynamiquement affichant le résultat de toutes les méthodes d'analyse.

## Auteurs
Projet développé par Xie Danvy.