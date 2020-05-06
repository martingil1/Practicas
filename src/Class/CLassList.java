package Class;

import java.util.*;

public class CLassList {

    private List<User> listUsers;
    private List<Integer> listNumber;

    //builder
    public CLassList() {
        listUsers = new ArrayList<User>();
        listNumber = new ArrayList<Integer>();
    }

    public void addUser(User u) {
        listUsers.add(u);
    }
    public void addNumber(Integer i) {
        listNumber.add(i);
    }

    public void readAndPrintNumber() {
        for (Integer i : listNumber) {
            System.out.println(listNumber.get(i));
        }
    }
    public void readAndPrintUsers() {
        for (int i=0;i<listUsers.size();i++) {
            System.out.println(listUsers.get(i).toString());
        }
    }

    public void deleteNumber(Integer i) {
        listNumber.remove(i);
    }
    public void deleteUser(User u) {
        listUsers.remove(u);
    }

    public Integer getNumber(Integer x) {
        Integer aux = null;
        for (Integer i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i).equals(x)) {
                aux = listNumber.get(i);
            }
        }
        return aux;
    }
    public User getUser(User user) {
        User userAux = null;
        for (int i = 0; i < listUsers.size(); i++) {
            if (listUsers.get(i).equals(user)) {
                userAux = listUsers.get(i);
            }
        }
        return userAux;
    }

    public void sortArray() {
        Collections.sort(listNumber);
    }

    public void sortInvert() {
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(listNumber, comparador);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CLassList cLassList = (CLassList) o;
        return Objects.equals(listUsers, cLassList.listUsers) &&
                Objects.equals(listNumber, cLassList.listNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listUsers, listNumber);
    }

    @Override
    public String toString() {
        return "CLassList{" +
                "listUsers=" + listUsers +
                ", listNumber=" + listNumber +
                '}';
    }
}
