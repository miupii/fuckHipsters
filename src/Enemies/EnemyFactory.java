package Enemies;

/**
 * Created by codecadet on 17/10/2018.
 */
public class EnemyFactory {


    public static Hipster getHipster(int i){

        if (i > 34){
            Hipster newHipster = new Hipster(60, 2 + 4 * (i -34));
            System.out.println("third wave : " + i);
            return newHipster;
        }
        if (i > 17){
            Hipster newHipster = new Hipster(50, 2 + 4 * (i -17));
            System.out.println("second wave : " + i);
            return newHipster;
        }
        Hipster newHipster = new Hipster(40, 2 + 4 * i);
        System.out.println("first wave : " + i);
        return newHipster;
    }


}
