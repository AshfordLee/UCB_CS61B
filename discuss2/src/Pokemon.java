public class Pokemon
{
    public String name;
    public int level;
    public static String trainer="Ash";
    public static int partySize=0;

    public Pokemon(String name,int level)
    {
        this.name=name;
        this.level=level;
        this.partySize+=1;
    }

    public static void change(Pokemon poke,int level)
    {
        poke.level=level;
        level=50;
        poke=new Pokemon("Luxray",1);
        poke.trainer="Team Rocket";
    }

    public void printStats()
    {
        System.out.println(name+" "+level+" "+trainer);
    }

    public static void main(String[] arguments)
    {
        Pokemon p = new Pokemon("Pikachu", 17);
        Pokemon j = new Pokemon("Jolteon", 99);
        System.out.println("Party size: " + Pokemon.partySize);
        p.printStats();
        int level = 18;
        Pokemon.change(p, level);
        p.printStats();
        Pokemon.trainer = "Ash";
        j.trainer = "Cynthia";
        p.printStats();
        // Pokemon.printStats();
    }
}

//(a) Write what would be printed after the main method is executed.
// Party size: 2
// Pikachu 17 Ash
// Pikachu 18 Team Rocket
// Pikachu 18 Cynthia

//(b):B

//(c):Program doesn't compile.