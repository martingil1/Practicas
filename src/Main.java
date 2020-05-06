

import Class.*;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Martin", "Gil");
        User user2 = new User("Juan", "Perez");
        User user3 = new User("Pepe", "Garcia");

        CLassList list = new CLassList();
        list.addUser(user1);
        list.addUser(user2);
        list.addUser(user3);
        CLassList listNumber = new CLassList();
        listNumber.addNumber(1);
        listNumber.addNumber(3);
        listNumber.addNumber(4);
        listNumber.addNumber(2);

        System.out.println(Arrays.asList(list));
        System.out.println(listNumber);
        listNumber.sortArray();
        System.out.println(listNumber);
        listNumber.sortInvert();
        System.out.println(listNumber);
        /***********************************************/
        ClassMap classMap = new ClassMap();

        classMap.addMap(1,user1.toString());
        classMap.addMap(2,user2.toString());
        classMap.addMap(3,user3.toString());

        User user4 = new User("Pepe","Garcia");
        classMap.addMap(4,user4.toString());
        System.out.println(classMap);

        System.out.println(classMap.getMap(2));
        /*********************************************/
        ClassSet classSet = new ClassSet();
        classSet.addSet(user1.toString());
        classSet.addSet(user2.toString());
        classSet.addSet(user3.toString());
        classSet.addSet(user4.toString());
        System.out.println(classSet);

    }

}
