package application;

import entities.Client;

public class Program {
		public static void main(String[] args) {
				Client clientOne = new Client("Maria", "maria@example.com");
				Client clientTwo = new Client("Maria", "maria@example.com");

				System.out.println(clientOne.hashCode());
				System.out.println(clientTwo.hashCode());
				System.out.println(clientOne.equals(clientTwo));
		}
}
