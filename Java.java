public class Java{
/**
 * @param args
 */
public static void main(String[] args){
int[][][] x = {{{1,2},{3,4}},{{5,6},{7,8}}};

int[][][] y = new int[2][2][];

y[0] = x[0].clone();

y[1][1] = x[1][1].clone();
x[0][0][0] = 100;

x[1][1][1] = 200;

System.out.println(y[0][0][0]+" "+y[1][1][1]);    
}
}
    

