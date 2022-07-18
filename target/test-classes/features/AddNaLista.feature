#language: pt
#Autor: Nathan Dariiva

Funcionalidade: Registrar itens a fazer
	Como usuario
	eu quero cadastrar na lista
	para verificar meus itens a fazer
	
Cenario: Adicionar itens a lista
 Dado que acesso a aplicação
 E preencho o campo com "<itens>"
 Quando aciono o botão enter
 Entao o "<itens>" é exibido na listagem
 
 Exemplos:
 |itens|
 |ir ao mercado|
 |criar crud do sistema|
 |estudar testes automatizados|
 |comprar cerveja|
