import java.util.ArrayList;

public class ChipotleJr
{
    public static void main(String[] args){

        int counter = 1;
        int iCounter = 0;

        do {

            ArrayList<String> burrito = new ArrayList<>();

            burrito.add(riceChoice());

            burrito.add(meatChoice());

            burrito.add(beanChoice());

            burrito.add(salsaChoice());

            burrito.add(veggieChoice());

            burrito.add(cheeseChoice());

            burrito.add(guacChoice());

            burrito.add(quesoChoice());

            burrito.add(sourCreamChoice());

            System.out.print("Burrito " + counter + ": ");
            for(int i = 0; i < burrito.size(); i++){

                if(burrito.get(i).contains("all")){
                    iCounter += 3;
                }else if(!burrito.get(i).contains("no")){
                    iCounter++;
                }

                if(i < (burrito.size()-1)){
                    System.out.print(burrito.get(i) + ", ");

                }else{
                    System.out.print(burrito.get(i));
                }
            }

            cost(counter, iCounter);

            System.out.println();

            burrito.clear();

            iCounter = 0;

            counter++;

        }while(counter <= 25);

    }

    private static void cost(int count, int ingred){
        System.out.println(" $" + (3 +(.50*ingred)) + "0");
    }

    private static String riceChoice(){

        ArrayList<String> rice = new ArrayList<>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");

        return rice.get((int) (Math.random()* rice.size()));
    }

    private static String meatChoice(){

        ArrayList<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("no meat");

        return meat.get((int) (Math.random()* meat.size()));
    }

    private static String beanChoice(){

        ArrayList<String> beans = new ArrayList<>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");

        return beans.get((int) (Math.random()* beans.size()));
    }

    private static String salsaChoice(){

        ArrayList<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("all salsa options");

        return salsa.get((int) (Math.random()* salsa.size()));
    }

    private static String veggieChoice(){

        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("diced tomato");
        veggies.add("no veggies");
        veggies.add("all veggie options");

        return veggies.get((int) (Math.random()* veggies.size()));
    }

    private static String cheeseChoice(){

        ArrayList<String> cheese = new ArrayList<>();
        cheese.add("cheese");
        cheese.add("no cheese");

        return cheese.get((int) (Math.random()* cheese.size()));
    }

    private static String guacChoice(){

        ArrayList<String> guac = new ArrayList<>();
        guac.add("guac");
        guac.add("no guac");

        return guac.get((int) (Math.random()* guac.size()));
    }

    private static String quesoChoice(){

        ArrayList<String> queso = new ArrayList<>();
        queso.add("queso");
        queso.add("no queso");

        return queso.get((int) (Math.random()* queso.size()));
    }

    private static String sourCreamChoice(){

        ArrayList<String> sourCream = new ArrayList<>();
        sourCream.add("sour cream");
        sourCream.add("no sour cream");

        return sourCream.get((int) (Math.random()* sourCream.size()));
    }

}
