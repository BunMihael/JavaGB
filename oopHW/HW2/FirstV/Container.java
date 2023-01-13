package oopHW.HW2.FirstV;

public class Container {
    String[] container;

    public static String[] example() {
        String[] example = { "Pushkin Aleksandr 1799-1837",
                "Sergey Pushkin 1770-1848",
                "Nadezda Pushkina 1775-1836",
                "Lev Puskin",
                "Olga Chicherina",
                "Osip Ganibal",
                "Maria Pushkina" };
        return example;
    }

    public void setContainer(String[] data) {
        this.container = data;
    }

    public String[] getContainer(){
        return container;
    }
}
