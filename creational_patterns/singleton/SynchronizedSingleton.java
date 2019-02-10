package creational_patterns.singleton;

public class SynchronizedSingleton {

  private int state;

  private static SynchronizedSingleton singleton;

  private SynchronizedSingleton(int state){
    this.state = state;
  }

  private SynchronizedSingleton(){
  }

  public void setState(int state){
    this.state = state;
  }

  public int getState(){
    return state;
  }

  public synchronized static SynchronizedSingleton getInstance(int state){
    if(singleton == null)
      singleton = new SynchronizedSingleton(state);

    return singleton;
  }

  public synchronized static SynchronizedSingleton getInstance(){
    if(singleton == null)
      singleton = new SynchronizedSingleton();

    return singleton;
  }



}
