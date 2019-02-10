package creational_patterns.singleton;

public class SingletonBestImplementation {

  private static SingletonBestImplementation singleton = new SingletonBestImplementation();

  private int state;

  private SingletonBestImplementation(){}

  public void setState(int state){
    this.state = state;
  }

  public int getState(){
    return state;
  }

  public static synchronized SingletonBestImplementation getInstance(){
    return singleton;
  }
}
