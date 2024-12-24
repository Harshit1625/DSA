import java.util.*;


// An ArrayList is a resizable array implementation in Java, part of the java.util package, that allows dynamic resizing and provides fast random access to elements(stores objects)
class Collection{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
        //add elements
        list.add(3);
        list.add(4);
        list.add(6);

        System.out.println(list);

        //get element
        int element = list.get(2); //index we have to pass in to get the element
        System.out.println(element);

        //add an element at a specific point(it wont replace the element , it will push it to the next index)
        list.add(2, 9); //(index , desiredValue)
        System.out.println(list);

        //replacing the element
        list.set(2, 2); //(index , desiredValue)
        System.out.println(list);

        //deleteing the element
        list.remove(3);//(index)
        System.out.println(list);

        //getting the size pf the ArrayList
        int size = list.size();
        System.out.println(size);

        //sorting ( sorts arraylist in ascending order)
        Collections.sort(list);
        System.out.println(list);

    }
}

//----------------------------------------------------------------------------------------------
