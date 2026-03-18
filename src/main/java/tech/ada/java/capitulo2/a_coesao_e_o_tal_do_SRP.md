**Coesão** --> uma classe coesa é aquela que possui uma única responsabilidade.
- Por exemplo, se a classe é responsável por representar uma nota fiscal, ela representa apenas isso. Responsabilidades de uma fatura estarão em outra classe.
- São mais simples de serem mantidas, possuem menos código e maior reusabilidade.
- Toda classe que não é coesa não para de crescer nunca.

Em sistemas mal projetados, pontos que necessitam alterações estão implícitos, sendo necessário buscar manualmente com CTRL + F. Essa necessidade deve ser reduzida ao máximo possível, de forma que as alterações necessárias fiquem explícitas.

**MVC (Model-View-Controller)** --> Padrão arquitetural, que divide a aplicação em três partes, ajudando a separar responsabilidades e criando código limpo e reusável:
- modelo, onde estão as classes e entidades responsáveis pelas regras de negócios da aplicação (classes Java),
- visualização, responsável pela interface comn o usuário (JSP, HTML, CSS),
- controlador, ligação entre a camada de visualização e modelo

Métodos privados servem de apoio a métodos públicos, ajudando a facilitar a sua legibilidade ao abstrair as operações mais complexas. Não use método privado quando o trecho de código representa uma responsabilidade além da classe.

Um exemplo de falta de coesão são longos códigos em classes de controller que fazem tudo (validação, aplicação de regra, persistência, envio de notificação...). Fuja de controladores gordos! É necessário separar cada responsabilidade em uma classe. O controlador deve servir apenas como um coordenador do processo.

**Recomendação de livro** --> Design Patterns com Java: Projeto orientado a objetos guiado por padrões.

**SRP (Single Responsability Principle)** --> Principio SOLID relacionado a coesão. "Uma classe deve ter apenas uma razão para mudar".

Boa prática: Separação de regras de negócio da parte de infraestrutura (frameworks e libs), nem que seja necessário criar uma camada de adaptação. Qualquer classe que tem contato com infraestrutura não deve ter regras de negócio, pois dificulta refatoração e atualização de sistemas. Príncipio seguido pela *Arquitetura Hexagonal* (ports and adapters). Nesse modelo de arquitetura, separamos portas (classes do dominio/negocio) de adaptadores (classes que fazem ponte entre mundos diferentes, como web e dominio, banco de dados e dominio, etc).
