public class Dice {
    public static void main(String [] args ){
        int a[]={1,2,6,6}, i, n=4, ok=1, g=0;
        for(i=0; i<n;i++) {
            if (a[n - 1] == 6)
                ok = -1;
            else if (a[i] != 6)
                g += 1;

        }
        if(ok==1)
            System.out.println(g + "number of girls");
        else
        if(ok==-1)
            System.out.println(ok + " secventa invalida");
    }
}
