## **O encapsulamento e a propagação de mudanças**

Uma classe (ou método) bem encapsulado é aquele que esconde bem a maneira como faz as coisas. A classe deve apenas deixar claro o que ela faz e quais operações ela provê para as classes que farão uso dela.

Se a implementação está bem escondida dentro de sua classe responsável, isso nos traz dois ganhos:
1. Facilidade para alterar implementação. Podemos, por exemplo, jogar todo o código dentro do método fora e escrever um novo. O resto do sistema nem perceberá a mudança.
2. Se o código não está bem encapsulado, isso implica em termos a regra de negócio espalhada por lugares diferentes. Isso quer dizer que sempre que a regra de negócio mudar, essa mudança deverá ser realizada em locais diferentes que precisarão ser encontrados.

**-> Intimidade inapropriada:** Quando uma classe sabe mais do que deveria saber sobre o comportamento de outra classe.

**-> Tell, don't ask**

Uma forma comum de escrever código é primeiramente fazer uma pergunta (ou seja, implementar um if), e de acordo com a resposta, executar um código ou outro.

Ex:
```
NotaFiscal nf = new NotaFiscal();
double valor;
if (nf.getValorSemImposto() > 10000) {
    valor = 0.06 * nf.getValor();
} else {
    valor = 0.12 * nf.getValor();
}
```

Quando temos códigos que perguntam uma coisa para um objeto para então tomar uma decisão, é um código que não está seguindo o princípio de OO "Tell, don't ask". A ideia é que devemos sempre dizer ao objeto o que ele tem que fazer, e não primeiro perguntar algo para depois decidir. Códigos que perguntam para depois decidir tendem a seguir um padrão procedural.

Ex ajustado:
```
NotaFiscal nf = new NotaFiscal();
double valor = nf.calculaValorImposto();
```

**->** Para entender se um código está bem encapsulado, podemos verificar, ao utilizar um método:
-O que esse método faz? Deve ser possível inferir seu objetivo pelo nome do método.
-Como ele faz? Não deve ser possível saber como é sua implementação, pois está encapsulada dentro dele.


**-> Lei de Demeter**

É bastante comum encontrarmos código que necessita acessar dados através de uma cadeia de invocações, por exemplo, fatura.getCliente().marcaComoInadimplente(); Esse tipo de código pode estar quebrando o encapsulamento da classe.

Caso a classe Cliente sofra uma alteração e perca o método marcaComoInadimplente, todo lugar que chama o cliente diretamente ou que o chama através da fatura vai quebrar, ou seja, terão muitos lugares que terão de ser refatorados. Isso é um acoplamento difícil de ser notado.

Uma possível solução é encapsular melhor a classe Fatura. As classes consumidoras de Fatura não precisam saber que ela possui cliente dentro, por exemplo, implementando diretamente fatura.marcaComoInadimplente(). A própria fatura acessará seu cliente. Assim, seu houver mudança na classe cliente, será necessário corrigir apenas a classe Fatura.



