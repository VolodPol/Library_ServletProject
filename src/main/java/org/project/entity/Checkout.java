package org.project.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Checkout {
    private int id;
    private Timestamp startTime;
    private Timestamp endTime;
    private boolean isReturned;
    private Status status;
    private User user;
    private Book book;

    public Checkout(){}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getStartTime() {
        return startTime;
    }
    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }
    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public boolean isReturned() {
        return isReturned;
    }
    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Checkout checkout = (Checkout) o;

        if (id != checkout.id) return false;
        if (isReturned != checkout.isReturned) return false;
        if (!Objects.equals(startTime, checkout.startTime)) return false;
        if (!Objects.equals(endTime, checkout.endTime)) return false;
        if (status != checkout.status) return false;
        if (!Objects.equals(user, checkout.user)) return false;
        return Objects.equals(book, checkout.book);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (isReturned ? 1 : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (book != null ? book.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", isReturned=" + isReturned +
                ", user=" + user +
                ", book=" + book +
                '}';
    }
}
