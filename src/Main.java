public class Main {

    public static void main(String[] args)
    {
        Wakacje Hiszpania = new Wakacje("Hiszpania", "Madryt", "Fajny Hotel", 20, 320.00, "Room 20");
        double cost = Hiszpania.cost("2016/10/12", "2016/10/16", true);
        Wakacje Grecja = new Wakacje("Grecja", "Ateny", "Fajny Hotel2", 12, 195.00, "Room 211");
        double cost2 = Grecja.cost("2016/10/12", "2016/10/16", true);
        Wakacje Wlochy = new Wakacje("Wlochy", "Rzym", "Fajny Hotel3", 22, 298.00, "Room 123");
        double cost3 = Wlochy.cost("2016/10/12", "2016/10/16", true);
        System.out.println(cost);
        System.out.println(cost2);
        System.out.println(cost3);
    }
}
