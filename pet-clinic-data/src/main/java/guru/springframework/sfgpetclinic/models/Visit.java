package guru.springframework.sfgpetclinic.models;

import java.time.LocalDate;

public class Visit extends BaseEntity
{
    private LocalDate date;
    private String petDescription;
    private Pet pet;

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }
}
