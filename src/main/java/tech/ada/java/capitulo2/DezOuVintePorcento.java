package tech.ada.java.capitulo2;

public class DezOuVintePorcento implements RegraDeCalculoRefactor {
    @Override
    public double calcula(Funcionario f) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }

        return funcionario.getSalarioBase() * 0.9;
    }
}
