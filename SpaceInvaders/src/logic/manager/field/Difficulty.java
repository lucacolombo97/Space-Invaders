package logic.manager.field;

/**
 * Classe che rappresenta la difficoltà di gioco.
 * La difficoltà è espressa come millisecondi di sleep del thread degli invader:
 * più è basso il valore piu gli invader si muovono e sparano velocemente e quindi aumenta la difficoltà.
 */
class Difficulty {

    private int difficulty;

    Difficulty(){
        this.difficulty = 900;
    }

    /**
     * Metodo richiamato ogni volta che si completa un livello.
     */
    void incrementDifficulty(){
        if(difficulty >= 500){
            difficulty -= 100;
        }
    }

    int getDifficulty() {
        return difficulty;
    }
}
