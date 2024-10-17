package midterm;


import java.util.LinkedList;


public class linklist {
    
    public static void main(String[] args) {
        LinkedList<String> brand = new LinkedList<>();

        // insertion
        
        brand.add("LV");
        brand.add("GUCCI");
        brand.addFirst("HERMES");
        brand.addLast("DIOR");
        brand.add(1, "CHANEL");

        System.out.println("Linked List Original: " + brand);
        System.out.println(brand.size());

        //  Seraching  
        if (brand.contains("HERMES")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = brand.contains("CHANEL");
        System.out.println(containslion);

       //      Deletion
      //animals.remove();
       //animals.removeFirst();
       //animals.removeLast();
       //animals.remove(2);
        //System.out.println("LinkedList After Deletion: " + animals);
        //Insertion:    add(); addFirst();  addLast();  add(index, data);
         //Deletion:    remove();   removeFirst();  removeLast(); remove(index);
          //Searching operation:        contains(element); size();
    }


}
