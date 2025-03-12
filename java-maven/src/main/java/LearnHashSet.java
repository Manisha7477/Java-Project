import java.util.HashSet;
import java.util.Iterator;

class LearnHashSet {
    public static void main(String[] args) {
        //create
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //search
        if(set.contains(1)){
            System.out.println("Yes contains");
        }
        if(!set.contains(4)){
            System.out.println("Doesn't contains");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("deleted");
        }

        //size
        System.out.println("Size is: "+set.size());

        //all print
        System.out.println("List is: "+ set);

        //iteractor
        // for(int i=0; i<set.size(); i++){
        //not use
        // }

        //instaed of for use this
        Iterator it = set.iterator();
        //hasNext
        while (it.hasNext()) {
           System.out.println(it.next());
            
        }


    }
}
