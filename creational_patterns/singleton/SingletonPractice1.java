package creational_patterns.singleton;

public class SingletonPractice1 {

  // SingletonPractice1 instance
  private static SingletonPractice1 singleton;

  private int state;

  // private singleton's constructor
  private SingletonPractice1(){

  }

  // static method that give you access to a single instance
  public static SingletonPractice1 getInstance(){

    if(singleton == null)
      singleton = new SingletonPractice1();

    return singleton;
  }

  //set method
  public void setState(int newState){
    state = newState;
  }

  //get method
  public int getState(){
    return state;
  }
}
