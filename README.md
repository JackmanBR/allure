# allure
Relatórios de automação de testes com eclipse, selenide, testeng e allure

1 - DEPENDÊNCIAS;

  Sempre lembrar de adicionar todas as depedências no pom.xml, quando do uso do selenide são:
  
  a.selenide;
  <br>
  b.testeng;
  <br>
  c.allure.
  
2 - GERANDO O RELATÓRIO

  Atentar para a utilização a partir do terminal próprio do windows ou do eclipse o seguinte comando:
  
  allure serve <caminho da pasta de relatórios do allure dentro do projeto>
  
3- IMPORTANTE:

Sempre lembrar de dar uma "refresh" na pasta de relatórios do allure após cada teste. O reocmendado é após cada caso de testes, você apagar os arquivos contidos dentro e logo após, rodar os testes e depois dar um "refresh" no projeto, servirá para que ao rodar o comando "allure serve", o allure carregue o relatório do projeto atual.
  


  

  
  
  
