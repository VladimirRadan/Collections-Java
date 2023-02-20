import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(15);
        lista.add(10);
        lista.add(45);
        lista.add(453);
        lista.add(45);
        lista.add(10);
        lista.add(232);
        lista.add(45);
        lista.add(3424);
        lista.add(45);


        Collections.sort(lista);

        System.out.println("Sorted list: " + lista);

        Collections.emptyList();

        lista.remove(2);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("-----------------------------------------");

        LinkedList<Integer> list = new LinkedList(lista); // el1 <-> el2 <-> el3
        list.add(34);

        for (int a:list) {
            System.out.println(a);
        }

        System.out.println("-----------------------------------------");

        List<String> stringList = new ArrayList<>();
        stringList.add("Pera");
        stringList.add("Zika");

        //stringList.clear();
        if (!stringList.isEmpty()){
            System.out.println(stringList);
        }else {
            System.out.println("Lista je prazna");
        }

        System.out.println("-----------------------------------------");


        List myList = new ArrayList();
        myList.add(45);
        myList.add(50.55);
        myList.add("Pera");
        myList.add(true);
        myList.add('A');

        for (Object o:myList) {
            System.out.println(o);
        }


        Set<Integer> integerSet = new HashSet<>(lista);
        System.out.println("Set: " + integerSet);
        //Sorted list: [10, 10, 10, 15, 45, 45, 45, 45, 232, 453, 3424]

        Collections.shuffle(lista);

        System.out.println(lista);

        HashSet<String> hashSet  =  new HashSet<>();


//    - Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
//    - Napraviti klasu koja sadrzi Main metodu i u njoj napraviti minimum 4 studenta cije podatke treba uneti preko scanner-a: ime prezime i ocena.
//    - Ocene treba da budu 5,6,7 i 9.
//    - Kreirati dve liste.
//    - Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
//    - Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
//    - Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
//    - Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.





    }




}