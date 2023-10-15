public class Player extends Creature {
    @Override
    public void ShowInfo() {
        System.out.print("Player_:  ");
        super.ShowInfo();

    }

    public Player() {
        super((int) (Math.random()*20+10), (int) (Math.random()*20 + 10), (int) (Math.random()*20 + 10), (int) (Math.random()*20 + 10), 0.3);

    }


    public void regeneration() {

    }


    /** regeneration
     * if (getHealth() < 5){
     * setHealth(int dmgHealth + (getHealth()*setRegeneration());
     * }
     *
     *
     * регенерация:
     * если (ТекущееЗдоровье < 5)
     * for (int i = 0, i <=4, i++){
     *      если (ТекущееЗдоровье < 5){
     *          ТекущееЗдороье = макс.здоровье * регенерацию;
     *      }
     * }
     */

}
