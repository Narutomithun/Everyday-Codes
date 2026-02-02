import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class labsheet1 implements Serializable {
    int id;
    String name;
    float fees;

    public labsheet1(int id, String name, float fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    public String toString() {
        return id + "   " + name + "  " + fees + "\n";
    }
}

/* 
 * Persist.java - Serialization example
 */
class Persist {
    public static void main(String args[]) {
        try {
            labsheet1 s1 = new labsheet1(1, "ram", 10000.00f);
            FileOutputStream fout = new FileOutputStream("d:\\f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
 * Depersist.java - Deserialization example
 */
class Depersist {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("d:\\f.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            labsheet1 s = (labsheet1) in.readObject();
            System.out.println(s);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
