import java.lang.*;

public class SimpleArrayList {
    private final static int INITIAL_CAPACITY = 5; // initial size of vector
    private int cap = INITIAL_CAPACITY; //current capacity of array that holds vectors
    private int size = 0; //current number of elements in vector
    private int[] arr = new int[cap]; // / ordinary array where elements of vector are held
    // ... constructors and methods

    //default constructor creating vector of size 0 and capacity = initial_capacity
    public SimpleArrayList(){
     int []vector = new int[0];
     return vector;

    }


    public SimpleArrayList(int a ){ //Constructor taking one value of type int and creating a vector with this single element (size will be 1).
        int vector[] = new int [1];
        vector[0] = a;
    }

    public SimpleArrayList(int[] arr){ /*Constructor taking an array of ints; its elements will become elements of the
        vector, size will be the number of these elements and the capacity must be
        appropriately chosen (see below).*/

    }


    public SimpleArrayList(SimpleArrayList vector){ //vector  elements will be elements of the vector being created.

    }

    public int size(){ //returning the size (size) of the vector.
        return size;
    }

    public void clear(){ //clearing the vector; after this operation the state of the vector becomes identical to the state of an object created by the default constructor.

    }


    public void trim(){ //after calling this method the array arr has capacity equal to the current size.

    }

    public void insert(int ind, int[] other) throws IndexOutOfBoundsException { /*throws an IndexOutOfBoundsException if the value of ind is larger than
size or negative;
 inserts elements from the array other (which is of size, say, sz) into the vector starting at position indicated by the index ind. If the current capacity
is sucient, existing elements of the vector from position ind are shifted
to the right to make room for new elements from the array other. If the
capacity is too small to accommodate old and new elements, a new array
arr is allocated, with capacity twice as big as necessary, i.e., 2*(size+sz).
Old and new elements are copied into this array at correct positions.
The method returns the reference to the object that it was invoked on (this)*/
        if(ind <= 0){

        }


    }





    public SimpleArrayList insert(int ind, int e){} // inserts single element e at position ind
    public SimpleArrayList append(int e){} //appends single element e at the end of vector
    public SimpleArrayList append(int[] a){}//appends to vector elements passed as arguments
    public SimpleArrayList append(SimpleArrayList a){} //appends to the vector elements form another vector(passed as argument)







    public static void main(String[] args) {
        SimpleArrayList a =
                new SimpleArrayList().append(new int[]{1,3}).insert(1,2).append(6).insert(3,new int[]{4,5});

        SimpleArrayList b = new SimpleArrayList(a);
        for (int i = 0; i < a.size(); ++i)
            a.set(i,a.get(i)+6);

        b.append(a).append(13).trim();



        
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
    }



}
/* otput
a -> Cap=12, size=6: [ 7 8 9 10 11 12 ]
b -> Cap=13, size=13: [ 1 2 3 4 5 6 7 8 9 10 11 12 13 ]
*/