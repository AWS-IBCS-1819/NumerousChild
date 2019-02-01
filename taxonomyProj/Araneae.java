//8 legs
//cephalothorax
//abdomen
//mouth
//fangs
//2 pedipalps
//predators
//make silk/webs

public class Araneae {
  public int legs;
  public int bodySections;
  public int pedipalps;
  public boolean predator;
  public boolean web;

  public Araneae(int Llegs, int bodySect, int pep, boolean pred, boolean spin){
    legs = Llegs;
    bodySections = bodySect;
    pedipalps = pep;
    predator = pred;
    web = spin;
  }

  public void setLegs(int newValue){
    legs = newValue;
  }

  public void setBodysect(int newValue){
    bodySections = newValue;
  }

  public void setPepidalps(int newValue){
    pedipalps = newValue;
  }

  public void setPredator(boolean sure){
    predator = sure;
  }

  public void setWeb(boolean ok){
    web = ok;
  }

}
