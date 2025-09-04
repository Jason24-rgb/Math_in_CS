import java.util.Arrays;
 import java.util.Scanner;

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
        //s4.transpose
        //Matrix transform= s4.t1(1,4);
        /*String x3=s3.printx();
        String x1=s1.printx();
        String x2=s2.printx();
        System.out.println(x1);
        System.out.println(x3);
        //System.out.println(Arrays.deepToString(s2.x));
        System.out.println(x2);
        System.out.println(s2.rows);*/
        Matrix k= s4.scalar(4);
        Matrix s5=new Matrix(s4.x);
        String p=s4.printTrans();
        System.out.println(p);
        String o=s4.printx();
        System.out.println(o);
        //System.out.println(s4.printx());
        // System.out.println(o);

        //organize tests next time

        //user input
        //add user input file later
        // also maybe a test file better organzeation
        //create seperate options for matrices and 2d calculations
        Scanner scan = new Scanner(System.in);
        System.out.println(o);
        System.out.print("what operation do you want to perform?");
        int op = scan.nextInt();
        
        if (op==1){
            System.out.println("enter rows");
            int r1=scan.nextInt();
            int r2=scan.nextInt();
            Matrix m1=s4.t1(r1, r2);
            o=m1.printx();
            System.out.println(o);
        }
        if (op==2){
            System.out.println("enter row");
            int r1=scan.nextInt();
            System.out.println("enter scalar");
            double sc=scan.nextDouble();
            Matrix m1=s4.t2(r1,sc);
            o=m1.printx();
            System.out.println(o);
        }
        if (op==3){
            System.out.println("enter row to change");
            int r1=scan.nextInt();
            System.out.println("enter row to add from");
            int r2=scan.nextInt();
            System.out.println("enter scalar to multiply by");
            double sc=scan.nextDouble();
            Matrix m1=s4.t3(r2, r1, sc);
            o=m1.printx();
            System.out.println(o);
        }
        if (op==4){
            Matrix m1=new Matrix(s4.trans);
            o=s4.printTrans();
            System.out.println(o);
        }

        scan.close();
    }   
    

}
