NOTAÇÃO DE GRAFO DE FLUXO:
![User_notacao_grafo_de_fluxo](https://github.com/user-attachments/assets/00035ec1-2c86-4b4c-bd3e-c17cf25f72c0)
<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="2256pt" height="155pt" viewBox="0.00 0.00 2256.00 155.00">
<g id="graph0" class="graph" transform="scale(1 1) rotate(0) translate(4 151.42)">

COMPLEXIDADE CICLOMATICA:

CC(conectarBD) = 1 (fluxo base) + 1 (try-catch) = 2


CC(verificarUsuario) = 1 (fluxo base) + 1 (try-catch) + 1 (if) = 3


CC(conectarBD) = 2, CC(verificarUsuario) = 3

CC(conectarBD) + CC(verificarUsuario) = 5

CAMINHOS BÁSICOS:

caminhos de conectarBD:

C1 = Se a execução é normal: o driver é carregado e a conexão é obtida com sucesso = retorna conn

C2 = Se ocorre exceção = leva pro catch e retorna null

caminhos de verificarUsuario:

C3 = Se a execução é normal (com nenhuma exceção): verifica rs.next() = é falso = result fica false = retorna false

C4 = Se a execução é normal (com nenhuma exceção): verifica rs.next() = é verdadeiro = result fica true = retorn true

C5 = Se exceção ocorre (dentro do try): levado para catch = result fica false = retorna false

Em total:

C1+C2+C3+C4+C5 = 5

Tem 5 caminhos básicos totais.

PLANILHA:
[PLANO DE TESTE(4).xlsx](https://github.com/user-attachments/files/23531826/PLANO.DE.TESTE.4.xlsx)

