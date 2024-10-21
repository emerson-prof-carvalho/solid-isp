# Interface Segregation Principle (ISP)

### Projeto refatorado de https://github.com/emerson-prof-carvalho/solid-isp-violation.

#### Solução
- Agora, há quatro interfaces separadas: `Faxable` para fax, `Printable` para impressão, `Scannable` para digitalização, e `Xerocable` para xerox;
- A classe `StandardPrinter` implementa apenas a interface `Printable`, enquanto a classe `Fax` implementa somente a interface 'Faxable'. Isso evita a necessidade de implementarem métodos para funcionalidades que não suportam;
- A classe `Scanner` implementa as interfaces `Scannable` e `Xerocable`, somente as funcionalidades que suporta;
- A classe `MultiFunctionPrinter` implementa todas as quatro interfaces, pois ela oferece todas as funcionalidades.
