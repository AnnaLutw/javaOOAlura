package br.com.bancoFull.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bancoFull.banco.modelo.Cliente;
import br.com.bancoFull.banco.modelo.Conta;
import br.com.bancoFull.banco.modelo.ContaCorrente;
import br.com.bancoFull.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	 public static void main(String[] args) {

		  Conta cc1 = new ContaCorrente(22, 33);
          Cliente clienteCC1 = new Cliente();
          clienteCC1.setNome("Nico");
          cc1.setTitular(clienteCC1);
          cc1.deposita(333.0);

          Conta cc2 = new ContaPoupanca(22, 44);
          Cliente clienteCC2 = new Cliente();
          clienteCC2.setNome("Guilherme");
          cc2.setTitular(clienteCC2);
          cc2.deposita(444.0);

          Conta cc3 = new ContaCorrente(22, 11);
          Cliente clienteCC3 = new Cliente();
          clienteCC3.setNome("Paulo");
          cc3.setTitular(clienteCC3);
          cc3.deposita(550.0);

          Conta cc4 = new ContaPoupanca(22, 22);
          Cliente clienteCC4 = new Cliente();
          clienteCC4.setNome("Ana");
          cc4.setTitular(clienteCC4);
          cc4.deposita(222.0);


         List<Conta> lista = new ArrayList<>();
         lista.add(cc1);
         lista.add(cc2);
         lista.add(cc3);
         lista.add(cc4);
         
         for (Conta conta : lista) {
			System.out.println(conta + " Titular: " + conta.getTitular().getNome()+ " Saldo: " + conta.getSaldo());
		}
        // TitularConta comparator = new TitularConta();
        //lista.sort(new TitularConta());      
        // Collections.sort(lista, new NumeroConta());
         Collections.sort(lista);
         lista.sort(null);
         
         System.out.println("\n");
         
         for (Conta conta : lista) {
 			System.out.println(conta + " Titular: " + conta.getTitular().getNome() + " Saldo: " + conta.getSaldo());
 		}
	 }

}
class TitularConta implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();				
		return nomeC1.compareTo(nomeC2);
	}		
}

class NumeroConta implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero()	;
		
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
	}
	
	
	 
	
}
