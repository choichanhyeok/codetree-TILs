import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        String productName = st.nextToken();
        int productCode = Integer.parseInt(st.nextToken());

        Product productA = new Product("codetree", 50);
        Product productNew = new Product(productName, productCode);

        bw.write(productA.about() + "\n");
        bw.write(productNew.about());
        bw.flush();
        bw.close();
    }
}


class Product {
    private final String productName;
    private final int productCode;

    public Product(String productName, int productCode){
        this.productName = productName;
        this.productCode = productCode;
    }

    public String about(){
        return "product " + this.productCode + " is " + this.productName;
    }
}