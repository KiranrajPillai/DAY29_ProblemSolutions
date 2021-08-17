import java.io.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Population of INDIA state wise: ");
        String file = "src\\population.csv";
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {

                String[] row = line.split(",");
                for(String index : row) {
                    System.out.printf("%-15s", index);
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}