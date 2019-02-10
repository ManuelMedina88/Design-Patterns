package creational_patterns.singleton;

public class SynchronizedSingletonBlock {

  private int state;

  private static SynchronizedSingletonBlock singleton;

  private SynchronizedSingletonBlock(){}

  public void setState (int state){
    this.state = state;
  }

  public int getState (){
    return state;
  }

  public static SynchronizedSingletonBlock getInstance(){

    synchronized(SynchronizedSingletonBlock.class){
      if(singleton == null)
        singleton = new SynchronizedSingletonBlock();
    }

    return singleton;
  }
}
