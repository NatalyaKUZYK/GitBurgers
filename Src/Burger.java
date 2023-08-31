public class Burger {
    public String bun;
    public boolean meat;
    public String cheese;
    public String greens;
    public boolean mayo;

    public Burger(String bun, boolean meat, String cheese, String greens, boolean mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        //System.out.println("Склад звичайного бургера:" + bun + "," + meat + "," + cheese + "," + greens + "," + mayo);
    }

    public Burger(String bun, boolean meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens= greens;
       // System.out.println("Склад дієтичного бургера:" + bun + "," + meat + "," + cheese + "," + greens);
    }


    public Burger( String cheese,boolean mayo, String greens,boolean meat,String bun, boolean extraMeat) {
        this.bun = bun;
        this.meat = meat ;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        //System.out.println("Склад бургера з подвійним м'ясом:" + bun + "," + extraMeat + "," + cheese + "," + greens + "," + mayo);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + (meat ? "м'ясо" : "подвійне м'ясо") + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayo=" + (mayo ? "присутній" : "відсутній")+
                '}';
    }
}
