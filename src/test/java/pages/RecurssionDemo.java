package pages;

public class RecurssionDemo {
    public static void main(String[] args) {
        System.out.println(recurssion(4));

    }

    public static int recurssion(int n){

        if(n==0 || n==1) return 1;
        return n *=recurssion(n-1);

    }
}
