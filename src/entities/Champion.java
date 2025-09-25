package entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion (String name, int life, int attack, int armor){
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName(){
        return name;
    }

    public int getLife(){
        return life;
    }

    public int getAttack (){
        return attack;
    }

    public int getArmor(){
        return armor;
    }

    public void takeDamage(Champion other) {
        int danoBruto = other.attack - this.armor;
        int danoReal = Math.max(1, danoBruto);
        this.life -= danoReal;

        if (this.life < 0) {
            this.life = 0;
        }
    }

    public String status(){
        if(this.life == 0){
            return "Nome: " + name + " O de vida (morreu)";
        }
        else {
            return "Nome: " + name + " " + this.life + " de vida";
        }
    }


}
