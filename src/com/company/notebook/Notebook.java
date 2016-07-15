package com.company.notebook;


import java.util.ArrayList;
import java.util.Date;

public class Notebook {

    private ArrayList<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    /**
     * look at all notes in notebook
     *
     * @return
     */
    public String readAllNotes() {
        String result = "";
        for (Note note : notes) {
            result += note + "\n";
        }
        return result;
    }

    /**
     * add note to notebook
     *
     * @param author
     * @param message
     * @param date
     */
    public void addNote(String author, String message, Date date) {
        notes.add(new Note(author, message, date));
    }

    /**
     * remove note from notebook
     *
     * @param author - remove by author
     * @return
     */
    public boolean removeFromNotes(String author) {
        for (Note note : notes) {
            if (note.getAuthor().equals(author)) {
                notes.remove(note);
                return true;
            }
        }
        return false;
    }

    /**
     * update note in notebook
     *
     * @param index
     * @param author  - you could put null or ""
     * @param message - you could put null or ""
     */
    public void updateNote(int index, String author, String message) {
        Note note = notes.get(index);
        if (note != null) {
            if (author != null && !author.equals("")) {
                note.setAuthor(author);
            }
            if (message != null && !message.equals("")) {
                note.setText(message);
            }
        }
    }
}
