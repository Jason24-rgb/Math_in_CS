import java.util.Arrays;

public class Matrix {
    double[][] x;
    int cols;
    int rows;
    int totlel;
    double[][] trans;

    Matrix(int n, int m){
        x=new double[n][m];
        trans= new double[m][n];
        rows=n;
        cols=m;
        totlel=m*n;
    }
    
    Matrix(double[][] l){
        rows=l.length;
        cols=l[0].length;
        x=l;
    }

    //add matrix argument method constructor

    public String printx(){
        String s="[";
        for(int i=0;i<rows-1;i++){
            s+=Arrays.toString(x[i])+",\n";
        }
        s+=Arrays.toString(x[rows-1]);
        s=s+"]";
        return s;
    }

    public void assign(double[] ls){      
        int r=0;
        int c=0;
        if (ls.length>totlel){
            System.out.println("total numbers has to be less thatn or equal to matrix length");
            return;
        }
        
        for (int i=0;i<ls.length;i++){
            r=i/cols;
            c=i%cols;
            x[r][c]=ls[i];
            trans[c][r]=ls[i];

        }

    }

    public Matrix multiply(Matrix y){
        if(this.cols!=y.rows){
            System.out.println("num of rows of matrix A doesn't match num of columns of matrix B");
            return null;
        }

        Matrix k= new Matrix(this.rows, y.cols);
        int r1=0;
        int r2=0;

        //System.out.println(Arrays.deepToString(k.x));
        // 1 loop 
        for (int i=0;i<k.totlel;i++){
            r1=i/y.cols;
            r2=i%y.cols;
            k.x[r1][r2]=dot(x[r1], y.trans[r2]);
        }

        // 2 loops
        /*for(int i=0;i<k.rows;i++){
            for(int j=0;j<k.cols;j++){
                k.x[i][j]=dot(x[i], y.trans[j]);
            }
        }*/
        



        return k;
    }

    public Matrix t1(int r1, int r2){
        r1-=1;
        r2-=1;
        double[][] a=this.x;
        double[] temp=a[r1];
        a[r1]=a[r2];
        a[r2]=temp;
        Matrix tm=new Matrix(a);
        return tm;
    }

    public Matrix t2(int r, double a){

        Matrix tm=new Matrix(this.x);
        for(int i=0;i<this.cols;i++){
               tm.x[r][i]=tm.x[r][i]*a;
            }
        return tm;
    }

    public Matrix t3(int r1, double a, int r2){
        r1-=1;
        r2-=1;
        Matrix tm=new Matrix(this.x);
        for(int i=0;i<this.cols;i++){
            tm.x[r2][i]+=(tm.x[r1][i]*a);
        }
        return tm;
    }

    private double dot(double[] a, double[] b){
        double x=0;
        for(int i=0;i<a.length;i++){
            x+=a[i]*b[i];
        }
        return x;
    }

    //return a new matrix with scalar multiplier
    public Matrix scalar(double a){
        Matrix n=new Matrix(x);
        for(int i=0;i<this.rows;i++){
            n=n.t2(i,a);
        }
        return n;
    }


}
