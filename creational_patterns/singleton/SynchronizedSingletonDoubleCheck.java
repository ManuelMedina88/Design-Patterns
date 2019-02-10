package creation_patterns.singleton;

public class SynchronizedSingletonDoubleCheck {

  private static SynchronizedSingletonDoubleCheck singleton;

  private int state;

  private SynchronizedSingletonDoubleCheck(){}

  public void setState(int state){
    this.state = state;
  }

  public int getState(){
    return state;
  }

  public static SynchronizedSingletonDoubleCheck getInstance(){

    if(singleton == null){

      synchronized(SynchronizedSingletonDoubleCheck.class){

        if(singleton == null)
          singleton = new SynchronizedSingletonDoubleCheck();
      }

    }

    return singleton;
  }
}
