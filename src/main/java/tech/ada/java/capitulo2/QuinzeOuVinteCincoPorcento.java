package tech.ada.java.capitulo2;

public class QuinzeOuVinteCincoPorcento implements RegraDeCalculoRefactor {
    @Override
    public double calcula(Funcionario f) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
