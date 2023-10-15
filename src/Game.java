public class Game {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.ShowInfo();

        Monster monster1 = new Monster();
        monster1.ShowInfo();


        // i число регенераций,  до 4-х раз за бой, Z - результат выпавшего кубика (1...6)
        int i, Z = 0;

        // N - модификатор атаки и число бросков кубика (если значение N=0 то присвоить значение
        // N = 1 - кубик в любом случае нужно бросить хотя бы 1 раз)

        double monsterN = Math.abs(monster1.getAttack() - (player1.getProtection() + 1));
        double playerN = Math.abs(player1.getAttack() - (monster1.getProtection() + 1));
        System.out.println("|| playerN: " + playerN + "/ monster: " + monsterN + " ||");

        int queueAttack = (int) (3 + Math.random());
        while (monster1.getHealth() >= 0 && player1.getHealth() >= 0) {

            // считаем кол-во бросков (N) и смотрим результат (Z>5 // Z<5), j - это переброс кубика
// 1.1 ниже приведена атака игрока 1.1 до 1.2
            if (playerN != 1 && queueAttack > 2) {
                System.out.println("queue Player, queue: " + queueAttack);
                for (int j = 0; j <= playerN; j++) {
                    //System.out.print(" for. ");

                    Z = (int) (1 + Math.random() * 6);
                    //System.out.println("Z: " + Z);
                    // как только Z>5, то переходим к следующему действию т.е. атака успешная и можно наносить урон
                    if (Z >= 5) {
                        System.out.print(" Z>5, attack: ");
                        monster1.setHealth(monster1.getHealth() - player1.getAttack());
                        //прекращаем действия если жизни <= 0
                        if (monster1.getHealth() <= 0) monster1.setHealth(0);

                        //break;
                    }
                    monster1.ShowInfo();
                    j++;
                }

            } else {
                Z = (int) (1 + Math.random() * 6);

                //тот же самый код что и выше т.к. наносим урон если атака успешная
                if (Z >= 1) {
                    System.out.print(" ELSE break Z>5, attack: ");
                    monster1.setHealth(monster1.getHealth() - player1.getAttack());
                    monster1.ShowInfo();
                    //прекращаем действия если жизни <= 0
                    if (monster1.getHealth() <= 0) monster1.setHealth(0);

                    //break;
                }//if
            }//else
// 1.2 выше приведена атака игрока 1.1 до 1.2
// 2.1 ниже приведена атака монстра 2.1 до 2.2

            if (monsterN != 1 && queueAttack < 2) {
                System.out.println("queue Monster, queue: " + queueAttack);
                for (int j = 0; j <= monsterN; j++) {
                    //System.out.print(" for. ");

                    Z = (int) (1 + Math.random() * 6);
                    //System.out.println("Z: " + Z);
                    // как только Z>5, то переходим к следующему действию т.е. атака успешная и можно наносить урон
                    if (Z >= 5) {
                        System.out.print(" Z>5, attack: ");
                        player1.setHealth(player1.getHealth() - monster1.getAttack());
                        //прекращаем действия если жизни <= 0
                        if (player1.getHealth() <= 0) player1.setHealth(0);

                        //break;
                    }
                    player1.ShowInfo();
                    j++;
                }

            } else {
                Z = (int) (1 + Math.random() * 6);

                //тот же самый код что и выше т.к. наносим урон если атака успешная
                if (Z >= 1) {
                    System.out.print(" ELSE break Z>5, attack: ");
                    player1.setHealth(player1.getHealth() - monster1.getAttack());
                    //прекращаем действия если жизни <= 0
                    if (player1.getHealth() <= 0) player1.setHealth(0);

                    //break;
                }//if
            }//else
            // 2.2 выше приведена атака монстра 2.1 до 2.2

        }//НОВАЯ

    }//psvm
}//Game


/**
 * Необходимо реализвать
 * 1) Класс существа:
 * 1.1) Характеристики необходимо генерировать случайным образом:
 * - для класса Player
 * - для класса Monster
 * 1.2) Диапазаны значений:
 * - Атака 1...30
 * - Защита 1...30
 * - Здоровье 1...N
 * -- Если ХП = 0 - МЕТОД смерть
 * -- Если ХП мало - МЕТОД Регенерация: ХП = ХП(текущее)*0.3 (от ХП(макс))
 * -
 * 1.3)
 * 2) Бой:
 * 2.1) Атака:
 * N - модификатор атаки и кол-во кубиков,
 * Z - число выпавшее на кубике
 * <p>
 * N = (Защита(врага) +1 ) - Атака(нападения)
 * Если N >= 1, то
 * генерируем рандомное число Z            // имитация броска кубика
 * генерируем снова если (N > 2 или Z < 5)
 * <p>
 * N = (Защита(врага) +1 ) - Атака(нападения)
 * for (int i = 0, i >= N, i++){
 * Z = random
 * <p>
 * <p>
 * <p>
 * if (Z > 5 $$ i <= N) {
 * System.out.println("Нанести урон");
 * }
 * else (Z < 5 $$  i = N){System.out.println("Промах");}                  }
 * }
 */

     /*
        if (player1.getHealth() > 0 && monster1.getHealth() > 0 ) {
            System.out.println("Start Battle: ");

            //атака монстра:
            double PlayerLastHealth = player1.getHealth();
            //int modif_Attack =  monster1.getAttack() - (player1.getProtection() + 1);
            //используя модификатор атаки он равен кол-ву бросаемых кубиков (но всегда >=1) с цифрами от 1 до 6. Результат >=5 - успешная атака
            // рандомное int a = (int) ( Math.random() * 7 + 1 )
            player1.setHealth( PlayerLastHealth - monster1.getAttack() );


            if (PlayerLastHealth >5 && PlayerLastHealth <10 && i < 5) {
                PlayerCurrentHealth = PlayerLastHealth * 0.3;
                i++;

                System.out.println(PlayerLastHealth);

                   Необходимо реализвать
                   1) Автогенерация статов для монстра и игрока черезе функцию рандом
                   1.1) Автогенерацию лучше сделать такую чтобы можно было просто задать пределы и потом использовать
                   1.2)
                        везде как метод передавая ему значения, т.к. для данного задания необходимо:
                        1.1.1) диапазон атака (1 - 30)
                        1.1.2) диапазон защиты (1 - 30)
                        1.1.3) диапазон здоровья (1 - N)
                            1.1.3.1) здоровье = 0 - смерть
                            1.1.3.2) Если низкое здоровье, то 4 раза за бой регенерация 30% от Максимального Здоровья
                        1.1.4) диапазон урона - это два значения: модификатор атаки и нанесение урона
                            1.1.4.1) Модификатор атаки: Урон[атакующего] - (Защита[противника] + 1)
                            1.1.4.2) Успешная атака:
                                1.1.4.2.1) несколько случайных чисел - их количество равно модификатору атаки
                                1.1.4.2.2) диапазон каждого из чисел от (1 - 6)
                                1.1.4.2.3) если хоть одно число равно 5 или 6 то Атака Успешная
                        1.1.5) -- -- --
                   1.2) Реализовать:
                        1.2.1) объекты должны реагировать на некорректные аргументы методов
                        1.2.2) Обязательные классы сущностей: монстр и игрок, другие по желанию
                   1.3) РЕЗУЛЬТАТ: приложение с реализацией классов и примером их использования

                   2) бой
                   2.1) должны уменьшатся жизни
                   2.2)




                Код который пока не пригодился ниже:
                //int PlayerCurrentMaxHealth = player1.getMaxHealth();
                //int MonsterCurrentMaxHealth = monster1.getMaxHealth();

                while (player1.getHealth() >= 0 && monster1.getHealth() >= 0) {
                int monster1_CurrentHealth = monster1.getHealth();
                monster1_CurrentHealth = monster1.getHealth() - player1.getAttack();
                System.out.println(monster1_CurrentHealth);



                int player1_CurrentHealth = player1.gethealth();
                player1_CurrentHealth = player1.gethealth() - monster1.getAttack();

                monster1.ShowInfo();



                2ой способ

                        if (player1.getHealth() > 5) {
            System.out.println("Start Battle: ");
            double PlayerLastHealth = PlayerCurrentHealth;
            PlayerCurrentHealth = PlayerLastHealth - monster1.getAttack();
            if (PlayerLastHealth >5 && i < 5) {
                PlayerCurrentHealth = PlayerLastHealth * 0.3;
                i++;
                System.out.println(PlayerLastHealth);
            }


        }
      */