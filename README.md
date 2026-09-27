Exercício — Sistema de Gestão Acadêmica em Java

Desenvolva, em Java, um sistema orientado a objetos para realizar o gerenciamento básico de uma universidade.

O sistema deverá permitir o cadastro de pessoas, cursos, disciplinas e professores, além de possibilitar a realização de algumas operações acadêmicas.

O objetivo do exercício é aplicar os conceitos de classes, objetos, encapsulamento, herança, classes abstratas, interfaces, agregação e composição.
1. Classe abstrata Pessoa

Crie uma classe abstrata chamada Pessoa, contendo:

    nome
    cpf
    email

Os atributos devem ser privados, utilizando encapsulamento por meio de métodos get e set.

A classe deverá possuir:

    construtor;
    métodos getters e setters;
    método abstrato exibirDados().

2. Herança

Crie duas classes que herdem de Pessoa:

    Aluno
    Professor

Aluno

A classe Aluno deverá possuir, além dos atributos herdados:

    matricula
    curso

O método exibirDados() deverá apresentar as informações do aluno.
Professor

A classe Professor deverá possuir:

    registro
    areaAtuacao

O método exibirDados() deverá apresentar as informações do professor.
3. Interface

Crie uma interface chamada Autenticavel, contendo o método:

boolean autenticar(String senha);

As classes Aluno e Professor deverão implementar essa interface.

Cada uma deverá possuir uma senha e implementar o método autenticar() de acordo com sua própria regra.
4. Classe Disciplina

Crie uma classe Disciplina contendo:

    codigo
    nome
    cargaHoraria

Uma disciplina também deverá possuir um professor responsável.

Um professor pode ser responsável por várias disciplinas.

Considere essa relação como uma agregação, pois a disciplina pode existir independentemente do professor.
5. Classe Curso

Crie uma classe Curso contendo:

    codigo
    nome
    uma lista de disciplinas.

O curso deverá ser responsável por criar e manter suas disciplinas.

Considere essa relação como uma composição: as disciplinas pertencentes ao curso fazem parte da estrutura do curso.

Implemente métodos para:

    adicionar uma disciplina;
    remover uma disciplina;
    listar as disciplinas do curso.

6. Matrícula

Um aluno poderá estar matriculado em várias disciplinas.

Implemente uma solução que permita:

    matricular um aluno em uma disciplina;
    cancelar uma matrícula;
    listar as disciplinas nas quais o aluno está matriculado.

Um aluno e uma disciplina devem continuar existindo independentemente da matrícula. Portanto, essa relação deve representar uma agregação/associação entre objetos, e não uma composição.
7. Classe principal

Crie uma classe Main para demonstrar o funcionamento do sistema.

No método main(), o programa deverá:

    Criar pelo menos 2 professores.
    Criar pelo menos 3 disciplinas.
    Criar pelo menos 1 curso.
    Associar os professores às disciplinas.
    Adicionar as disciplinas ao curso.
    Criar pelo menos 3 alunos.
    Matricular os alunos em diferentes disciplinas.
    Exibir os dados dos alunos e professores.
    Listar as disciplinas de um curso.
    Listar as disciplinas em que determinado aluno está matriculado.
    Testar o método autenticar() de um aluno e de um professor.

Requisitos obrigatórios

O código desenvolvido deverá obrigatoriamente demonstrar:
Conceito 	Onde deverá aparecer
Classes e objetos 	Em todas as classes do sistema
Encapsulamento 	Atributos privados + getters/setters
Classe abstrata 	Pessoa
Herança 	Aluno e Professor
Interface 	Autenticavel
Implementação de interface 	Aluno e Professor
Agregação 	Professor ↔ Disciplina
Composição 	Curso ↔ Disciplina
Associação 	Aluno ↔ Disciplina
Polimorfismo 	Uso de referências do tipo Pessoa para objetos Aluno e Professor
Desafio adicional

Para aumentar a complexidade, implemente uma classe Universidade responsável por manter uma lista de:

    alunos;
    professores;
    cursos.

Crie métodos para:

    cadastrar aluno;
    cadastrar professor;
    cadastrar curso;
    listar todos os alunos;
    listar todos os professores;
    listar todos os cursos.

Na classe Main, demonstre também o polimorfismo utilizando uma lista de objetos do tipo Pessoa contendo objetos Aluno e Professor.

Exemplo:

List<Pessoa> pessoas = new ArrayList<>();

pessoas.add(aluno1);
pessoas.add(aluno2);
pessoas.add(professor1);

for (Pessoa pessoa : pessoas) {
    pessoa.exibirDados();
}

Entrega

O projeto deverá ser entregue contendo:

    todas as classes implementadas;
    interface;
    classe Main;
    código organizado em pacotes;
    demonstração das funcionalidades solicitadas.

O código deverá ser executável e não serão considerados suficientes exemplos que apenas criem as classes sem demonstrar seu funcionamento na classe Main.
