# CaixaBranca



#COMPLEXIDADE CICLOMÁTICA

Caminho 1 - Sucesso: O try funciona e o if (rs.next()) é verdadeiro. Quando o usuário e senha estão corretos.

Caminho 2 - Falha de Login: O try funciona e o if (rs.next()) é falso. Quando o usuário ou senha estão incorretos.

Caminho 3 - Exceção: O try falha e o catch é executado.


Complexidade Ciclomática (V(G)) = 3

Pontos de Decisão = 2  (if e catch)

V(G) = 2 + 1

V(G) = 3

#Sobre o Codigo

O código foi devidamente documentado?
Não. O código tem de documentação adequada, o único comentário presente (//INSTRUÇÃO SQL) não explica a lógica ou o propósito da funcionalidade. 

As variáveis e constantes possuem nomenclatura?
Parcialmente, os nomes dos métodos "conectarBD", "verificarUsuario" e parâmetros (login, senha) são claros. No entanto, o uso de abreviações como st (Statement) e rs (ResultSet), reduz a clareza.

Existem legibilidade e organização no código?
Não. O código apresenta problemas estruturais como abrir e fechar parâmetros com () ao inves de {}.

Todos os NullPointers foram tratados?
Não, o método conectarBD() tenta se conectar ao banco e falha porque o nome do driver ou a URL estão errados no código original.
O método conectarBD() termina e retorna a variável conn. Como a conexão falhou, conn continua valendo vazio ou nada.

As conexões utilizadas foram fechadas?
Não. Os recursos de banco de dados (Connection, Statement e ResultSet) não são fechados em nenhum ponto.

