### Padrões de Codificação

De uma maneira geral, entende-se que os padrões de codificação, são uma forma de agrupar e descrever algumas práticas de codificação, com o objetivo de manter as implementações inteligíveis, consistentes e com qualidade. O seu uso é considerado como uma boa prática no desenvolvimento de software, e por isso a aprendizagem desses padrões é amplamente recomendada.

Sua utilização, além de aumentar a produtividade do projeto, ainda auxilia nos processos de desenvolvimento, retirada de bugs, atividades de validação, manutenção, etc. Inclusive, existe uma grande variedade de padrões, sendo que cada organização escolhe qual vai utilizar, ou em alguns casos até cria seu próprio padrão.

Alguns exemplos de padrões bastante utilizados são em relação aos comentários, identação, espaços em branco, quebra de linha, organização de classes e nomenclaturas. No caso da nomenclatura, por exemplo, em javascript, utilizamos o padrão lowerCamelCase, em que as variáveis devem começar com letra minúscula e para cada palavra, a primeira letra deve ser maiúscula. Exemplo:
* let nome;
* let nomeFuncionario;
* let i = 0;

### Reflexão

Dentro do contexto estudado em ciência da computação , a programação reflexiva ou reflexão é a capacidade de um processo de examinar, introspectar e modificar sua própria estrutura e comportamento. É amplamente utilizado no auxílio para a criação de bibliotecas de software genéricas para exibir dados, processar diferentes formatos de dados, realizar serialização e desserialização de dados para comunicação, ou agrupar e desmembrar dados para contêineres e rajadas de comunicação. Como ele permite que ocorra inspeção de classes, métodos, propriedades e tipos de dentro do seu sistema, é muito utilizado no âmbito do paradigma orientado a objetos, permitindo a modificação do código base em tempo de execução.

Um exemplo prático de sua utilização é na realização de testes. Como em uma classe os métodos classificados como private ou protected geralmente não são testáveis, a utilização da reflexão torna esses métodos públicos, permitindo sua testagem. 

Exemplo de utilização utilizando a linguagem Perl: 

~~~

# sem reflexão
 Teste->new->testando;
 
 # com reflexão
 my $class = "Teste";
 my $method = "testando";
 $class->new->$method;

~~~