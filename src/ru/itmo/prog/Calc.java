public class Calc{
    public static float createRandomNumber(){
        final int max=9,min=-4;
        float res = (float)(Math.random()*(max-min+1))+min;
        if (res>9) res=9;
        return res;
    }
    public static void printArray(double[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.printf("%7.3f ",arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        long[] y= new long[14];
        for (int i=0;i<y.length;i++){
            y[i]=i+3;	
        }
        float[] x = new float[14];
        for (int i=0;i<x.length;i++){
            x[i]=createRandomNumber();	    
        }
        double[][] e=new double[14][14];
        double temp,temp2;

        for (int i=0;i<e.length;i++){
            for (int j=0;j<e[i].length;j++){
                if (y[i]==16){
                    temp = 0.25/Math.log(Math.abs(x[j]));
                    temp = Math.cos(Math.pow(temp,2));
                }else if(y[i]==3 || y[i]==5 || y[i]==7 || y[i]==8 || y[i]==13|| y[i]==14){
                    temp = 4*(x[j]-0.75);
                    temp=Math.cbrt(Math.pow(x[j],temp));
                    temp=Math.cos(Math.pow(Math.E,temp));
                }else{
                    temp = Math.pow(x[j]/(3-x[j]),x[j]);
                    temp = Math.pow(temp,x[j]*(x[j]+1));
                    temp2 = (double)1/3*Math.tan(x[j]);
                    temp2 = 2*Math.pow(temp2,Math.sin(x[j]));
                    temp = Math.pow(temp2,temp);
                }
                e[i][j] = temp;
            }
        }
        printArray(e);
    }
}