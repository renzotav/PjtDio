O projeto utiliza o padrão de projeto Factory para realizar a criação dos personagens de forma centralizada.

A aplicação possui uma classe PersonagemFactory, responsável por receber o tipo de personagem informado pelo usuário e decidir qual objeto deve ser criado. Dessa forma, quando o usuário informa que deseja um Mago, Guerreiro ou Arqueiro, a Factory identifica o tipo e cria a instância correspondente.

A utilização desse padrão evita que outras partes da aplicação, como o Controller ou o Service, precisem conhecer diretamente o processo de criação de cada personagem. Assim, a responsabilidade de criação fica concentrada na Factory.

O padrão foi escolhido por ser adequado ao cenário do projeto, já que existem diferentes tipos de personagens que possuem uma mesma classe base (Personagem), mas precisam ser instanciados de maneiras diferentes.

Com essa abordagem, caso novos tipos de personagens sejam adicionados futuramente, a lógica de criação pode ser concentrada na Factory, mantendo as demais partes da aplicação mais organizadas e desacopladas.
