import java.util.Arrays;

public class Mathematics {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Matrix s1=new Matrix(2, 2);
        double[] list={3,1,5,2}; //9.0,10.0,11,12,13,14,15,16
        double[] ls2={2,-1,-5,3};
        double[][] ls3={{1,2,3},{1,2,3}};
        double[] ls4={1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4};
        Matrix s2=new Matrix(2,2);
        Matrix s3=new Matrix(ls3);
        Matrix s4=new Matrix(4,4);
        s1.assign(list);
        s2.assign(ls2);
        s4.assign(ls4);
        Matrix transform= s4.t1(1,4);
        /*String x3=s3.printx();
        String x1=s1.printx();
        String x2=s2.printx();
        System.out.println(x1);
        System.out.println(x3);
        //System.out.println(Arrays.deepToString(s2.x));
        System.out.println(x2);
        System.out.println(s2.rows);*/
        Matrix k= s4.scalar(4);
        String o=k.printx();
        System.out.println(s4.printx());
        System.out.println(o);

    }   
    

}
