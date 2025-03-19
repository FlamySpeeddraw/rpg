## Violations du Principe de Responsabilité Unique (SRP)

1. La classe `Main` :
   - Gère à la fois l'interface utilisateur et la logique de création du joueur
   - Devrait être séparée en classes distinctes pour la gestion de l'UI et la logique métier

2. La classe `Player` :
   - Contient des attributs non initialisés (`XCoordinate`, `YCoordinate`)
   - La méthode `toString()` mélange la présentation avec la logique métier

## Violations du Principe d'Ouvert/Fermé (OCP)

1. L'énumération `GameClass` :
   - Les statistiques sont codées en dur dans l'énumération
   - Difficile d'ajouter de nouvelles classes sans modifier le code existant
   - Devrait utiliser une approche plus flexible avec des classes concrètes

## Violations du Principe de Substitution de Liskov (LSP)

1. La classe `Player` :
   - Ne semble pas avoir de hiérarchie de classes, mais pourrait bénéficier d'une interface ou d'une classe abstraite pour définir le contrat d'un personnage

## Violations du Principe de Ségrégation des Interfaces (ISP)

1. La classe `Player` :
   - Expose des getters pour tous les attributs, ce qui crée un couplage fort
   - Devrait exposer uniquement les méthodes nécessaires pour les opérations spécifiques

## Violations du Principe d'Inversion des Dépendances (DIP)

1. La classe `Main` :
   - Dépend directement des implémentations concrètes plutôt que d'abstractions
   - Devrait utiliser des interfaces pour les dépendances

## Autres Points Importants

1. Gestion des Erreurs :
   - Absence de validation des entrées utilisateur
   - Pas de gestion des exceptions spécifiques
   - Les exceptions génériques sont utilisées dans la signature de `main`

2. Nommage :
   - Incohérence dans le nommage des méthodes (`gInventory` au lieu de `getInventory`)
   - Variables non initialisées (`playing` dans la boucle while)

3. Architecture :
   - Absence de séparation claire entre les couches (UI, logique métier, données)
   - Pas de pattern de conception visible pour la gestion du jeu

4. Tests :
   - Aucun test unitaire visible dans la structure du projet
   - Difficulté à tester due au couplage fort entre les classes

5. Configuration :
   - Les valeurs des statistiques sont codées en dur
   - Pas de système de configuration externe
