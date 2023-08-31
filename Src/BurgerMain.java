public class BurgerMain {
    public static void main(String[] args) {
     Burger regularBurger = new Burger("булочка", true, "сир", "зелень", true);
     Burger dietBurger = new Burger("булочка", true, "сир", "зелень");
     Burger doubleMeatBurger = new Burger("сир",true, "зелень", false,"булочка", true );
        System.out.println("Склад звичайного бургера:" + regularBurger);
        System.out.println("Склад дієтичного бургера:" + dietBurger);
        System.out.println("Склад бургера з подвійним м'ясом:" + doubleMeatBurger);
   }
  }

