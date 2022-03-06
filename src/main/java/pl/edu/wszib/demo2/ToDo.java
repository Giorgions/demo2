package pl.edu.wszib.demo2;

public class ToDo {
    enum Status {
        NEW,
        IN_PROGRESS,
        DONE
    }

    private Integer id;
    private String nazwa;
    private Status status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
