package lesson1.particiant;

/**
 * @author ilnaz-92@yandex.ru
 * Created on 11/02/2019
 */
public class Human extends Animal implements Swiming
{
  private Gender gender;

  private final static double DEFAULT_JUMP_VALUE = 9.0;
  private final static double DEFAULT_SWIM_VALUE = 10.0;
  private final static double DEFAULT_RUN_VALUE = 100.0;

  public Human(int age, String name, Gender gender)
  {
    super(age, name);
    this.gender = gender;
  }

  @Override
  public boolean jump(double distanceJump)
  {
    return distanceJump <= gender.getCoef() * COEF_FOR_HUMAN * DEFAULT_JUMP_VALUE;
  }


  @Override
  public String toString()
  {
    return "Human{" + "gender=" + gender + "} " + super.toString();
  }

  @Override
  public boolean swim(double distanceToSwim)
  {
    return distanceToSwim <= DEFAULT_SWIM_VALUE;
  }

  @Override
  public boolean run(double distanceRun)
  {
    return distanceRun <= DEFAULT_RUN_VALUE;
  }
}
