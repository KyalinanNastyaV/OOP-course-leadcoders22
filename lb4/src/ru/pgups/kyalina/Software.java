package ru.pgups.kyalina;

public abstract class Software {

    protected String interfase;
    protected String assemblers;
    protected String compilers;

    public Software(String interfase, String assemblers, String compilers) {
        this.interfase = interfase;
        this.assemblers = assemblers;
        this.compilers = compilers;
    }

    public void display() {
        System.out.println(this.interfase +" " + this.assemblers);
        System.out.println("Compilers:" + this.compilers);
    }
}
