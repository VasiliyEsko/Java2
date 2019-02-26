package lesson1;

import java.util.ArrayList;
import java.util.List;

import lesson1.particiant.*;

/**
 * @author ilnaz-92@yandex.ru
 * Created on 11/02/2019
 */
public class TournamentLauncher
{

  public static void main(String[] args)
  {

    // 1 этап полосы препятствия прыжки

    List<Animal> members = new ArrayList<>();

    Animal member1 = new Cat(5, "BARSIK", Cat.TYPE_BRITYSH);
    Animal member2 = new Cat(10, "KISYA", Cat.TYPE_PERSIA);
    Animal member3 = new Dog(3, "MUHTAR", Dog.TYPE_BULDOG);
    Animal member4 = new Human(23, "Ivan ivanov", Gender.MALE);


    /********** YOU CAN NO CHAGE ****************/

    members.add(member1);
    members.add(member2);
    members.add(member3);
    members.add(member4);

    System.out.println("Начало первого этапа, прыжки.");
    System.out.println();
    for (Animal animal : members)
    {
      System.out.println(animal.toString() + ":" + animal.jump(3));
    }

    // 2 этап полосы препятствия плавание

    Swiming swiming1 = new Dog(3, "MUHTAR", Dog.TYPE_BULDOG);
    Swiming swiming2 = new Human(23, "Ivan ivanov", Gender.MALE);
    Swiming swiming3 = new Cat(10, "KISYA", Cat.TYPE_PERSIA);

    System.out.println();

    List<Swiming> swimings = new ArrayList<>();
    swimings.add(swiming1);
    swimings.add(swiming2);
    swimings.add(swiming3);
    System.out.println("Начало второго этапа, плавание.");
    System.out.println();
    for (Swiming swiming : swimings)
    {
      System.out.println(swiming.toString() + ":" + swiming.swim(3));
    }
    System.out.println();

    // 3 этап полосы препятствия бег

    Running running1 = new Dog(3, "MUHTAR", Dog.TYPE_BULDOG);
    Running running2 = new Human(23, "Ivan ivanov", Gender.MALE);
    Running running3 = new Cat(10, "KISYA", Cat.TYPE_PERSIA);

    List<Running> running = new ArrayList<>();
    running.add(running1);
    running.add(running2);
    running.add(running3);

    System.out.println("Начало третьего этапа, бег.");
    System.out.println();

    for (Running run : running)
    {
      System.out.println(run.toString() + ":" + run.run(30));
    }
    System.out.println();
    System.out.println("Полоса прептствия окончена.");
  }
}
