public class Monster extends Creature {
    @Override
    public void ShowInfo() {
        System.out.print("Monster_: ");
        super.ShowInfo();
    }

    public Monster() {
        super((int) (Math.random()*20+10), (int) (Math.random()*20 + 10), (int) (Math.random()*20 + 10), (int) (Math.random()*20 + 10), 0);

    }

}
