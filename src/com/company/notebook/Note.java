package com.company.notebook;

import java.util.Date;

public class Note {

    private String author;
    private String text;
    private Date date;

    public Note() {
    }

    public Note(String author, String text, Date date) {
        this.author = author;
        this.text = text;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;

        Note note = (Note) o;

        if (getAuthor() != null ? !getAuthor().equals(note.getAuthor()) : note.getAuthor() != null) return false;
        if (getText() != null ? !getText().equals(note.getText()) : note.getText() != null) return false;
        return getDate().equals(note.getDate());

    }

    @Override
    public int hashCode() {
        int result = getAuthor() != null ? getAuthor().hashCode() : 0;
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        result = 31 * result + getDate().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
