public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return (name.startsWith("r") || (name.startsWith("R")) ? name+" plays banjo" : name+" does not play banjo");
  }
}