
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
    public void Entidade2(String nome, int vida, int xp, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.xp = xp;
        this.nivel = nivel;
    }

    //criado como uma função para trazer o status da entidade atualizados!
    public String mostrarStatus() {

        return("[Nome:"+this.nome+"] / [Vida: "+this.vida+"] / [Defesa: "+this.defesa+"] / [Ataque: "+this.ataque+"] / [XP: "+this.xp+"] / [Nivel: "+this.nivel+"]");

    }

    //getters
    
    public String getNome() {return nome;}
    public int getVida() {return vida;}
    public int getDefesa() {return defesa;}
    public int getAtaque() {return ataque;}
    public int getXp() {return xp;}
    public int getNivel() {return nivel;}

    //setters 
    public void setVida(int vida) {this.vida = vida;} 
    public void setNome(String nome){this.nome = nome;}
    public void setDefesa(int defesa){this.defesa = defesa;}
    public void setAtaque(int ataque){this.ataque = ataque;}
    public void setXp(int xp){this.xp = xp;}
    public void setNivel(int nivel){this.nivel = nivel;}

}
