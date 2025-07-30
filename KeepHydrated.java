public class KeepHydrated  {
  public static int liters(double time)  {    
    double literSum = time * 0.5;

    //Casting to int will round number
    return (int) literSum;
  }
}
