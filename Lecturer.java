package sample;
/**
 * @author David (1972038)
 */
public class Lecturer extends Employee{
    protected String nidn;

    public Lecturer() {
    }

    public Lecturer(String nidn,String nik, String firstName, String lastName ) {
        super(nik, firstName, lastName);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String toString(){
        return (String.format("%-9s %-25s %-25s",getNik(),getNidn(),getFullName()));
    }
}
