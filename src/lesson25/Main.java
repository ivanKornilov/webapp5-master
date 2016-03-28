package lesson25;

import java.util.Date;

/**
 * Kornilov
 * 25.03.2016
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(new Date());
        Link myLink,myLink2,myLink3;
        myLink = new Link("Javawebinar","Javawebinar.ru");
        myLink2 = myLink;
        myLink3 = new Link("sdd","sadasd");
        System.out.println(myLink);
        System.out.println(myLink.getClass());
        System.out.println(myLink.equals(myLink2));
        System.out.println(myLink.equals(myLink3));
        System.out.println(myLink.getClass());
        System.out.println(myLink.hashCode());


    }
}