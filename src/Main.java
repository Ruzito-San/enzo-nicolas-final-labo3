//Enzo Nicolas Guerci Ferreyra

public class Main {
    public static void main(String[] args) {
        GestionGenerica nuevaGestion = new GestionGenerica();


        Computadora compu1 = new Computadora("HP","compu1",20,100,"intel",8,960);
        Computadora compu2 = new Computadora("Exo","compu2",1,50,"amd",16,480);
        Telefono phone1 = new Telefono("Samsung","a54",10,100,"android",512,5.7);
        Telefono phone2 = new Telefono("iPhone","8plus",1,100,"IOS",256,6);
        Accesorio accesory1 = new Accesorio("Sony","cable1",1,10,"hdmi","2.1");
        Accesorio accesory2 = new Accesorio("Sony","cable2",5,7,"hdmi","1.4");

        nuevaGestion.ADD(compu1);
        nuevaGestion.ADD(compu2);
        nuevaGestion.ADD(phone1);
        nuevaGestion.ADD(phone2);
        nuevaGestion.ADD(accesory1);
        nuevaGestion.ADD(accesory2);




        StringBuilder sb = new StringBuilder();


        //get datos por separado------------------------------------------------

        sb = nuevaGestion.getInfo("compu1");
        System.out.printf("sb: " + sb);


        System.out.printf("\n \n");

        sb = nuevaGestion.getInfo("a54");
        System.out.printf("sb: " + sb);


        System.out.printf("\n \n");

        sb = nuevaGestion.getInfo("cable");
        System.out.printf("sb: " + sb);


        System.out.printf("\n \n");

        sb = nuevaGestion.getInfo("cable1");
        System.out.printf("sb: " + sb);

        //get datos por separado------------------------------------------------



        System.out.printf("\n \n");


        //get all info------------------------------------------------

        sb=nuevaGestion.GetAllInfo();
        System.out.printf("sb: " + sb);


        //get all info------------------------------------------------



        System.out.printf("\n \n");

        boolean a = true;

        //borrar ------------------------------------------------



        a = nuevaGestion.Delete("cable");
        if (a==true) {
            System.out.println("se borro el dato");
        }


        System.out.printf("\n \n");

        a = nuevaGestion.Delete("8plus");
        if (a==true) {
            System.out.println("se borro el dato");
        }

        //borrar------------------------------------------------


        System.out.printf("\n \n");

        //get all info 2 ------------------------------------------------

        sb=nuevaGestion.GetAllInfo();
        System.out.printf("sb: " + sb);

        //get all info 2 ------------------------------------------------




    }
}