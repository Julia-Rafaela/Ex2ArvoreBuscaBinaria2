package view;

import model.Arvore;

public class main {
	public static void main(String[] args) {
		int[] vetor = {12, 4, 8, 16, 2, 6};
		Arvore arvore = new Arvore();
		for (int i : vetor) {
			arvore.insert(i);
		}
		try {
			arvore.search(6);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
	}
}
