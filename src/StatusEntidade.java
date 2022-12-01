public class StatusEntidade {
    //criado como uma função para trazer o print do status da entidade atualizados!
    public static String statusEntidade(Entidade entidade) {

        return ("[Nome:"+entidade.nome+"] / [Vida: "+entidade.vida+"] / [Defesa: "+entidade.defesa+"] / [Ataque: "+entidade.ataque+"] / [XP: "+entidade.xp+"] / [Nivel: "+entidade.nivel+"]");

    }
}