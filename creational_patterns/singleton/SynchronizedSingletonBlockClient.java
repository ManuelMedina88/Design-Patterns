package creational_patterns.singleton;

public class SynchronizedSingletonBlockClient{
  public static void main(String args[]){

    SynchronizedSingletonBlock singleton = SynchronizedSingletonBlock.getInstance();

    singleton.setState(20);

    System.out.println("The state is : " + singleton.getState());
  }
}
