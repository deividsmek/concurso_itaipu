

import java.util.ArrayList;
import java.util.Scanner;

public class simulador_itaipu {

	
	public static void main (String [] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos PCDs aprovados ?");
		int pcd = entrada.nextInt();
		
		System.out.println("Qual sua posiÃ§Ã£o na ampla?");
		int posicao = entrada.nextInt();
		
		
		
		String resultado = chamada(pcd, posicao);
				
		
	}
	
	public static String chamada (int pcd, int posicao) {
		
			
		ArrayList<Integer> total_chamadas = new ArrayList<>(50);
		int sereichamado;
		
		switch (pcd) {
			
			    case 0:   	
		    	
			    		    			    	
		    	for (int i = 0; i < 50; i ++) {
		    		total_chamadas.add(i + 1);
		    		
		   }		    	
		    	
		    	for (int i = 3; i < total_chamadas.size(); i += 4) {
		    		
		    		total_chamadas.remove(i);		
		    	    i--;		    	    
		    		      		
		    		
		    	}
		    			       		    	 
		     System.out.println("Serei convocado na chamada nÃºmero" + " " + total_chamadas.get(posicao - 1));
		    	 					    				    
			    break;
			    
			case 1:
				
				for (int i = 0; i < 50; i ++) {
		    		total_chamadas.add(i + 1);
		    		
		   }		    	
		    	if (posicao == 1) {
		    		
		    		System.out.println("Serei o primeiro a ser chamado!"); 
		    		break;
		    	}else if (posicao == 2) {
		    		
		    		System.out.println("Serei o terceiro a ser chamado!"); 
                 break;
		    				    		
		    	} 
				
				
		    	for (int i = 7; i < total_chamadas.size(); i += 4) {
		    		
		    		total_chamadas.remove(i);		
		    	    i--;		    	    
		    		 			    		
		     	}
		    			       		    	 
		     System.out.println("Serei convocado na chamada nÃºmero" + " " + total_chamadas.get(posicao + 1));
		    	
			    break;
			    
   			case 2:
   				for (int i = 0; i < 50; i ++) {
		    		total_chamadas.add(i + 1);
		    		
		   }		    	
		    	if (posicao == 1) {
		    		
		    		System.out.println("Serei o primeiro a ser chamado!"); 
		    		break;
		    	}else if (posicao == 2) {
		    		
		    		System.out.println("Serei o terceiro a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 3) {
		    		
		    		System.out.println("Serei o quinto a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 4) {
		    		
		    		System.out.println("Serei o sÃ©timo a ser chamado!"); 
                 break;
		    				    		
		    	} 
				
				
		    	for (int i = 11; i < total_chamadas.size(); i += 4) {
		    		
		    		total_chamadas.remove(i);		
		    	    i--;		    	    
		    		 			    		
		     	}
		    			       		    	 
		     System.out.println("Serei convocado na chamada nÃºmero" + " " + total_chamadas.get(posicao + 3));
		    	
			    break;
			    
			case 3:
				for (int i = 0; i < 50; i ++) {
		    		total_chamadas.add(i + 1);
		    		
		   }		    	
		    	if (posicao == 1) {
		    		
		    		System.out.println("Serei o primeiro a ser chamado!"); 
		    		break;
		    	}else if (posicao == 2) {
		    		
		    		System.out.println("Serei o terceiro a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 3) {
		    		
		    		System.out.println("Serei o quinto a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 4) {
		    		
		    		System.out.println("Serei o sÃ©timo a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 5) {
		    		
		    		System.out.println("Serei o nono a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 6) {
		    		
		    		System.out.println("Serei o dÃ©cimo primeiro a ser chamado!"); 
                 break;
		    				    		
		    	} 
				
				
		    	for (int i = 15; i < total_chamadas.size(); i += 4) {
		    		
		    		total_chamadas.remove(i);		
		    	    i--;		    	    
		    		 			    		
		     	}
		    			       		    	 
		     System.out.println("Serei convocado na chamada nÃºmero" + " " + total_chamadas.get(posicao + 5));
		    	
			    break;
			case 4:
				for (int i = 0; i < 50; i ++) {
		    		total_chamadas.add(i + 1);
		    		
		   }		    	
		    	if (posicao == 1) {
		    		
		    		System.out.println("Serei o primeiro a ser chamado!"); 
		    		break;
		    	}else if (posicao == 2) {
		    		
		    		System.out.println("Serei o terceiro a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 3) {
		    		
		    		System.out.println("Serei o quinto a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 4) {
		    		
		    		System.out.println("Serei o sÃ©timo a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 5) {
		    		
		    		System.out.println("Serei o nono a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 6) {
		    		
		    		System.out.println("Serei o dÃ©cimo primeiro a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 7) {
		    		
		    		System.out.println("Serei o dÃ©cimo terceiro a ser chamado!"); 
                 break;
		    				    		
		    	} else if (posicao == 8) {
		    		
		    		System.out.println("Serei o dÃ©cimo quinto a ser chamado!"); 
                 break;
		    				    		
		    	} 
				
		    	
		    	
				
		    	for (int i = 19; i < total_chamadas.size(); i += 4) {
		    		
		    		total_chamadas.remove(i);		
		    	    i--;		    	    
		    		 			    		
		     	}
		    			       		    	 
		     System.out.println("Serei convocado na chamada nÃºmero" + " " + total_chamadas.get(posicao + 7));
		    	
			    break;
			    
			case 5:
								
				
									
				System.out.println("Serei convocado na chamada nÃºmero" + " " + (posicao * 2 - 1));
			    break;
	}
		
        	return "";
	}
	
	
}