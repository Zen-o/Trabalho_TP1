package entities;

import java.util.Random;

public class Laboratorio {

	Random gerador = new Random();
	
	
	
	public boolean Exame(int flag) {

		int num = gerador.nextInt(100);
	
		if(flag == 1) {
			
			if(num >= 30) {
				return false;
			}else
				return true;
		}
		if(flag == 2) {
			if(num >= 40) {
				return false;
			}else
				return true;
		}
		if(flag == 3) {
			if(num >= 70) {
				return false;
			}else
				return true;
		}
		if(flag == 4) {
			if(num == 100) {
				return false;
			}else
				return true;
		}
		return false;
	}
}
