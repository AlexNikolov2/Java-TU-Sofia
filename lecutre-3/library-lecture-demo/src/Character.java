public abstract class Character {
    private int health;
    private int damage;
    private double attackSpeed;
    private String race;
    private String name;

    public Character(
        int health, 
        int damage,
        double attackSpeed, 
        String race, 
        String name) {

        this.health = health;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.race = race;
        this.name = name;
    
    }

    public void introduce() {
        System.out.printf("%s %s\n", this.race, this.name);
    }
    
    public int getAttackSpeed(){
        return  1 / iattackSpeed;
    }
    public void attack(Character defender){
        defender.defend(this.damage);
    }
    public void defend(int damage){
        health -= damage;
        System.out.printf("%s took %d \n", this.name, damage);
    }
    public boolean isAlive(){
        return health > 0;
    }
}
