import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        UnionFind unionFind = new UnionFind(N);

        while (sc.hasNextInt()){

            int p = sc.nextInt();
            int q = sc.nextInt();

            if( !unionFind.connected(p, q)){

                unionFind.union(p, q);
                System.out.println(p + " "+ q);

            }
        }
    }
}