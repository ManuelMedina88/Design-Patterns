package creational_patterns.singleton;

public class SingletonBestImplementationClient {
  public static void main(String args[]){

    SingletonBestImplementation singleton = SingletonBestImplementation.getInstance();

    singleton.setState(56);

    System.out.println(singleton.getState());
  }
}
