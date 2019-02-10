package creational_patterns.singleton;

public class SingletonBestImplementationEager {

  private final static SingletonBestImplementationEager singleton;

  private int state;

  private SingletonBestImplementationEager(){}

  public void setState(int state){
    this.state = state;
  }

  public int getState(){
    return state;
  }

  public synchronized SingletonBestImplementationEager getInstance(){
    if(singleton == null)
      singleton = new SingletonBestImplementationEager();

    return singleton;
  }
}
