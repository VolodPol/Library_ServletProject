package org.project.entity;

public class Publisher {
    private int id;
    private String name;

    public Publisher(){
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return id == publisher.id && name.equals(publisher.name);
    }

    @Override
    public int hashCode(){
        int result = 13;

        result += 31 + result + id;
        result += 31 + result + (this.name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
