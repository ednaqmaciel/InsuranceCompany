<p>	
# TÍTULO DO PROJETO: Insurance Company<br/>
#  A QUEM SE DESTINA/OBJETIVO :Esse projeto faz parte da etapa de seleção da Able Tech.Se você esta vendo isso certamente é um avaliador. <br/>
# O objetivo do projeto é tratar dados de um seguradora (veículos e partes dos veículos) de modo que esse tratamento seja adicionar listar, ler e ordenar os dados da empresa. <br/>
# PRÉ REQUISITO: Instale o eclipse ou outra IDE de sua preferência em seu computador<br/>
# INSTALAÇÃO: Baixe o arquivo do seguinte repositório: https://github.com/ednaqmaciel/InsuranceCompany <br/>
#Clone o projeto para seu repositório ou baixe o arquivo zip na sua máquina, descompacte, abra o eclipse, importe para o workspace o projeto, vá até a classe inicializadora : InsuranceCompanyApplication <br/>
#Clique no botão run da ide. Em seguida aguarde a aplicação rodar e verifique no console se rodou corretamente na porta 8080, caso isso tenha ocorrido aparecerá um OK, no fim das linhas. <br/>
#Caso você tenha notado algum erro, por gentileza, contate o administrador do sistema em ednaqmaciel@gmail.com , informando o ocorrido, solicitando um code review <br/>
#INICIE OS TESTES COM AS URLS <br/>
#Para adicionar veículo, digite no browser: localhost:8080/vehicle/addTest <br/>
# Deverá aparecer na página a frase: “Gravado com sucesso”<br/>
# Para listar veículo, digite no browser: localhost:8080/vehicle/getList <br/>
# Deverá aparecer na página a sequência de um veículo com suas partes <br/>
# Para ler veículo, digite no browser: localhost:8080/vehicle/readFileTest <br/>
#Deverá aparecer na página a frase: “Veículos lidos” <br/>
# Para listar partes, digite no browser: localhost:8080/part/getList<br/>
#CONSTRUIDO COM: Java com SpringBoot Framework, SprIng MVC, Spring Data, JPA, arquitetura Rest<br/>
#BANCO DE DADOS: h2. <br/>
# ESTRUTURA DO PROJETO:
  <br/>
#O projeto foi dividido em três pacotes (parts, vehicles e web)<br/>
# No pacote Web, Uma classe Controller para cada entidade (Part e Vehicle), responsável por ser o controlador e receber as chamadas (http) web e  também no mesmo pacote contendo a classe inicializadora da Aplicação <br/>
#Uma classe Service para a entidade (Part e outra para Vehicle) responsável pelas regras de negócios e validações<br/>
# Uma classe Repository para cada entidade, citada acima, que é responsável pelas chamadas de banco de dados<br/>
# O spring java config, configura o IOC diretamente das classes por meio de metadados  referenciados pelas [@notations]<br/>
# Foi desenvolvido um backend para tratar os veículos com as respectivas partes, valores e danos.<br/>
# Todas as dependências do spring ficam no arquivo .pom<br/>
# Para facilitar os testes foram feitos os seguintes métodos: addTest e readFileTest para simular a inserção de veículos e conferir o resultado com o GetList.
# Autora: Edna Maciel<br/>
#<br/>
</p>
