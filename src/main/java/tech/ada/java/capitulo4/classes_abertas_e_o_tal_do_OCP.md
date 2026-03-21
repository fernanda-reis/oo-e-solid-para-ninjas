### **Classes abertas e o tal do OCP**

Até então, entendemos que classes coesas possuem responsabilidades divididas em pequenas classes, e que classes devem tentar ao máximo se acoplar com classes estáveis, que mudam pouco.
Ao pensar em sistemas que evoluam facilmente, devemos ter em mente que o código deve estar sempre pronto para evoluir.

Escrever classes abertas para extensão e fechadas para alterações ajuda nesta evolução.
Uma das formas de fazer isso, é recebendo classes de abstração no construtor de uma classe (injeção de dependência), pois isso garante flexibilidade de utilização, ao invés de instanciar classes concretas diretamente dentro da classe, o que engessaria a dependência.

Tendo suas dependências explícitas no construtor, a classe pode ser definida como uma classe "aberta". Dessa maneira, podemos mudar as implementações concretas que são passadas para ela a qualquer momento, e isso faz com que o resultado de sua execução mude de acordo com o que foi passado para ela. Ou seja, conseguimos mudar o comportamento da classe sem mudar o código.

Quando se tem uma boa abstração, é fácil evoluir o sistema. Por isso, pensar no projeto de classes é fundamental e garante facilidade de manutenção.

Classes que dependem de abstrações são mais fáceis de testar, pois em testes de unidade podemos simular (mockar) essa dependências e seu comportamento.
