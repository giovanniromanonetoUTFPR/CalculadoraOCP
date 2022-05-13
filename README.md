# CalculadoraOCP
Calculadora utilizando o Open Close Principle

# Aplicação do OCP
As classes foram feitas pensando no princípio do Open Close, sendo assim, caso seja necessário adicionar uma nova funcionalidade(nova operação) basta criar uma subclasse que herde a classe Operacoes e adicionar a nova operação. Neste caso, será necessário modificar o main que está na classe Calculadora, para que ele apresente a nova opção. Assim o código das operações permanece inalterado mesmo adicionando uma nova funcionalidade.
