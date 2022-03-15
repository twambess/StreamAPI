package MinMax;

public class Main {
    public static void main(String[] args) {
        int n=100;
    double array1[]=new double[n];
    for(int i=0;i<array1.length;i++){
        array1[i]=Math.random();

    }
        double max=array1[0];
        double min=array1[0];
        double avg=0;
        for(double a:array1){
            if(max<a)
                max=a;
            if(min>a)
                min=a;
            avg+=a;
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Avg: "+avg/array1.length);
    }
}
