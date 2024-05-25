# Desafio-poo
Repositório criado para fazer a criação de uma UML e arquivos .java para a criação base  do primeiro iphone

### Diagrama UML (Mermaid)
```Mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        -ReprodutorMusical reprodutor
        -AparelhoTelefonico telefone
        -NavegadorInternet navegador
        +reproduzirMusica()
        +pausarMusica()
        +selecionarMusica(String musica)
        +fazerLigacao(String numero)
        +atenderChamada()
        +iniciarCorreioVoz()
        +exibirPaginaWeb(String url)
        +adicionarNovaAba()
        +atualizarPagina() +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
