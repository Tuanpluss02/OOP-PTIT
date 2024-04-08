import java.util.Scanner;

class NotJavaFileException extends Exception {
    public NotJavaFileException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String fileName = sc.nextLine();
            try {
                int result = CheckFileExtension(fileName);
                System.out.println(result);
            } catch (NotJavaFileException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static int CheckFileExtension(String fileName) throws NotJavaFileException {
        if (fileName == null || fileName.isEmpty()) {
            throw new NotJavaFileException("Not java file exception.Mark is -1");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        }
        return 0;
    }
}