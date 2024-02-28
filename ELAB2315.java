import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Note {
    String date, content;
    int id;

    Note(int id, String date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }
}

class User {
    String id, accName;
    static int nextId;
    List<Note> notes = new ArrayList<>();

    User(String accName) {
        this.id = getNextId();
        this.accName = accName;
    }

    String getNextId() {
        String res = "";
        if (nextId == 0)
            nextId++;
        if (nextId < 10) {
            res = "00" + Integer.toString(nextId);
        } else if (nextId < 100)
            res = "0" + Integer.toString(nextId);
        else
            res = Integer.toString(nextId);
        nextId++;
        return res;
    }

    public void addNewNote(Note newNote) {
        notes.add(newNote);
    }

    public void printUser() {
        System.out.println("Account: " + accName);
        for (Note note : notes) {
            System.out.println(note.date + " | " + note.content);
        }
    }

}

class Utils {
    static String formatDateInp(String inp) {
        if (inp.length() != 7)
            return null;
        return inp.substring(3, 5) + " " + inp.substring(0, 3) + " " + inp.substring(5, 7);
    }

    static int getNextNoteId(User user) {
        return user.notes.size() + 1;
    }

    static User findUserById(List<User> users, String id) {
        for (User user : users) {
            if (user.id.equals(id))
                return user;
        }
        return null;
    }

    static Note findNoteByid(List<Note> notes, int id) {
        for (Note note : notes) {
            if (note.id == id)
                return note;
        }
        return null;
    }
}

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String accName = sc.nextLine();
            User newUser = new User(accName);
            users.add(newUser);
        }
        while (sc.hasNextLine()) {
            String userId = sc.next();
            User user1 = Utils.findUserById(users, userId);
            String operator = sc.next();
            if (!operator.equals("Add") && !operator.equals("Share")) {
                System.out.println("invalid input");
                return;
            }
            if (operator.equals("Add")) {
                String dateInp = sc.next();
                String note = sc.nextLine();
                int noteId = Utils.getNextNoteId(user1);
                String date = Utils.formatDateInp(dateInp);
                if (date == null) {
                    System.out.println("invalid input");
                    continue;
                }
                Note newNote = new Note(noteId, date, note.substring(1, note.length()));
                user1.addNewNote(newNote);
            } else {
                String userId2 = sc.next();
                int noteId = sc.nextInt();
                User user2 = Utils.findUserById(users, userId2);
                if (user2 == null) {
                    System.out.println("invalid input");
                    continue;
                }
                Note sharedNote = Utils.findNoteByid(user1.notes, noteId);
                if (sharedNote == null) {
                    System.out.println("invalid input");
                    continue;
                }
                int noteId2 = Utils.getNextNoteId(user2);
                user2.addNewNote(new Note(noteId2, sharedNote.date, sharedNote.content));
            }
        }
        for (User user : users) {
            user.printUser();
        }
    }
}