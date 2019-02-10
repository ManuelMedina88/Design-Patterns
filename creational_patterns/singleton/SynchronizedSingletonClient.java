package creational_patterns.singleton;

public class SynchronizedSingletonClient {

  public static void main(String args[]){

    System.out.println("The value of state is : " + SynchronizedSingleton.getInstance(5).getState());

    SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();

    System.out.println("The value of state is : " + singleton.getState());
  }
}
