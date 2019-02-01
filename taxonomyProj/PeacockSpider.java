//australia
//dance

public class PeacockSpider extends Araneae{

  public String location;
  public boolean dance;

  public PeacockSpider(String local, boolean d, int Llegs, int bodySect, int pep, boolean pred, boolean spin){
    super(Llegs, bodySect, pep, pred, spin);
    location = local;
    dance = d;
  }

  public void setLocation(String mate){
    location = mate;
  }

  public void setDance(boolean mhm){
    dance = mhm;
  }

  public static void main(String[] args) {
    PeacockSpider s = new PeacockSpider("Australia", true, 8, 2, 2, true, true);
    System.out.println("\nThe Peacock Spider shares characteristics with other Araneae.");
    System.out.println("\nThe Peacock Spider is special because it lives in " + s.location + " and it dances.\n\n");
  }

}
