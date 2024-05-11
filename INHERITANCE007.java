import java.util.ArrayList;
import java.util.Scanner;

abstract class TestQuestion {
    protected String question;

    protected abstract void readQuestion(Scanner sc);
}

class Essay extends TestQuestion {
    private int numOfAns;

    public Essay(String question, int num) {
        this.question = question;
        this.numOfAns = num;
    }

    public void setNumOfAns(int num) {
        this.numOfAns = num;
    }

    public int getNumOfAns() {
        return numOfAns;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    protected void readQuestion(Scanner sc) {
        int num = Integer.parseInt(sc.nextLine());
        String qs = sc.nextLine();
        setNumOfAns(num);
        setQuestion(qs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("e" + "\n");
        sb.append(numOfAns + "\n");
        sb.append(question + "\n");
        return sb.toString();
    }
}

class MultipleChoice extends TestQuestion {
    private int numOfChoices;
    private ArrayList<String> choices;

    public MultipleChoice() {
        this.question = "";
        this.numOfChoices = 0;
        this.choices = new ArrayList<>();
    }

    public MultipleChoice(String question, int num, ArrayList<String> choices) {
        this.question = question;
        this.numOfChoices = num;
        this.choices = choices;
    }

    public void setNumOfChoices(int num) {
        this.numOfChoices = num;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public int getNumOfChoices() {
        return numOfChoices;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    @Override
    protected void readQuestion(Scanner sc) {
        String numStr = sc.nextLine();
        int num = Integer.parseInt(numStr);
        String qs = sc.nextLine();
        ArrayList<String> choices = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            choices.add(sc.nextLine());
        }
        setQuestion(qs);
        setNumOfChoices(num);
        setChoices(choices);
    }

    private void setQuestion(String qs) {
        this.question = qs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("m" + "\n");
        sb.append(numOfChoices + "\n");
        sb.append(question + "\n");
        for (String choice : choices) {
            sb.append(choice + "\n");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TestQuestion> questions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String type = sc.nextLine();
            if (type.equals("e")) {
                Essay essay = new Essay("", 0);
                essay.readQuestion(sc);
                questions.add(essay);
            } else if (type.equals("m")) {
                MultipleChoice mc = new MultipleChoice();
                mc.readQuestion(sc);
                questions.add(mc);
            }
        }
        System.out.println(n);
        for (TestQuestion question : questions) {
            System.out.print(question);
        }
        sc.close();
    }

}