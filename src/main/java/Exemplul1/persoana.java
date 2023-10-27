package Exemplul1;

public class persoana {
    private String nume;
    private int varsta;
    public String getNume() {
        return nume;
    }
    public int getVarsta() {
        return varsta;
    }
    public persoana() {}
    public persoana(String nume, int varsta) {
        super();
        this.nume = nume;
        this.varsta = varsta;
    }
    @Override
    public String toString() {
        return nume + ", " + varsta;
    }
}
