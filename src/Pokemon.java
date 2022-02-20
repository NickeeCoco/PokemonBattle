public class Pokemon implements Runnable {
    private String name;
    private int hp;
    private int attackPower;
    private Pokemon target;

    public Pokemon(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void setTarget(Pokemon target) {
        this.target = target;
    }

    @Override
    public void run() {
        while(this.hp > 0 && target.hp > 0) {
            target.hp -= this.attackPower;
            System.out.println(this.name + " attacks " + target.name + ". " + target.name + "'s HP is now " + target.hp + ".");
        }

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if(target.hp <= 0) {
            System.out.println(this.name + " won against " + target.name + ".");
        }
    }
}
