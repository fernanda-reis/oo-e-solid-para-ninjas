package tech.ada.java.capitulo2;

public enum CargoRefactor {

    //declaraçao de enums
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());


    //atributos
    private RegraDeCalculoRefactor regraDeCalculo;

    //construtor
    CargoRefactor(RegraDeCalculoRefactor regra) {
        this.regraDeCalculo = regra;
    }

    //encapsulamento
    public RegraDeCalculoRefactor getRegraDeCalculo() {
        return regraDeCalculo;
    }
}
