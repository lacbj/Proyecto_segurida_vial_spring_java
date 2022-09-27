package  seguridad;



public class Main {

	public static void  main(String[] args) {
		//Declaracion de las listas a usar
		
				Auto [] autos;
				Conductor [] conductores;
				Moto [] motos;
				
				

		  // Generar las istancias de los odjetos necesarios y de los Array						
												
				Auto auto1 = new Auto( 5000,  "Corsa", " azul",  13, 160, true );//Inseguro
				Auto auto2 = new Auto( 6000, "Palio", "verde",  3, 120, true);//seguro
				Auto auto3 = new Auto( 7000, "Obstra", "gris", 26, 90,true );//seguro
				
				autos = new Auto[3];
				
				autos[0] = auto1;
	         	autos[1] = auto2;
				autos[2] = auto3;
				
				System.out.println("la cantidad de autoss en la lista es de : " + autos.length);
				

				
				
				Moto moto1 = new Moto(888888, "honda", "azul", 2, 120 , 2);//segura
				Moto moto2 = new Moto(999999, "yamaha", "azul", 2, 180, 1);//Insegura
				
				
				motos = new Moto[2];
				
				motos [0] = moto1;
				motos [1] = moto2;
				
				
				System.out.println("la cantidad de Motos en la lista es de : " + motos.length);
				

				Conductor conductor1 = new Conductor( "pedro",111111,"honda", true, moto1);
				Conductor conductor2 = new Conductor( "jose", 222222, "Corsa", false, auto1);
				Conductor conductor3 = new Conductor( "pedro",333333,"yamaha", true, moto2);
				Conductor conductor4 = new Conductor( "jose", 444444, "Obstra", false, auto3);
				Conductor conductor5 = new Conductor( "pedro",555555,"Palio", true, auto2);
				
				conductores = new Conductor[5];
				
				conductores[0] = conductor1;
				conductores[1] = conductor2;
				conductores[2] = conductor3;
				conductores[3] = conductor4;
				conductores[4] = conductor5;
				
				
				System.out.println(" estos son los conducores : " + conductores.length);
				
			//RECORRER LOS ARRAY EN BUSCA DE VALORES Y VALIDACIONES
				for ( Auto auto : autos) {
					int velocidadAuto = auto.getVelocidad();
					boolean ruedaAux = auto.isRueda_de_auxilio();
					
					
				if ( velocidadAuto <= 140 && ruedaAux  == true)  {
						System.out.println("El auto " + auto.getModelo()+" es seguro");
						String modeloAutoSeguro= auto.getModelo();
				
				for ( Moto Moto : motos) {
					int velocidadMoto = Moto.getVelocidad();
					int espejoRetrovisor = Moto.getRetrovisores();
					
					
					if ( velocidadMoto <= 160 && espejoRetrovisor >= 2)  {
						System.out.println("La Moto " + Moto.getModelo()+" es segura ");						
						String modeloMotoSeguro= Moto.getModelo();
						
						for ( Conductor conductor : conductores) {
							
					       boolean Registro      =   conductor.isRegistro();
					       String conductorSeguro  =   conductor.getAutomovil();
					       
					       if ( Registro == true && modeloAutoSeguro == conductorSeguro)  {
					    	   //boolean conductor = true;
								System.out.println("el conductor de DNI " + conductor.getDNI()+" es seguro y conduce el Auto "+ modeloAutoSeguro); 
								}
					       					     			       
					    }					
				    }
				
			    }
			}
		}
			
		
}
}


//RECORRER LOS ARRAY EN BUSCA DE VALORES Y VALIDACIONES
	/*for ( Auto auto : autos) {
		int velocidadAuto = auto.getVelocidad();
		boolean ruedaAux = auto.isRueda_de_auxilio();
		
		
		if ( velocidadAuto >= 140 || ruedaAux  == false)  {
			System.out.println("El auto " + auto.getModelo()+" es inseguro de patente: "+auto.getPatente());
			boolean registro = false;
		}else {
			System.out.println("El auto " + auto.getModelo()+" es SEGURO de patente: "+auto.getPatente());
			boolean registro = true;									  			
						     	      		
		  }					
	  }
	for ( Moto Moto : motos) {
		int velocidadAuto = Moto.getVelocidad();
		int espejoRetrovisor = Moto.getRetrovisores();
		
		
		if ( velocidadAuto >= 160 || espejoRetrovisor < 2)  {
			System.out.println("La Moto " + Moto.getModelo()+" es insegura de patente: "+ Moto.getPatente());
			boolean registro = false;
		}else {
			System.out.println("La Moto " + Moto.getModelo()+" es  SEGURA  de patente: "+ Moto.getPatente());
			boolean registro = true; 		
		  }					
	  }*/
	


