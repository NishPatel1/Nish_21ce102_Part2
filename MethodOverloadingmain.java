public class MethodOverloadingmain {
    public static void main(String[] args) {
        Methodoverloading MO = new Methodoverloading();
        MO.add(34, 34);
        MO.add(34.20, 34.20);
        System.out.println("The additon of 34+34+34 is " + MO.add(34, 34, 34));
        System.out.println("The additon of 34.20+34.20+34.20 is " + MO.add(34.20, 34.20, 34.20));
    }
}
