**Acomplamento e o tal do DIP**



Tenha classes que são muito coesas e pouco acopladas.



A partir do momento em que uma classe possui muitas dependências, todas elas podem propagar problemas para a classe principal, o que a torna frágil e propensa a erros.



É impossível evitar totalmente acoplamentos, mas **podemos escolher fazer acoplamentos de menor criticidade**, ou seja, acoplar com classes mais estáveis, que nunca, ou quase nunca, mudarão.



Acoplar com interfaces ao invés de classes de implementação é uma forma de obter estabilidade no acoplamento, pois a interface é apenas um contrato, não possui código que forçaria uma mudança.



\-> Programação orientada a interfaces!



**Princípio da Inversão de Dependências (DIP)**

Sempre que uma classe for depender de outra, ela deve depender de outro módulo mais estável do que ela mesma. Se A depende de B, B deve ser mais estável do que A.



Lembre-se que abstrações tendem a ser estáveis, e implementações, instáveis. Se você está programando alguma classe com regras de negócio e precisa depender de um módulo, idealmente este módulo deve ser uma abstração. Agora, se você está programando uma abstração e precisa depender de outro módulo, este módulo também deve ser uma abstração. 



\-> Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.



No Princípio de Inversão de Dependências, as classes dependem de abstrações.



Pense também em agrupar dependências, procure trechos de código onde mais de uma dependência é usada num contexto específico, e separe em uma dependência(classe) única, diminuindo a quantidade de dependências na classe original. Geralmente, agrupamos naturalmente as dependências que trabalham juntas em métodos privados.



\-> Acoplamento lógico: acoplamento que não é identificado na estrutura do código, mas acontece devido ao funcionamento de frameworks ou organização de arquitetura.















