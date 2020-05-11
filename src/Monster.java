public class Monster {
    private String name;
    private int damage;
    private int life;

    public Monster(String name, int damage, int life){
        this.name = name;
        this.damage = damage;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getLife() {
        return life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String attack(Monster adversaire){
        String etat;
        int lifeRemaining = adversaire.getLife() - this.getDamage();
        if(lifeRemaining > 0){

            etat = adversaire.getName() + " has " + lifeRemaining + " point remaining.";
        }else{
            etat = adversaire.getName() + " is KO!!!!";
        }
        adversaire.setLife(lifeRemaining);
        return etat;
    }
}
