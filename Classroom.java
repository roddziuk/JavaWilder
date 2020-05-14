public class Classroom {

  public static void main(String[] args) {
    
    Wilder Yana = new Wilder ("Yana", true);
    Wilder Ollie = new Wilder ("Ollie",true);
    Wilder Max = new Wilder ("Max", false);
    Wilder Serge = new Wilder ("Serge", false);
    
    System.out.println(Yana.whoAmI());
    System.out.println(Ollie.whoAmI());
    System.out.println(Max.whoAmI());
    System.out.println(Serge.whoAmI());

  }

}
