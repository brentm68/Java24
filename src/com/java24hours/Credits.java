package com.java24hours;

public class Credits {
    public static void main(String[] arguments) {
        // set up film information
        String title = "Sharknado";
        int year = 2013;
        String director = "Anthony Ferrante";
        String role1 = "Fin";
        String actor1 = "Ian Ziering";
        String role2 = "April";
        String actor2 = "Tara Reid";
        String role3 = "George";
        String actor3 = "John Heard";
        String role4 = "Nova";
        String actor4 = "Cassie Scerbo";
        String upactor4 = actor4.toUpperCase();
        String uprole4 = role4.toUpperCase();
        //display information
        System.out.println(title + " (" + year + ")\n" +
        "A " + director + " film.\n\n" +
        role1 + "\t\t" + actor1 + "\n"+
        role2 + "\t" + actor2 + "\n" +
        role3 + "\t" + actor3 + "\n" +
        role4 + "\t" + actor4 + "\n" +
        uprole4 + "\t" + upactor4);
    }
}
