package creational_patterns.singleton;

public class ClientSingleton1 {

  public static void main(String args[]){

    SingletonPractice1 singleton = SingletonPractice1.getInstance();

    singleton.setState(3);

    System.out.println("The state of the object is : " + singleton.getState());

    SingletonPractice1 singleton2 = SingletonPractice1.getInstance();

    System.out.println("The state of the object is : " + singleton2.getState());
  }
}
