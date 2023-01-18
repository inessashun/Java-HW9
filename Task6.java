package homework_class9;

public class Task6 {
    public static void main(String[] args) {
     /* Create an array of countries.
     While retrieving all values from an array print capital
      for each country choose any five countries.
      */
        String[] country = {"France", "Spain", "Italy", "Austria", "Turkey"};
        String[] capital = {"Paris", "Madrid", "Rome","Vienna", "Istanbul" };

                for (int i=0; i<country.length; i++) {
                    System.out.println(capital[i] + " is the capital of " + country[i]);
                }
    }


}
