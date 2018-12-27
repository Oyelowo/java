public class mango {
    public static void main(String[] args){
        System.out.println(average(53,54,656,56,34,43,56,32,4,6,2,4,6,73,56,75,36));
    }

    public static int average(int...numbers){
        int total=0;
        for (int x:numbers){
            total+= x;
        }
        return total/numbers.length;
    }
}
