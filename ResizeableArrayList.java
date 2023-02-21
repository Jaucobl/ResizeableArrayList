import java.lang.reflect.Array;

public class ResizeableArrayList {
    static String[] array = new String[0];
    int N = 0;

    public static void add(String item){

        int length  = array.length + 1;
        String[] newarray = new String[length];
        for (int i = 0; i < array.length; i++){
            newarray[i] = array[i];
        }
        newarray[length - 1] = item;
        array = newarray;
    }
    public static void addspecific(String item, int index){

        int length  = array.length + 1;
        String[] newarray = new String[length];
        int i = 0;
        while (i < array.length) {
            newarray[i] = array[i];
            if (i == index) {
                newarray[i] = item;
                i++;
                while (i < array.length + 1) {
                    newarray[i] = array[i -1];
                    i++;
                }

            }
            i++;
        }
        array = newarray;
    }

    public static void clear(){
        String[] clearedarray = new String[0];
        array = clearedarray;
    }

    public static boolean contains(String item){
        for (int i = 0; i < array.length; i++){
            if(array[i] == item){
                return true;
            }
        }
        return false;
    }

    public static String get(int index){
        for (int i = 0; i < array.length; i++){
            if (i == index){
                return array[i];
            }
        }
        return "This should never print";
    }

    public static int indexof(String element){
        for (int i = 0; i < array.length; i++){
            if (array[i] == element){
                return i;
            }
        }
        return 0;
    }

    public static boolean isempty(){
        if (array.length > 0){
            return false;
        } else {
            return true;
        }
    }

    public static void remove(int index){

        int length  = array.length - 1;
        String[] newarray = new String[length];
        for (int i = 0; i < array.length; i++){
            if (i != index){
                newarray[i] = array[i];
            }
            else{
                while(i < array.length - 1){
                    newarray[i] = array[i + 1];
                    i++;
                }
            }


        }
        array = newarray;
    }

    public static boolean removeelement(String element) {
        int length = array.length - 1;
        String[] newarray = new String[length];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != element) {
                newarray[i] = array[i];
            } else {
                while (i < array.length - 1) {
                    newarray[i] = array[i + 1];
                    i++;
                }
                array = newarray;
                return true;
            }

        }
        return false;
    }

    public static void set(int index, String element){
        for (int i = 0; i < array.length; i++){
            if (i == index){
                array[i] = element;
            }
        }
    }

    public static int size(){
        return array.length;
    }

    public static String[] toArray(){
        return array;
    }
    public static void main(String[] args){
        add("Hello");
        add("My");
        add("Name");
        add("is");
        add("Jacob");
        addspecific("not", 2);
        set(2, "yes");
//        System.out.println(contains("My"));
//        System.out.println(contains("Hi"));
//        System.out.println(get(2));
//        System.out.println(indexof("Name"));
//        System.out.println(isempty());
//        System.out.println(size());
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        remove(4);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println(removeelement("Knot"));
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
