public class Main {
    public static void main(String[] args) {

        Preparat p1 = new Preparat("Paine", 250, 5);
        Preparat p2 = new Preparat("Peste", 300, 15);
        Preparat p3 = new Preparat("Pui", 275, 25);
        Preparat p4 = new Preparat("Vita", 225, 35);

        Cuptor.getInstance(280).addPreparat(p1);
    //    Cuptor c = Cuptor.getInstance(290);

        System.out.println(Cuptor.getInstance(280));

        Cuptor c2 = Cuptor.getInstance(280).clone();

        System.out.println(c2);

        System.out.println("//////////");

        Cuptor.getInstance(280).addPreparat(p2);
        System.out.println(Cuptor.getInstance(280));
        System.out.println(c2);

        Cuptor c3 = Cuptor.getInstance(280);
        System.out.println(c3);

        System.out.println("....");

        Cuptor.getInstance(280).addPreparat(p3);
        System.out.println(Cuptor.getInstance(280));
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("//////////");

        c3.addPreparat(p4);
        System.out.println(Cuptor.getInstance(280));
        System.out.println(c2);
        System.out.println(c3);

        //////
/*
        CuptorMultiplu.getInstance(1, 260);
        CuptorMultiplu.getInstance(2, 270);
        CuptorMultiplu.getInstance(3, 280);
        CuptorMultiplu.getInstance(4, 290);

        CuptorMultiplu.addPreparat(p1);
        CuptorMultiplu.addPreparat(p2);
        CuptorMultiplu.addPreparat(p3);
        CuptorMultiplu.addPreparat(p4);
        CuptorMultiplu.addPreparat(p4);

        System.out.println(CuptorMultiplu.getInstance(1, 260));
        System.out.println(CuptorMultiplu.getInstance(2, 270));
        System.out.println(CuptorMultiplu.getInstance(3, 280));
        System.out.println(CuptorMultiplu.getInstance(4, 290));
*/




    }
}