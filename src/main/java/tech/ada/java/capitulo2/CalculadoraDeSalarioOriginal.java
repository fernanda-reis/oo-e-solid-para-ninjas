package tech.ada.java.capitulo2;

//aplicar um desconto ao salario do funcionario, de acordo com seu cargo e salario

public class CalculadoraDeSalarioOriginal {
    public double calcula(Funcionario funcionario) {
        if(DESENVOLVEDOR.equals(funcionario.getCargo())){
            return dezOuVintePorcento(funcionario);
        }

        if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            return quinzeOuVinteCincoPorcento(funcionario);
        }

        throw new RuntimeException("Funcionário Inválido");
    }

    private double dezOuVintePorcento(Funcionario funcionario){
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }

        else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }
}

//a classe tem grande potencial de crescimento caso sejam adicionados novos cargos ou novas regras de desconto, portanto, essa estrutura de classe não é coesa.
//Para trazer coesão a classe, podemos abstrair os métodos de calculo para uma interface, por terem a mesma assinatura, e apenas implementações diferentes, isolando as regras de calculo. (RegraDeCalculoRefactor)
//Desenvolvedor, DBA e Tester são enums. Sempre que um novo cargo surgir, seria necessário alterar a classe adicionando a possibilidade deste novo cargo. Porém, essa necessidade precisa estar clara. Para isso, pode-se adicionar, no construtor do enum, a necessidade de indicar uma regra de calculo relacionada. (CargoRefactor)