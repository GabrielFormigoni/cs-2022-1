### Padrões de Codificação

De uma maneira geral, entende-se que os padrões de codificação, são uma forma de agrupar e descrever algumas práticas de codificação, com o objetivo de manter as implementações inteligíveis, consistentes e com qualidade. O seu uso é considerado como uma boa prática no desenvolvimento de software, e por isso a aprendizagem desses padrões é amplamente recomendada.

Sua utilização, além de aumentar a produtividade do projeto, ainda auxilia nos processos de desenvolvimento, retirada de bugs, atividades de validação, manutenção, etc. Inclusive, existe uma grande variedade de padrões, sendo que cada organização escolhe qual vai utilizar, ou em alguns casos até cria seu próprio padrão.

Alguns exemplos de padrões bastante utilizados são em relação aos comentários, identação, espaços em branco, quebra de linha, organização de classes e nomenclaturas. Um exemplo interessante é na questão da quebra de linha, em que a linha deve ter no máximo oitenta caracteres, ocorrendo a sua quebra, caso esse número seja ultrapassado. As linhas seguintes devem ser indentadas e quebradas da mesma maneira. Outro caso importante está na nomenclatura, em que, por exemplo, em javascript, utilizamos o padrão lowerCamelCase, em que as variáveis devem começar com letra minúscula e para cada palavra que suceder, a primeira letra deve ser maiúscula, assim como no exemplo abaixo:
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


### Programação defensiva

Entende-se como programação defensiva, uma série de técnicas e práticas que tem como objetivo alcançar a estabilidade e a segurança do código, levando em conta as imprevisibilidades que venham a acontecer. Essas técnicas começarama a aparecer quando se observou que erros em sistemas podem gerar problemas de grande magnitude, e com o objetivo de reduzir a possibilidades de que tais situações se repitam.

Uma das principais regras é a de nunca se confiar nos dados do usuário. Nesse sentido, tem-se que, para que o código possa ser utilizado, tem que se levar em conta certos métodos e classes que são públicos, destinados a se comunicarem com o mundo externo, e outros que só precisam ser utilizados internamente. Todos esses métodos e classes públicos são as portas de entrada para seu código, e estão lidando com território desconhecido, e uma maneira de se proteger é validar os dados de origem externa, o que cria um tipo de barreira, tendo em vista que os dados repassados as classes internas serão confiáveis.

Exemplo: 

~~~
public class Usuario {

  public void CriarUsuario(string nome, string phone, string cpf) {
    if (!ValidatePhone(phone))
      throw new ArgumentException("Telefone inválido!");
      
    if (!ValidateCpf(cpf))
      throw new ArgumentException("Cpf inválido!");
      
    // ...
  }
}
~~~

O método ValidatePhone retorna false caso caso o telefone tenha formato diferente de "(##)####-####" e o método ValidateCpf retorna false caso o CPF tenha um formato válido "###.###.###-##". Esse caso, apesar de ser bem simples, ajuda a entender na prática o que é a programação defensiva, e caso essa validação não ocorresse nesse momento, teria que acontecer posteriormente.
