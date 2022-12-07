
public class Entidade {
    String nome;
    int vida;
    int defesa;
    int ataque;
    int xp;
    int nivel;

    // exemplo de construtor
    //int vida = 100;
    //int defesa = 100;
    //int ataque = 10;  
    //int xp = 0;
    //int nivel = 1;
    

    public Entidade(String nome, int vida, int defesa, int ataque, int xp, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.xp = xp;
        this.nivel = nivel;
    }

    //getters
    //setters 
    public void setVida(int vida) {
        this.vida = vida;
    } 
}
