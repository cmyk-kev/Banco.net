public class App {
    public static void main(String[] args) throws Exception {
        Cliente kevin = new Cliente();
        kevin.setNome("Kevin");

        Conta cc = new ContaCorrente(kevin);
       
        Conta poupanca = new ContaPoupanca(kevin);

        cc.depositar(100);
        poupanca.depositar(50);
        cc.transferir(100,poupanca);


        cc.imprimirExtrato(); 
        poupanca.imprimirExtrato(); 
    }
}
