package Proyecto;
import javax.swing.JOptionPane;
public class Proyecto {
	public static void main(String[] args) {
		int cPartidos=0;
		int[][] partidos = new int[6][5];
		for (int i=0; i<6; i++) {
			for (int j=0; j<5; j++) {
				partidos[i][j]=-1;
			}
		}
		String arbitros[][] = {{"Damir Skomina","Disponible"},{"Felix Brych","Disponible"},{"Björn Kuipers","Disponible"}};
		String[] equipo = {"Real Madrid","Liverpool","Man. City","Bayern Múnich","PSG","Chelsea"};
		String[][] jugadores = {
				{"Courtois", "Carvajal", "E. Militao", "Alaba", "Mendy", "Kroos", "Modric", "Camavinga", "Valverde", "Vinicius", "Benzema", "Lunin", "Rudiger", "Tchouameni", "Rodrygo", "Asensio", "Lucas V."},
				{"Alisson", "Konaté", "Van Dijk", "Alexander-Arnold", "Robertson", "Fabinho", "Henderson", "Thiago", "L. Díaz", "Salah", "Firmino", "Kelleher", "J. Matip", "J. Gomez", "Milner", "D. Jota", "D. Nuñez"},
				{"Ederson", "Rubén Dias", "Stones", "J. Cancelo", "S. Gomez", "Gündogan", "De Bruyne", "Bernardo Silva", "Foden", "Haaland", "Mahrez", "Ortega", "Akanji", "Laporte", "Rodri", "Grealish", "J. Álvarez"},
				{"Never", "L. Hernández", "Davies", "De Ligt", "Pavard", "Kimmich", "Goretzka", "Musiala", "Sané", "Mané", "Coman", "Ulreich", "Upamecano", "Mazraoui", "Sabitzer", "Müller", "Gnabry"},
				{"Donnarumma", "Marquinhos", "S. Ramos", "Hakimi", "Mendes", "Veratti", "Fabián Ruiz", "Soler", "Neymar", "Messi", "Mbappé", "K. Navas", "Bernat", "Kimpembe", "Vitinha", "R. Sanches", "Ekitiké"},
				{"Mendy", "Fofana", "Koulibaly", "Chalobah", "Cucurella", "Jorginho", "Kanté", "Kovacic", "Sterling", "Pulisic", "Aubameyang", "Arrizabalaga", "R. James", "Gallagher", "Havertz", "M. Mount", "A. Broja"}
		};
		String[][][] dJugadores = {
				{{"1", "Portero", "No", "Titular"},{"2", "Defensa", "No", "Titular"},{"3", "Defensa", "No", "Titular"},{"4", "Defensa", "No", "Titular"},{"23", "Defensa", "No", "Titular"},{"8", "Volante", "No", "Titular"},{"10", "Volante", "No", "Titular"},{"12", "Volante", "No", "Titular"},{"15", "Volante", "No", "Titular"},{"20", "Delantero", "No", "Titular"},{"9", "Delantero", "Sí", "Titular"},{"13", "Portero", "No", "Suplente"},{"22", "Defensa", "No", "Suplente"},{"18", "Volante", "No", "Suplente"},{"21", "Delantero", "No", "Suplente"},{"11", "Delantero", "No", "Suplente"},{"17", "Delantero", "No", "Suplente"}},
				{{"1", "Portero", "No", "Titular"},{"5", "Defensa", "No", "Titular"},{"4", "Defensa", "No", "Titular"},{"66", "Defensa", "No", "Titular"},{"26", "Defensa", "No", "Titular"},{"3", "Volante", "No", "Titular"},{"14", "Volante", "Sí", "Titular"},{"6", "Volante", "No", "Titular"},{"23", "Delantero", "No", "Titular"},{"11", "Delantero", "No", "Titular"},{"9", "Delantero", "No", "Titular"},{"62", "Portero", "No", "Suplente"},{"32", "Defensa", "No", "Suplente"},{"2", "Defensa", "No", "Suplente"},{"7", "Volante", "No", "Suplente"},{"20", "Delantero", "No", "Suplente"},{"27", "Delantero", "No", "Suplente"}},
				{{"31", "Portero", "No", "Titular"},{"3", "Defensa", "No", "Titular"},{"5", "Defensa", "No", "Titular"},{"7", "Defensa", "No", "Titular"},{"21", "Defensa", "No", "Titular"},{"8", "Volante", "No", "Titular"},{"17", "Volante", "Sí", "Titular"},{"20", "Volante", "No", "Titular"},{"47", "Delantero", "No", "Titular"},{"9", "Delantero", "No", "Titular"},{"26", "Delantero", "No", "Titular"},{"18", "Portero", "No", "Suplente"},{"25", "Defensa", "No", "Suplente"},{"14", "Defensa", "No", "Suplente"},{"16", "Volante", "No", "Suplente"},{"10", "Delantero", "No", "Suplente"},{"19", "Delantero", "No", "Suplente"}},
				{{"1", "Portero", "Sí", "Titular"},{"21", "Defensa", "No", "Titular"},{"19", "Defensa", "No", "Titular"},{"4", "Defensa", "No", "Titular"},{"5", "Defensa", "No", "Titular"},{"6", "Volante", "No", "Titular"},{"8", "Volante", "No", "Titular"},{"42", "Volante", "No", "Titular"},{"10", "Delantero", "No", "Titular"},{"17", "Delantero", "No", "Titular"},{"11", "Delantero", "No", "Titular"},{"26", "Portero", "No", "Suplente"},{"2", "Defensa", "No", "Suplente"},{"40", "Defensa", "No", "Suplente"},{"18", "Volante", "No", "Suplente"},{"25", "Delantero", "No", "Suplente"},{"7", "Delantero", "No", "Suplente"}},
				{{"99", "Portero", "No", "Titular"},{"5", "Defensa", "Sí", "Titular"},{"4", "Defensa", "No", "Titular"},{"2", "Defensa", "No", "Titular"},{"25", "Defensa", "No", "Titular"},{"6", "Volante", "No", "Titular"},{"8", "Volante", "No", "Titular"},{"28", "Volante", "No", "Titular"},{"10", "Delantero", "No", "Titular"},{"30", "Delantero", "No", "Titular"},{"7", "Delantero", "No", "Titular"},{"1", "Portero", "No", "Suplente"},{"14", "Defensa", "No", "Suplente"},{"3", "Defensa", "No", "Suplente"},{"17", "Volante", "No", "Suplente"},{"18", "Volante", "No", "Suplente"},{"44", "Delantero", "No", "Suplente"}},
				{{"16", "Portero", "Sí", "Titular"},{"33", "Defensa", "No", "Titular"},{"26", "Defensa", "No", "Titular"},{"14", "Defensa", "No", "Titular"},{"32", "Defensa", "No", "Titular"},{"5", "Volante", "No", "Titular"},{"7", "Volante", "No", "Titular"},{"8", "Volante", "No", "Titular"},{"17", "Delantero", "No", "Titular"},{"10", "Delantero", "No", "Titular"},{"9", "Delantero", "No", "Titular"},{"1", "Portero", "No", "Suplente"},{"24", "Defensa", "No", "Suplente"},{"23", "Volante", "No", "Suplente"},{"29", "Volante", "No", "Suplente"},{"19", "Volante", "No", "Suplente"},{"18", "Delantero", "No", "Suplente"}}
		};//Number, position, captain, state.
		int gJugadores[][][]= new int[6][17][4];
		for (int i=0; i<6; i++) {
			for (int j=0; j<17; j++) {
				for (int h=0; h<4; h++) {
					gJugadores[i][j][h]=0;
				}
			}
		}
		String[] resultadosJornada = {"No ha comenzado el campeonato\n","Jornada 1\n","Jornada 2\n","Jornada 3\n","Jornada 4\n","Jornada 6\n"};
		String opcion, equipoElegido="1", cadena;
		int[] partidosGanados = {0,0,0,0,0,0};
		int[] partidosJugados = {0,0,0,0,0,0};
		int[] partidosPerdidos = {0,0,0,0,0,0};
		int[] partidosEmpatados = {0,0,0,0,0,0};
		int[] golesFavor = {0,0,0,0,0,0};
		int[] golesContra = {0,0,0,0,0,0};
		int val = 0, sustituciones=0, numJornada=0;
		boolean jugando=false, salir=false;
		do{
			opcion = JOptionPane.showInputDialog("Elija una opción:\n1. Administrar equipo\n2. Tabla de posiciones\n3. Resultado jornada\n4. Tabla de goleadores\n5. Iniciar juego\n6. Ingresar resultado\n7. Simular campeonato\n8. Salir");
			switch(opcion){
			case "1":
				cadena = "Elija el equipo a administrar:\n";
				for(int i=0; i<6; i++) {
					cadena += (i+1) + ". " + equipo[i] + "\n" ;
				}
				do{
					equipoElegido=JOptionPane.showInputDialog(cadena);
					if(equipoElegido.equalsIgnoreCase("1")||equipoElegido.equalsIgnoreCase("2")||equipoElegido.equalsIgnoreCase("3")||equipoElegido.equalsIgnoreCase("4")||equipoElegido.equalsIgnoreCase("5")||equipoElegido.equalsIgnoreCase("6")) {
						val=1;
					}else {
						JOptionPane.showMessageDialog(null, "Opción no válida.");
						val=0;
					}
				}while(val==0);
				admin(equipo,jugadores,dJugadores,equipoElegido,jugando,sustituciones);
				break;
			case "2":
				tablaPos(partidosJugados,partidosGanados,partidosEmpatados,partidosPerdidos,golesFavor,golesContra,equipo);
				break;
			case "3":
				jornada(numJornada,resultadosJornada);
				break;
			case "4":
				goleadores(gJugadores,equipo,jugadores);
				break;
			case "5":
				if(numJornada==0) {
					numJornada=1;
				}
				iniciarJuego(equipo, resultadosJornada, partidosJugados, numJornada, partidos, arbitros, jugadores, dJugadores, gJugadores, partidosGanados, partidosEmpatados, partidosPerdidos, golesFavor, golesContra);
				cPartidos++;
				if(cPartidos==3) {
					jornada(numJornada,resultadosJornada);
					for (int i=0; i<3; i++) {
						arbitros[i][1]="Disponible";
					}
					numJornada++;
					cPartidos=0;
				}
				if(numJornada==6) {
					int indiceMayor=0;
					int mayor = -1;
					int puntos[] = {0,0,0,0,0,0};
					for (int i=0;i<6;i++) {
						puntos[i]=(partidosGanados[i]*3)+partidosEmpatados[i];
					}
					for (int x = 0; x < puntos.length; x++) {
						if (puntos[x] > mayor) {
							mayor = puntos[x];
							indiceMayor=x;
						}else {
							if(puntos[x]==mayor) {
								if(partidosGanados[x]>partidosGanados[indiceMayor]) {
									mayor = puntos[x];
									indiceMayor=x;
								}else {
									if(partidosGanados[x]==partidosGanados[indiceMayor]) {
										if(golesFavor[x]>golesFavor[indiceMayor]) {
											mayor = puntos[x];
											indiceMayor=x;
										}
									}
								}
							}
						}
					}
					cadena="¡Campeón "+equipo[indiceMayor]+"!\n";
					JOptionPane.showMessageDialog(null,cadena);
					tablaPos(partidosJugados,partidosGanados,partidosEmpatados,partidosPerdidos,golesFavor,golesContra,equipo);
					goleadores(gJugadores,equipo,jugadores);
					salir=true;
				}
				break;
			case "6":
				if(numJornada==0) {
					numJornada=1;
				}
				ingresarResultado(equipo, numJornada, partidosJugados, arbitros, dJugadores, jugadores, gJugadores, partidosEmpatados, partidosGanados, partidosPerdidos, golesFavor, golesContra, resultadosJornada, partidos);
				cPartidos++;
				if(cPartidos==3) {
					jornada(numJornada,resultadosJornada);
					for (int i=0; i<3; i++) {
						arbitros[i][1]="Disponible";
					}
					numJornada++;
					cPartidos=0;
				}
				if(numJornada==6) {
					int indiceMayor=0;
					int mayor = -1;
					int puntos[] = {0,0,0,0,0,0};
					for (int i=0;i<6;i++) {
						puntos[i]=(partidosGanados[i]*3)+partidosEmpatados[i];
					}
					for (int x = 0; x < puntos.length; x++) {
						if (puntos[x] > mayor) {
							mayor = puntos[x];
							indiceMayor=x;
						}else {
							if(puntos[x]==mayor) {
								if(partidosGanados[x]>partidosGanados[indiceMayor]) {
									mayor = puntos[x];
									indiceMayor=x;
								}else {
									if(partidosGanados[x]==partidosGanados[indiceMayor]) {
										if(golesFavor[x]>golesFavor[indiceMayor]) {
											mayor = puntos[x];
											indiceMayor=x;
										}
									}
								}
							}
						}
					}
					cadena="¡Campeón "+equipo[indiceMayor]+"!\n";
					JOptionPane.showMessageDialog(null,cadena);
					tablaPos(partidosJugados,partidosGanados,partidosEmpatados,partidosPerdidos,golesFavor,golesContra,equipo);
					goleadores(gJugadores,equipo,jugadores);
					salir=true;
				}
				break;
			case "7":
				int equipoGoleador=0;
				equipoGoleador=(int)(Math.random()*6);
				String goleador=jugadores[equipoGoleador][10];
				cadena="¡Campeón "+equipo[(int)(Math.random()*6)]+"!\n";
				cadena+="Goleador del torneo: " + goleador + ", " + equipo[equipoGoleador] + " - " + ((int)(Math.random()*4+10)) + " Goles.";
				JOptionPane.showMessageDialog(null,cadena);
				salir=true;
				break;
			case "8":
				salir=true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				break;
			}
		}while(!salir);
	}
	public static void admin(String equipo[], String jugadores[][], String dJugadores[][][], String equipoElegido, boolean jugando, int sustituciones){
		int numEquipoElegido=Integer.parseInt(equipoElegido)-1;
		int val=0,contadorPortero=0,capitan=0;
		boolean salir=false;
		String opcion, cadena = "", seleccion = "", seleccion1 = "";
		do {
			cadena = "Equipo: " + equipo[numEquipoElegido] + "\n";
			opcion = JOptionPane.showInputDialog("Elija una opción:\n1. Ver jugadores y posiciones\n2. Cambiar posición de un jugador\n3. Ingresar un nuevo jugador\n4. Sustituir jugador\n5. Elegir capitán\n6. Cambiar estado\n7. Salir del " + equipo[numEquipoElegido]);
			switch(opcion){
				case "1":
					for(int i=0; i<17;i++) {
						if(dJugadores[numEquipoElegido][i][2].equals("Sí")) {
							capitan=i;
						}
					}
					cadena += "Capitán: " + jugadores[numEquipoElegido][capitan]+ "\n\nTitulares:\n";
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Titular")){
							if(dJugadores[numEquipoElegido][i][1].equals("Portero")) {
								cadena += (" (" + dJugadores[numEquipoElegido][i][0] + ") " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");	
							}
						}						
					}
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Titular")){
							if(dJugadores[numEquipoElegido][i][1].equals("Defensa")) {
								cadena += (" (" + dJugadores[numEquipoElegido][i][0] + ") " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");	
							}
						}						
					}
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Titular")){
							if(dJugadores[numEquipoElegido][i][1].equals("Volante")) {
								cadena += (" (" + dJugadores[numEquipoElegido][i][0] + ") " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");	
							}
						}						
					}
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Titular")){
							if(dJugadores[numEquipoElegido][i][1].equals("Delantero")) {
								cadena += (" (" + dJugadores[numEquipoElegido][i][0] + ") " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");	
							}
						}						
					}
					cadena += "\nSuplentes:\n";
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Suplente")){
							if(dJugadores[numEquipoElegido][i][1].equals("Portero")) {
								cadena += (" (" + dJugadores[numEquipoElegido][i][0] + ") " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");	
							}
						}						
					}
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Suplente")){
							if(dJugadores[numEquipoElegido][i][1].equals("Defensa")) {
								cadena += (" (" + dJugadores[numEquipoElegido][i][0] + ") " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");	
							}
						}						
					}
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Suplente")){
							if(dJugadores[numEquipoElegido][i][1].equals("Volante")) {
								cadena += (" (" + dJugadores[numEquipoElegido][i][0] + ") " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");	
							}
						}						
					}
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Suplente")){
							if(dJugadores[numEquipoElegido][i][1].equals("Delantero")) {
								cadena += (" (" + dJugadores[numEquipoElegido][i][0] + ") " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");	
							}
						}						
					}
					JOptionPane.showMessageDialog(null, cadena);
					break;
				case "2":
					seleccion="";
					cadena = "Elija el jugador que desea cambiar de posición:\n";	
					for(int i=0;i<17;i++){
						cadena += (i+1) + ". " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n";
					}					
					do {
						seleccion=JOptionPane.showInputDialog(cadena);
						if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")||seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
							val=1;
						}else {
							JOptionPane.showMessageDialog(null, "Opción no válida.");
							val=0;
						}
					}while(val==0);
					cadena = jugadores[numEquipoElegido][Integer.parseInt(seleccion)-1] + " - " + dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1] + "\nseleccione una posicion para asignar al jugador\n1. Portero\n2. Defensa\n3. Volante\n4. Delantero";
					do {
						seleccion1=JOptionPane.showInputDialog(cadena);
						if(seleccion1.equalsIgnoreCase("1")||seleccion1.equalsIgnoreCase("2")||seleccion1.equalsIgnoreCase("3")||seleccion1.equalsIgnoreCase("4")) {
							val=1;
							switch(seleccion1) {
								case "1":
									dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]="Portero";
									break;
								case "2":
									dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]="Defensa";
									break;
								case "3":
									dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]="Volante";
									break;
								case "4":
									dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]="Delantero";
									break;
							}
								contadorPortero=0;
								for(int i=0;i<17;i++) {
									if(dJugadores[numEquipoElegido][i][1].equalsIgnoreCase("Portero") && dJugadores[numEquipoElegido][i][3].equalsIgnoreCase("Titular")) {
										contadorPortero++;
									}
								}
								if(contadorPortero!=1) {
									JOptionPane.showMessageDialog(null, "Debe haber un portero en el equipo titular");
									val=0;
								}
						}else {
							JOptionPane.showMessageDialog(null, "Opción no válida.");
							val=0;
						}
					}while(val==0);
					cadena = "Cambios:\n" + jugadores[numEquipoElegido][Integer.parseInt(seleccion)-1] + " - " + dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1];
					JOptionPane.showMessageDialog(null, cadena);
					break;
				case "3":
					String nuevoNombre, nuevoNumero;
					cadena += "Elija el jugador que desea reemplazar:\n";
					for(int i=0;i<17;i++){
						cadena += (i+1) + ". " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n";
					}
					do{
						seleccion=JOptionPane.showInputDialog(cadena);
						if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")||seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
							val=1;
						}else {
							JOptionPane.showMessageDialog(null, "Opción no válida.");
							val=0;
						}
					}while(val==0);
					nuevoNombre=JOptionPane.showInputDialog("Ingrese el nombre del nuevo jugador:");
					boolean repetido = false;
					String dorsalesUsadas;
					do {
						repetido=false;
						dorsalesUsadas="Dorsales usadas:\n";
						for(int l=0; l<17; l++) {
							if(l+1!=Integer.parseInt(seleccion)) {
								dorsalesUsadas += " (" + dJugadores[numEquipoElegido][l][0] + ")";
							}
						}
						nuevoNumero=JOptionPane.showInputDialog(dorsalesUsadas + "\nIngrese la dorsal del nuevo jugador:");
						for(int l=0; l<17; l++) {
							if(nuevoNumero.equals(dJugadores[numEquipoElegido][l][0]) && ((l+1)!=Integer.parseInt(seleccion))) {
								repetido=true;
							}
						}
						if((nuevoNumero!= null && nuevoNumero.matches("[0-9]+")) && repetido==false) {
							val=1;
						}else {
							JOptionPane.showMessageDialog(null, "Debe ingresar una dorsal numérica y no usada por algún compañero");
							val=0;
						}
					}while(val==0);
					cadena = "Jugador anterior: " + jugadores[numEquipoElegido][Integer.parseInt(seleccion)-1] + " - " + dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1] + "\nseleccione una posicion para asignar al jugador\n1. Portero\n2. Defensa\n3. Volante\n4. Delantero";
					do {
						seleccion1=JOptionPane.showInputDialog(cadena);
						if(seleccion1.equalsIgnoreCase("1")||seleccion1.equalsIgnoreCase("2")||seleccion1.equalsIgnoreCase("3")||seleccion1.equalsIgnoreCase("4")) {
							val=1;
							switch(seleccion1) {
								case "1":
									dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]="Portero";
									break;
								case "2":
									dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]="Defensa";
									break;
								case "3":
									dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]="Volante";
									break;
								case "4":
									dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]="Delantero";
									break;
							}
							contadorPortero=0;
							for(int i=0;i<17;i++) {
								if(dJugadores[numEquipoElegido][i][1].equalsIgnoreCase("Portero") && dJugadores[numEquipoElegido][i][3].equalsIgnoreCase("Titular")) {
									contadorPortero++;
								}
							}
							if(contadorPortero!=1) {
								JOptionPane.showMessageDialog(null, "Debe haber un portero en el equipo titular");
								val=0;
							}
						}else {
							JOptionPane.showMessageDialog(null, "Opción no válida.");
							val=0;
						}
					}while(val==0);
					jugadores[numEquipoElegido][Integer.parseInt(seleccion)-1]=nuevoNombre;
					dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][0]=nuevoNumero;
					JOptionPane.showMessageDialog(null, "Nuevo jugador:\nNombre: " + jugadores[numEquipoElegido][Integer.parseInt(seleccion)-1] + "\nDorsal: " + dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][0] + "\nPosición: " + dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1]);
					break;
				case "4":
					if(jugando) {
						if(sustituciones<3) {
							int ingresa=0,sale=0;
							boolean portero=false;
							String cambio[]= {"","","","",""};
							cadena = "Elija el jugador que desea sustituir:\nJugando:\n";					
							for(int i=0;i<11;i++){
								cadena += (i+1) + ". " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n";
							}						
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")) {
									if(dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
										portero=true;
									}
									sale=Integer.parseInt(seleccion)-1;
									val=1;
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							cadena = "Elija el jugador que ingresará:\nEn banca:\n";
							for(int i=11;i<17;i++){
								cadena += (i+1) + ". " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n";
							}
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
									if(portero) {
										if(dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
											ingresa=Integer.parseInt(seleccion)-1;
											val=1;
										}else {	
											JOptionPane.showMessageDialog(null, "Debe haber un portero en cancha");
											val=0;
										}
									}else {
										ingresa=Integer.parseInt(seleccion)-1;
										val=1;
									}
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							JOptionPane.showMessageDialog(null, "Cambio efectuado.\nSale: (" + dJugadores[numEquipoElegido][sale][0] + ") " + jugadores[numEquipoElegido][sale] + " - " + dJugadores[numEquipoElegido][sale][1] + "\nEntra: (" + dJugadores[numEquipoElegido][ingresa][0] + ") " + jugadores[numEquipoElegido][ingresa] + " - " + dJugadores[numEquipoElegido][ingresa][1]);
							cambio[0]=jugadores[numEquipoElegido][sale];
							cambio[1]=dJugadores[numEquipoElegido][sale][0];
							cambio[2]=dJugadores[numEquipoElegido][sale][1];
							cambio[3]=dJugadores[numEquipoElegido][sale][2];
							cambio[4]=dJugadores[numEquipoElegido][sale][3];
							jugadores[numEquipoElegido][sale]=jugadores[numEquipoElegido][ingresa];
							dJugadores[numEquipoElegido][sale][0]=dJugadores[numEquipoElegido][ingresa][0];
							dJugadores[numEquipoElegido][sale][1]=dJugadores[numEquipoElegido][ingresa][1];
							dJugadores[numEquipoElegido][sale][2]=dJugadores[numEquipoElegido][ingresa][2];
							dJugadores[numEquipoElegido][sale][3]=dJugadores[numEquipoElegido][ingresa][3];
							jugadores[numEquipoElegido][ingresa]=cambio[0];
							dJugadores[numEquipoElegido][ingresa][0]=cambio[1];
							dJugadores[numEquipoElegido][ingresa][1]=cambio[2];
							dJugadores[numEquipoElegido][ingresa][2]=cambio[3];
							dJugadores[numEquipoElegido][ingresa][3]=cambio[4];
							sustituciones++;
						}else {
							JOptionPane.showMessageDialog(null, "Ya realizó 3 sustituciones");
						}
					}else {
						JOptionPane.showMessageDialog(null, "Debe estar jugando para sustituir jugadores");
					}
					break;
				case "5":
					cadena="Capitán actual: ";
					for(int i=0; i<17;i++) {
						if(dJugadores[numEquipoElegido][i][2].equals("Sí")) {
							capitan=i;
						}
					}
					for(int i=0; i<17; i++) {
						dJugadores[numEquipoElegido][i][2]="No";
					}
					cadena += jugadores[numEquipoElegido][capitan] + "\n";
					for(int i=0;i<17;i++){
						if(dJugadores[numEquipoElegido][i][3].equals("Titular")) {
						cadena += (i+1) + ". " + (jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][1] + "\n");
						}
					}
					do {
						seleccion=JOptionPane.showInputDialog("Elija el nuevo capitán: \n" + cadena);
						if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")||seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
							dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][2]="Sí";
							val=1;
						}else {
							JOptionPane.showMessageDialog(null, "Opción no válida");
							val=0;
						}
					}while(val==0);
					JOptionPane.showMessageDialog(null,"Nuevo capitán: " + jugadores[numEquipoElegido][Integer.parseInt(seleccion)-1]);
					break;
				case "6":
					if(!jugando) {
						boolean portero=false;
						int cambio1=0;
						String cambio1a="";
						cadena = "Elija el primer jugador que desea cambiar de estado\n";	
						for(int i=0;i<17;i++){
							cadena += (i+1) + ". " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][3] + "\n";
						}
						do {
							seleccion=JOptionPane.showInputDialog(cadena);
							if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")||seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
								if(dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][2].equals("Sí")) {
									JOptionPane.showMessageDialog(null,"No puede cambiar de estado al capitán del equipo");
									val=0;
								}else {
									if (dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
										portero=true;
									}else {
										portero=false;
									}
									if(dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3].equals("Titular")) {
										cambio1a="Titular";
										dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3]="Suplente";
									}else {
										dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3]="Titular";
										cambio1a="Suplente";
									}
									val=1;
								}
							}else {
								JOptionPane.showMessageDialog(null, "Opción no válida");
								val=0;
							}
						}while(val==0);
						cambio1=Integer.parseInt(seleccion);
						cadena = "Elija el segundo jugador que desea cambiar de estado\n";	
						for(int i=0;i<17;i++){
							cadena += (i+1) + ". " + jugadores[numEquipoElegido][i] + " - " + dJugadores[numEquipoElegido][i][3] + "\n";
						}
						do {
							seleccion=JOptionPane.showInputDialog(cadena);
							if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")||seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
								if(dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][2].equals("Sí")) {
									JOptionPane.showMessageDialog(null,"No puede cambiar de estado al capitán del equipo");
									val=0;
								}else {
									if(Integer.parseInt(seleccion)==cambio1) {
										JOptionPane.showMessageDialog(null, "Debe elegir otro jugador");
										val=0;
									}else {
										if(cambio1a.equals(dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3])) {
											JOptionPane.showMessageDialog(null, "Debe elegir otro jugador");
											val=0;
										}else {
											if(portero) {
												if (dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
													if(dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3].equals("Titular")) {
														dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3]="Suplente";
													}else {
														dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3]="Titular";
													}
													val=1;
												}else {
													JOptionPane.showMessageDialog(null, "Debe haber un portero titular");
													val=0;
												}
											}else {
												if (dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
													JOptionPane.showMessageDialog(null, "Debe haber un portero titular");
													val=0;
												}else {
													if(dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3].equals("Titular")) {
														dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3]="Suplente";
													}else {
														dJugadores[numEquipoElegido][Integer.parseInt(seleccion)-1][3]="Titular";
													}
													val=1;
												}
											}
										}
									}
								}
							}else {
								JOptionPane.showMessageDialog(null, "Opción no válida");
								val=0;
							}
						}while(val==0);
					}else {
						JOptionPane.showMessageDialog(null, "No puede cambiar el estado de un jugador en el partido");
					}
					break;
				case "7":
					salir=true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción no válida.");
					break;
			}
		}while(!salir);
	}
	public static void tablaPos(int pJ[],int pG[],int pE[],int pP[], int gF[], int gC[], String equipo[]) {
		int puntos[] = {0,0,0,0,0,0};
		String cadena="Tabla de posiciones:\nEquipo - Puntos - PJ - PG - PE - PP - GF - GC\n";
		for (int i=0;i<6;i++) {
			puntos[i]=(pG[i]*3)+pE[i];
		}
		int indiceMayor=0;
		int mayor = -1;
		for (int i=0; i<6; i++) {
			for (int x = 0; x < puntos.length; x++) {
				if (puntos[x] > mayor) {
					mayor = puntos[x];
					indiceMayor=x;
				}else {
					if(puntos[x]==mayor) {
						if(pG[x]>pG[indiceMayor]) {
							mayor = puntos[x];
							indiceMayor=x;
						}else {
							if(pG[x]==pG[indiceMayor]) {
								if(gF[x]>gF[indiceMayor]) {
									mayor = puntos[x];
									indiceMayor=x;
								}
							}
						}
					}
				}
			}
			
			cadena+=equipo[indiceMayor]+" - "+puntos[indiceMayor]+" - "+pJ[indiceMayor]+" - "+pG[indiceMayor]+" - "+pE[indiceMayor]+" - "+pP[indiceMayor]+" - "+gF[indiceMayor]+" - "+gC[indiceMayor]+"\n";
			puntos[indiceMayor]=-1;
			mayor=-1;
		}
		JOptionPane.showMessageDialog(null, cadena);
	}
	public static void jornada(int numJornada, String resultadosJornada[]) {
		JOptionPane.showMessageDialog(null, resultadosJornada[numJornada]);
	}
	public static void goleadores(int gJugadores[][][], String equipo[], String jugadores[][]) {
		String goleadoresOrden[][] = {{" - \n","0"},{" - \n","0"},{" - \n","0"},{" - \n","0"},{" - \n","0"}};
		int totalGoles[][]=new int[6][17];
		String cadena="Tabla de goleadores:\nJugador - Equipo - Total goles - Jugada - Cabeza - Tiro libre - Penal\n";
		for(int i=0; i<6; i++) {
			for(int j=0; j<17; j++) {
				for(int l=0;l<4;l++) {
					totalGoles[i][j]+=gJugadores[i][j][l];
				}
			}
		}
		for(int i=0;i<6;i++) {
			for(int j=0;j<17;j++) {
				for(int l=0; l<5; l++) {
					if(totalGoles[i][j]>Integer.parseInt(goleadoresOrden[l][1])) {
						if(l<4) {
							goleadoresOrden[l+1][1]=goleadoresOrden[l][1];
							goleadoresOrden[l+1][0]=goleadoresOrden[l][0];
						}
						goleadoresOrden[l][1]=String.valueOf(totalGoles[i][j]);
						goleadoresOrden[l][0]=jugadores[i][j]+" - "+equipo[i]+" - "+totalGoles[i][j]+" - "+gJugadores[i][j][0]+" - "+gJugadores[i][j][1]+" - "+gJugadores[i][j][2]+" - "+gJugadores[i][j][3]+"\n";
						l=5;
					}
				}				
			}
		}
		for(int i=0;i<5;i++) {
			cadena+=(i+1)+". "+goleadoresOrden[i][0];
		}
		JOptionPane.showMessageDialog(null, cadena);		
	}
	public static void iniciarJuego(String equipo[], String resultadosJornada[], int pJ[], int numJornada, int partidos[][], String arbitros[][], String jugadores[][], String dJugadores[][][], int gJugadores[][][], int pG[], int pE[], int pP[], int gF[], int gC[]) {
		String cadena = "Elija el primer equipo del partido:\n";
		int val=0;
		String equipo1 = "";
		String equipo2 = "";
		String arbSel = "";
		String tipoGolStr ="";
		int goles1=0,goles2=0;
		for(int i=0; i<6; i++) {
			cadena += (i+1) + ". " + equipo[i] + "\n" ;
		}
		do{
			equipo1 = JOptionPane.showInputDialog(null, cadena);
			if(equipo1.equalsIgnoreCase("1")||equipo1.equalsIgnoreCase("2")||equipo1.equalsIgnoreCase("3")||equipo1.equalsIgnoreCase("4")||equipo1.equalsIgnoreCase("5")||equipo1.equalsIgnoreCase("6")) {
				if((pJ[Integer.parseInt(equipo1)-1]<numJornada)) {
					val=1;
					pJ[Integer.parseInt(equipo1)-1]++;
				}else {
					JOptionPane.showMessageDialog(null, "El equipo seleccionado ya jugó el partido de la jornada");
					val=0;
				}			
			}else {
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				val=0;
			}
		}while(val==0);
		cadena = "Elija el segundo equipo del partido:\n";
		for(int i=0; i<6; i++) {
			cadena += (i+1) + ". " + equipo[i] + "\n" ;
		}
		do{
			equipo2 = JOptionPane.showInputDialog(null, cadena);
			for (int x = 0; x < 5; x++) {
			    if (partidos[Integer.parseInt(equipo1)-1][x] == Integer.parseInt(equipo2)-1) {
			    	JOptionPane.showMessageDialog(null, "Ya se jugó contra este equipo.");
			    	equipo2="20";
			    }
			}
			if((equipo2.equalsIgnoreCase("1")||equipo2.equalsIgnoreCase("2")||equipo2.equalsIgnoreCase("3")||equipo2.equalsIgnoreCase("4")||equipo2.equalsIgnoreCase("5")||equipo2.equalsIgnoreCase("6"))&&(Integer.parseInt(equipo2)!=Integer.parseInt(equipo1))) {
				if((pJ[Integer.parseInt(equipo2)-1]<numJornada)) {
					val=1;
					pJ[Integer.parseInt(equipo2)-1]++;
				}else {
					JOptionPane.showMessageDialog(null, "El equipo seleccionado ya jugó el partido de la jornada");
					val=0;
				}			
			}else {
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				val=0;
			}
		}while(val==0);
		cadena="Elija el árbitro para el partido:\n";
		for(int i=0; i<3; i++) {
			cadena+= (i+1) + ". " + arbitros[i][0] + "\n";
		}
		do{
			arbSel = JOptionPane.showInputDialog(null, cadena);
			if((arbSel.equalsIgnoreCase("1")||arbSel.equalsIgnoreCase("2")||arbSel.equalsIgnoreCase("3"))) {
				if((arbitros[Integer.parseInt(arbSel)-1][1].equals("Disponible"))) {
					val=1;
					arbitros[Integer.parseInt(arbSel)-1][1] = "No disponible";
				}else {
					JOptionPane.showMessageDialog(null, "El árbitro ya estuvo en un partido esta jornada.");
					val=0;
				}
			
			}else {
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				val=0;
			}
		}while(val==0);
		boolean repetirJugador=true,cambioPartido=false;
		int jugadorRandom=0,tipoGol=0;
		int sustituciones1=0,sustituciones2=0;
		String seleccion="";
		for(int minuto=1; minuto<=90; minuto++) {
			if(minuto==46&&sustituciones1<3) {
				cambioPartido=true;
				while(cambioPartido) {
					seleccion=JOptionPane.showInputDialog("Descanso.\n¿Desea realizar algún cambio en el "+equipo[Integer.parseInt(equipo1)-1]+"? (S/N)");
					if(seleccion.equalsIgnoreCase("S")) {
						if(sustituciones1<3) {
							int ingresa=0,sale=0;
							boolean portero=false;
							String cambio[]= {"","","","",""};
							cadena = "Elija el jugador que desea sustituir:\nJugando:\n";					
							for(int i=0;i<11;i++){
								cadena += (i+1) + ". " + jugadores[Integer.parseInt(equipo1)-1][i] + " - " + dJugadores[Integer.parseInt(equipo1)-1][i][1] + "\n";
							}						
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")) {
									if(dJugadores[Integer.parseInt(equipo1)-1][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
										portero=true;
									}
									sale=Integer.parseInt(seleccion)-1;
									val=1;
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							cadena = "Elija el jugador que ingresará:\nEn banca:\n";
							for(int i=11;i<17;i++){
								cadena += (i+1) + ". " + jugadores[Integer.parseInt(equipo1)-1][i] + " - " + dJugadores[Integer.parseInt(equipo1)-1][i][1] + "\n";
							}
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
									if(portero) {
										if(dJugadores[Integer.parseInt(equipo1)-1][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
											ingresa=Integer.parseInt(seleccion)-1;
											val=1;
										}else {	
											JOptionPane.showMessageDialog(null, "Debe haber un portero en cancha");
											val=0;
										}
									}else {
										ingresa=Integer.parseInt(seleccion)-1;
										val=1;
									}
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							JOptionPane.showMessageDialog(null, "Cambio efectuado.\nSale: (" + dJugadores[Integer.parseInt(equipo1)-1][sale][0] + ") " + jugadores[Integer.parseInt(equipo1)-1][sale] + " - " + dJugadores[Integer.parseInt(equipo1)-1][sale][1] + "\nEntra: (" + dJugadores[Integer.parseInt(equipo1)-1][ingresa][0] + ") " + jugadores[Integer.parseInt(equipo1)-1][ingresa] + " - " + dJugadores[Integer.parseInt(equipo1)-1][ingresa][1]);
							cambio[0]=jugadores[Integer.parseInt(equipo1)-1][sale];
							cambio[1]=dJugadores[Integer.parseInt(equipo1)-1][sale][0];
							cambio[2]=dJugadores[Integer.parseInt(equipo1)-1][sale][1];
							cambio[3]=dJugadores[Integer.parseInt(equipo1)-1][sale][2];
							cambio[4]=dJugadores[Integer.parseInt(equipo1)-1][sale][3];
							jugadores[Integer.parseInt(equipo1)-1][sale]=jugadores[Integer.parseInt(equipo1)-1][ingresa];
							dJugadores[Integer.parseInt(equipo1)-1][sale][0]=dJugadores[Integer.parseInt(equipo1)-1][ingresa][0];
							dJugadores[Integer.parseInt(equipo1)-1][sale][1]=dJugadores[Integer.parseInt(equipo1)-1][ingresa][1];
							dJugadores[Integer.parseInt(equipo1)-1][sale][2]=dJugadores[Integer.parseInt(equipo1)-1][ingresa][2];
							dJugadores[Integer.parseInt(equipo1)-1][sale][3]=dJugadores[Integer.parseInt(equipo1)-1][ingresa][3];
							jugadores[Integer.parseInt(equipo1)-1][ingresa]=cambio[0];
							dJugadores[Integer.parseInt(equipo1)-1][ingresa][0]=cambio[1];
							dJugadores[Integer.parseInt(equipo1)-1][ingresa][1]=cambio[2];
							dJugadores[Integer.parseInt(equipo1)-1][ingresa][2]=cambio[3];
							dJugadores[Integer.parseInt(equipo1)-1][ingresa][3]=cambio[4];
							sustituciones1++;
						}else {
							JOptionPane.showMessageDialog(null, "Ya realizó 3 sustituciones");
						}
					}else {
						cambioPartido=false;
					}
				}
			}
			if(minuto==46&&sustituciones2<3) {
				cambioPartido=true;
				while(cambioPartido) {
					seleccion=JOptionPane.showInputDialog("Descanso.\n¿Desea realizar algún cambio en el "+equipo[Integer.parseInt(equipo2)-1]+"? (S/N)");
					if(seleccion.equalsIgnoreCase("S")) {
						if(sustituciones2<3) {
							int ingresa=0,sale=0;
							boolean portero=false;
							String cambio[]= {"","","","",""};
							cadena = "Elija el jugador que desea sustituir:\nJugando:\n";					
							for(int i=0;i<11;i++){
								cadena += (i+1) + ". " + jugadores[Integer.parseInt(equipo2)-1][i] + " - " + dJugadores[Integer.parseInt(equipo2)-1][i][1] + "\n";
							}						
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")) {
									if(dJugadores[Integer.parseInt(equipo2)-1][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
										portero=true;
									}
									sale=Integer.parseInt(seleccion)-1;
									val=1;
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							cadena = "Elija el jugador que ingresará:\nEn banca:\n";
							for(int i=11;i<17;i++){
								cadena += (i+1) + ". " + jugadores[Integer.parseInt(equipo2)-1][i] + " - " + dJugadores[Integer.parseInt(equipo2)-1][i][1] + "\n";
							}
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
									if(portero) {
										if(dJugadores[Integer.parseInt(equipo2)-1][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
											ingresa=Integer.parseInt(seleccion)-1;
											val=1;
										}else {	
											JOptionPane.showMessageDialog(null, "Debe haber un portero en cancha");
											val=0;
										}
									}else {
										ingresa=Integer.parseInt(seleccion)-1;
										val=1;
									}
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							JOptionPane.showMessageDialog(null, "Cambio efectuado.\nSale: (" + dJugadores[Integer.parseInt(equipo2)-1][sale][0] + ") " + jugadores[Integer.parseInt(equipo2)-1][sale] + " - " + dJugadores[Integer.parseInt(equipo2)-1][sale][1] + "\nEntra: (" + dJugadores[Integer.parseInt(equipo2)-1][ingresa][0] + ") " + jugadores[Integer.parseInt(equipo2)-1][ingresa] + " - " + dJugadores[Integer.parseInt(equipo2)-1][ingresa][1]);
							cambio[0]=jugadores[Integer.parseInt(equipo2)-1][sale];
							cambio[1]=dJugadores[Integer.parseInt(equipo2)-1][sale][0];
							cambio[2]=dJugadores[Integer.parseInt(equipo2)-1][sale][1];
							cambio[3]=dJugadores[Integer.parseInt(equipo2)-1][sale][2];
							cambio[4]=dJugadores[Integer.parseInt(equipo2)-1][sale][3];
							jugadores[Integer.parseInt(equipo2)-1][sale]=jugadores[Integer.parseInt(equipo2)-1][ingresa];
							dJugadores[Integer.parseInt(equipo2)-1][sale][0]=dJugadores[Integer.parseInt(equipo2)-1][ingresa][0];
							dJugadores[Integer.parseInt(equipo2)-1][sale][1]=dJugadores[Integer.parseInt(equipo2)-1][ingresa][1];
							dJugadores[Integer.parseInt(equipo2)-1][sale][2]=dJugadores[Integer.parseInt(equipo2)-1][ingresa][2];
							dJugadores[Integer.parseInt(equipo2)-1][sale][3]=dJugadores[Integer.parseInt(equipo2)-1][ingresa][3];
							jugadores[Integer.parseInt(equipo2)-1][ingresa]=cambio[0];
							dJugadores[Integer.parseInt(equipo2)-1][ingresa][0]=cambio[1];
							dJugadores[Integer.parseInt(equipo2)-1][ingresa][1]=cambio[2];
							dJugadores[Integer.parseInt(equipo2)-1][ingresa][2]=cambio[3];
							dJugadores[Integer.parseInt(equipo2)-1][ingresa][3]=cambio[4];
							sustituciones2++;
						}else {
							JOptionPane.showMessageDialog(null, "Ya realizó 3 sustituciones");
						}
					}else {
						cambioPartido=false;
					}
				}
			}
			if(minuto==70&&sustituciones1<3) {
				cambioPartido=true;
				while(cambioPartido) {
					seleccion=JOptionPane.showInputDialog("Minuto 70.\n¿Desea realizar algún cambio en el "+equipo[Integer.parseInt(equipo1)-1]+"? (S/N)");
					if(seleccion.equalsIgnoreCase("S")) {
						if(sustituciones1<3) {
							int ingresa=0,sale=0;
							boolean portero=false;
							String cambio[]= {"","","","",""};
							cadena = "Elija el jugador que desea sustituir:\nJugando:\n";					
							for(int i=0;i<11;i++){
								cadena += (i+1) + ". " + jugadores[Integer.parseInt(equipo1)-1][i] + " - " + dJugadores[Integer.parseInt(equipo1)-1][i][1] + "\n";
							}						
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")) {
									if(dJugadores[Integer.parseInt(equipo1)-1][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
										portero=true;
									}
									sale=Integer.parseInt(seleccion)-1;
									val=1;
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							cadena = "Elija el jugador que ingresará:\nEn banca:\n";
							for(int i=11;i<17;i++){
								cadena += (i+1) + ". " + jugadores[Integer.parseInt(equipo1)-1][i] + " - " + dJugadores[Integer.parseInt(equipo1)-1][i][1] + "\n";
							}
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
									if(portero) {
										if(dJugadores[Integer.parseInt(equipo1)-1][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
											ingresa=Integer.parseInt(seleccion)-1;
											val=1;
										}else {	
											JOptionPane.showMessageDialog(null, "Debe haber un portero en cancha");
											val=0;
										}
									}else {
										ingresa=Integer.parseInt(seleccion)-1;
										val=1;
									}
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							JOptionPane.showMessageDialog(null, "Cambio efectuado.\nSale: (" + dJugadores[Integer.parseInt(equipo1)-1][sale][0] + ") " + jugadores[Integer.parseInt(equipo1)-1][sale] + " - " + dJugadores[Integer.parseInt(equipo1)-1][sale][1] + "\nEntra: (" + dJugadores[Integer.parseInt(equipo1)-1][ingresa][0] + ") " + jugadores[Integer.parseInt(equipo1)-1][ingresa] + " - " + dJugadores[Integer.parseInt(equipo1)-1][ingresa][1]);
							cambio[0]=jugadores[Integer.parseInt(equipo1)-1][sale];
							cambio[1]=dJugadores[Integer.parseInt(equipo1)-1][sale][0];
							cambio[2]=dJugadores[Integer.parseInt(equipo1)-1][sale][1];
							cambio[3]=dJugadores[Integer.parseInt(equipo1)-1][sale][2];
							cambio[4]=dJugadores[Integer.parseInt(equipo1)-1][sale][3];
							jugadores[Integer.parseInt(equipo1)-1][sale]=jugadores[Integer.parseInt(equipo1)-1][ingresa];
							dJugadores[Integer.parseInt(equipo1)-1][sale][0]=dJugadores[Integer.parseInt(equipo1)-1][ingresa][0];
							dJugadores[Integer.parseInt(equipo1)-1][sale][1]=dJugadores[Integer.parseInt(equipo1)-1][ingresa][1];
							dJugadores[Integer.parseInt(equipo1)-1][sale][2]=dJugadores[Integer.parseInt(equipo1)-1][ingresa][2];
							dJugadores[Integer.parseInt(equipo1)-1][sale][3]=dJugadores[Integer.parseInt(equipo1)-1][ingresa][3];
							jugadores[Integer.parseInt(equipo1)-1][ingresa]=cambio[0];
							dJugadores[Integer.parseInt(equipo1)-1][ingresa][0]=cambio[1];
							dJugadores[Integer.parseInt(equipo1)-1][ingresa][1]=cambio[2];
							dJugadores[Integer.parseInt(equipo1)-1][ingresa][2]=cambio[3];
							dJugadores[Integer.parseInt(equipo1)-1][ingresa][3]=cambio[4];
							sustituciones1++;
						}else {
							JOptionPane.showMessageDialog(null, "Ya realizó 3 sustituciones");
						}
					}else {
						cambioPartido=false;
					}
				}
			}
			if(minuto==70&&sustituciones2<3) {
				cambioPartido=true;
				while(cambioPartido) {
					seleccion=JOptionPane.showInputDialog("Minuto 70.\n¿Desea realizar algún cambio en el "+equipo[Integer.parseInt(equipo2)-1]+"? (S/N)");
					if(seleccion.equalsIgnoreCase("S")) {
						if(sustituciones2<3) {
							int ingresa=0,sale=0;
							boolean portero=false;
							String cambio[]= {"","","","",""};
							cadena = "Elija el jugador que desea sustituir:\nJugando:\n";					
							for(int i=0;i<11;i++){
								cadena += (i+1) + ". " + jugadores[Integer.parseInt(equipo2)-1][i] + " - " + dJugadores[Integer.parseInt(equipo2)-1][i][1] + "\n";
							}						
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("1")||seleccion.equalsIgnoreCase("2")||seleccion.equalsIgnoreCase("3")||seleccion.equalsIgnoreCase("4")||seleccion.equalsIgnoreCase("5")||seleccion.equalsIgnoreCase("6")||seleccion.equalsIgnoreCase("7")||seleccion.equalsIgnoreCase("8")||seleccion.equalsIgnoreCase("9")||seleccion.equalsIgnoreCase("10")||seleccion.equalsIgnoreCase("11")) {
									if(dJugadores[Integer.parseInt(equipo2)-1][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
										portero=true;
									}
									sale=Integer.parseInt(seleccion)-1;
									val=1;
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							cadena = "Elija el jugador que ingresará:\nEn banca:\n";
							for(int i=11;i<17;i++){
								cadena += (i+1) + ". " + jugadores[Integer.parseInt(equipo2)-1][i] + " - " + dJugadores[Integer.parseInt(equipo2)-1][i][1] + "\n";
							}
							do {
								seleccion=JOptionPane.showInputDialog(cadena);
								if(seleccion.equalsIgnoreCase("12")||seleccion.equalsIgnoreCase("13")||seleccion.equalsIgnoreCase("14")||seleccion.equalsIgnoreCase("15")||seleccion.equalsIgnoreCase("16")||seleccion.equalsIgnoreCase("17")) {
									if(portero) {
										if(dJugadores[Integer.parseInt(equipo2)-1][Integer.parseInt(seleccion)-1][1].equals("Portero")) {
											ingresa=Integer.parseInt(seleccion)-1;
											val=1;
										}else {	
											JOptionPane.showMessageDialog(null, "Debe haber un portero en cancha");
											val=0;
										}
									}else {
										ingresa=Integer.parseInt(seleccion)-1;
										val=1;
									}
								}else {
									JOptionPane.showMessageDialog(null, "Opción no válida");
									val=0;
								}
							}while(val==0);
							JOptionPane.showMessageDialog(null, "Cambio efectuado.\nSale: (" + dJugadores[Integer.parseInt(equipo2)-1][sale][0] + ") " + jugadores[Integer.parseInt(equipo2)-1][sale] + " - " + dJugadores[Integer.parseInt(equipo2)-1][sale][1] + "\nEntra: (" + dJugadores[Integer.parseInt(equipo2)-1][ingresa][0] + ") " + jugadores[Integer.parseInt(equipo2)-1][ingresa] + " - " + dJugadores[Integer.parseInt(equipo2)-1][ingresa][1]);
							cambio[0]=jugadores[Integer.parseInt(equipo2)-1][sale];
							cambio[1]=dJugadores[Integer.parseInt(equipo2)-1][sale][0];
							cambio[2]=dJugadores[Integer.parseInt(equipo2)-1][sale][1];
							cambio[3]=dJugadores[Integer.parseInt(equipo2)-1][sale][2];
							cambio[4]=dJugadores[Integer.parseInt(equipo2)-1][sale][3];
							jugadores[Integer.parseInt(equipo2)-1][sale]=jugadores[Integer.parseInt(equipo2)-1][ingresa];
							dJugadores[Integer.parseInt(equipo2)-1][sale][0]=dJugadores[Integer.parseInt(equipo2)-1][ingresa][0];
							dJugadores[Integer.parseInt(equipo2)-1][sale][1]=dJugadores[Integer.parseInt(equipo2)-1][ingresa][1];
							dJugadores[Integer.parseInt(equipo2)-1][sale][2]=dJugadores[Integer.parseInt(equipo2)-1][ingresa][2];
							dJugadores[Integer.parseInt(equipo2)-1][sale][3]=dJugadores[Integer.parseInt(equipo2)-1][ingresa][3];
							jugadores[Integer.parseInt(equipo2)-1][ingresa]=cambio[0];
							dJugadores[Integer.parseInt(equipo2)-1][ingresa][0]=cambio[1];
							dJugadores[Integer.parseInt(equipo2)-1][ingresa][1]=cambio[2];
							dJugadores[Integer.parseInt(equipo2)-1][ingresa][2]=cambio[3];
							dJugadores[Integer.parseInt(equipo2)-1][ingresa][3]=cambio[4];
							sustituciones2++;
						}else {
							JOptionPane.showMessageDialog(null, "Ya realizó 3 sustituciones");
						}
					}else {
						cambioPartido=false;
					}
				}
			}			
			repetirJugador=true;
			jugadorRandom=0;
			if(Math.random()>0.98) {
				goles1++;
				if(Math.random()<=0.7) {
					while(repetirJugador) {
						jugadorRandom =(int)(Math.random()*11+1);
						if(dJugadores[Integer.parseInt(equipo1)-1][jugadorRandom][1].equals("Delantero")) {
							repetirJugador = false;
						}
					}
				}else {
					if(Math.random()<=0.9) {
						while(repetirJugador) {
							jugadorRandom =(int)(Math.random()*11+1);
							if(dJugadores[Integer.parseInt(equipo1)-1][jugadorRandom][1].equals("Volante")) {
								repetirJugador = false;
							}
						}
					}else {
						if(Math.random()<=0.98) {
							while(repetirJugador) {
								jugadorRandom =(int)(Math.random()*11+1);
								if(dJugadores[Integer.parseInt(equipo1)-1][jugadorRandom][1].equals("Defensa")) {
									repetirJugador = false;
								}
							}
						}else {
							if(Math.random()<1) {
								while(repetirJugador) {
									jugadorRandom =(int)(Math.random()*11+1);
									if(dJugadores[Integer.parseInt(equipo1)-1][jugadorRandom][1].equals("Portero")) {
										repetirJugador = false;
									}
								}
							}
						}
					}
				}
				tipoGol=(int)(Math.random()*3);
				switch(tipoGol) {
				case 0:
					tipoGolStr="Jugada\n";
					break;
				case 1:
					tipoGolStr="Cabeza\n";
					break;
				case 2:
					tipoGolStr="Tiro Libre\n";
					break;
				case 3:
					tipoGolStr="Penal\n";
					break;
				}
				gJugadores[Integer.parseInt(equipo1)-1][jugadorRandom-1][tipoGol]++;
				JOptionPane.showMessageDialog(null, minuto + "'\nGol de " +jugadores[Integer.parseInt(equipo1)-1][jugadorRandom-1]+", "+ equipo[Integer.parseInt(equipo1)-1] + "\n"+tipoGolStr+equipo[Integer.parseInt(equipo1)-1]+" "+goles1+" - "+goles2+" "+equipo[Integer.parseInt(equipo2)-1]);
			}
			if(Math.random()<0.02) {
				goles2++;
				if(Math.random()<=0.7) {
					while(repetirJugador) {
						jugadorRandom =(int)(Math.random()*11+1);
						if(dJugadores[Integer.parseInt(equipo2)-1][jugadorRandom][1].equals("Delantero")) {
							repetirJugador = false;
						}
					}
				}else {
					if(Math.random()<=0.9) {
						while(repetirJugador) {
							jugadorRandom =(int)(Math.random()*11+1);
							if(dJugadores[Integer.parseInt(equipo2)-1][jugadorRandom][1].equals("Volante")) {
								repetirJugador = false;
							}
						}
					}else {
						if(Math.random()<=0.98) {
							while(repetirJugador) {
								jugadorRandom =(int)(Math.random()*11+1);
								if(dJugadores[Integer.parseInt(equipo2)-1][jugadorRandom][1].equals("Defensa")) {
									repetirJugador = false;
								}
							}
						}else {
							if(Math.random()<1) {
								while(repetirJugador) {
									jugadorRandom =(int)(Math.random()*11+1);
									if(dJugadores[Integer.parseInt(equipo2)-1][jugadorRandom][1].equals("Portero")) {
										repetirJugador = false;
									}
								}
							}
						}
					}
				}
				tipoGol=(int)(Math.random()*3);
				switch(tipoGol) {
				case 0:
					tipoGolStr="Jugada\n";
					break;
				case 1:
					tipoGolStr="Cabeza\n";
					break;
				case 2:
					tipoGolStr="Tiro Libre\n";
					break;
				case 3:
					tipoGolStr="Penal\n";
					break;
				}
				gJugadores[Integer.parseInt(equipo2)-1][jugadorRandom-1][tipoGol]++;
				JOptionPane.showMessageDialog(null, minuto + "'\nGol de " +jugadores[Integer.parseInt(equipo2)-1][jugadorRandom-1]+", "+ equipo[Integer.parseInt(equipo2)-1] + "\n"+tipoGolStr+equipo[Integer.parseInt(equipo1)-1]+" "+goles1+" - "+goles2+" "+equipo[Integer.parseInt(equipo2)-1]);
			}
		}
		gF[Integer.parseInt(equipo1)-1]+=goles1;
		gF[Integer.parseInt(equipo2)-1]+=goles2;
		gC[Integer.parseInt(equipo1)-1]+=goles2;
		gC[Integer.parseInt(equipo2)-1]+=goles1;
		if(goles1>goles2) {
			pG[Integer.parseInt(equipo1)-1]++;
			pP[Integer.parseInt(equipo2)-1]++;
		}else {
			if(goles2>goles1) {
				pG[Integer.parseInt(equipo2)-1]++;
				pP[Integer.parseInt(equipo1)-1]++;
			}else {
				pE[Integer.parseInt(equipo1)-1]++;
				pE[Integer.parseInt(equipo2)-1]++;
			}
		}
		JOptionPane.showMessageDialog(null, "Marcador final:\n\n"+equipo[Integer.parseInt(equipo1)-1]+" "+goles1+" - "+goles2+" "+equipo[Integer.parseInt(equipo2)-1]);
		partidos[Integer.parseInt(equipo1)-1][numJornada-1]=Integer.parseInt(equipo2)-1;
		partidos[Integer.parseInt(equipo2)-1][numJornada-1]=Integer.parseInt(equipo1)-1;
		resultadosJornada[numJornada]+= "\n" + equipo[Integer.parseInt(equipo1)-1] + " " + goles1 + " - " + goles2 + " " + equipo[Integer.parseInt(equipo2)-1] + "\nÁrbitro: " + arbitros[Integer.parseInt(arbSel)-1][0] + "\n";
	}
	public static void ingresarResultado(String equipo[], int numJornada, int pJ[], String arbitros[][], String dJugadores[][][], String jugadores[][], int gJugadores[][][], int pE[], int pG[], int pP[], int gF[], int gC[], String resultadosJornada[], int partidos[][]) {//equipos, árbitro, marcador( jugador, tipo de gol, minuto)
		String cadena = "Elija el primer equipo del partido:\n";
		int val=0;
		String equipo1 = "";
		String equipo2 = "";
		String arbSel = "";
		String goles1 = "";
		String goles2 = "";
		String jGol="";
		String tGol="";
		for(int i=0; i<6; i++) {
			cadena += (i+1) + ". " + equipo[i] + "\n" ;
		}
		do{
			equipo1 = JOptionPane.showInputDialog(null, cadena);
			if(equipo1.equalsIgnoreCase("1")||equipo1.equalsIgnoreCase("2")||equipo1.equalsIgnoreCase("3")||equipo1.equalsIgnoreCase("4")||equipo1.equalsIgnoreCase("5")||equipo1.equalsIgnoreCase("6")) {
				if((pJ[Integer.parseInt(equipo1)-1]<numJornada)) {
					val=1;
					pJ[Integer.parseInt(equipo1)-1]++;
				}else {
					JOptionPane.showMessageDialog(null, "El equipo seleccionado ya jugó el partido de la jornada");
					val=0;
				}			
			}else {
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				val=0;
			}
		}while(val==0);
		cadena = "Elija el segundo equipo del partido:\n";
		for(int i=0; i<6; i++) {
			cadena += (i+1) + ". " + equipo[i] + "\n" ;
		}
		do{
			equipo2 = JOptionPane.showInputDialog(null, cadena);
			for (int x = 0; x < 5; x++) {
			    if (partidos[Integer.parseInt(equipo1)-1][x] == Integer.parseInt(equipo2)-1) {
			    	JOptionPane.showMessageDialog(null, "Ya se jugó contra este equipo.");
			    	equipo2="20";
			    }
			}
			if((equipo2.equalsIgnoreCase("1")||equipo2.equalsIgnoreCase("2")||equipo2.equalsIgnoreCase("3")||equipo2.equalsIgnoreCase("4")||equipo2.equalsIgnoreCase("5")||equipo2.equalsIgnoreCase("6"))&&(Integer.parseInt(equipo2)!=Integer.parseInt(equipo1))) {
				if((pJ[Integer.parseInt(equipo2)-1]<numJornada)) {
					val=1;
					pJ[Integer.parseInt(equipo2)-1]++;
				}else {
					JOptionPane.showMessageDialog(null, "El equipo seleccionado ya jugó el partido de la jornada");
					val=0;
				}
			
			}else {
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				val=0;
			}
		}while(val==0);
		cadena="Elija el árbitro para el partido:\n";
		for(int i=0; i<3; i++) {
			cadena+= (i+1) + ". " + arbitros[i][0] + "\n";
		}
		do{
			arbSel = JOptionPane.showInputDialog(null, cadena);
			if((arbSel.equalsIgnoreCase("1")||arbSel.equalsIgnoreCase("2")||arbSel.equalsIgnoreCase("3"))) {
				if((arbitros[Integer.parseInt(arbSel)-1][1].equals("Disponible"))) {
					val=1;
					arbitros[Integer.parseInt(arbSel)-1][1] = "No disponible";
				}else {
					JOptionPane.showMessageDialog(null, "El árbitro ya estuvo en un partido esta jornada.");
					val=0;
				}
			
			}else {
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				val=0;
			}
		}while(val==0);
		cadena="Ingrese los goles del " + equipo[Integer.parseInt(equipo1)-1];
		do{
			goles1 = JOptionPane.showInputDialog(null, cadena);
			if(goles1 != null && goles1.matches("[0-9]+")) {
				val=1;
			}else {
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				val=0;
			}
		}while(val==0);
		for(int j=0; j<Integer.parseInt(goles1); j++) {
			cadena="Ingrese el jugador que anotó el gol #" + (j+1) + "\n";
			for(int i=0;i<17;i++){
				if(dJugadores[Integer.parseInt(equipo1)-1][i][3].equals("Titular")) {
				cadena += (i+1) + ". " + (jugadores[Integer.parseInt(equipo1)-1][i] + " - " + dJugadores[Integer.parseInt(equipo1)-1][i][1] + "\n");
				}
			}
			do {
				jGol=JOptionPane.showInputDialog(cadena);
				if((jGol.equalsIgnoreCase("1")||jGol.equalsIgnoreCase("2")||jGol.equalsIgnoreCase("3")||jGol.equalsIgnoreCase("4")||jGol.equalsIgnoreCase("5")||jGol.equalsIgnoreCase("6")||jGol.equalsIgnoreCase("7")||jGol.equalsIgnoreCase("8")||jGol.equalsIgnoreCase("9")||jGol.equalsIgnoreCase("10")||jGol.equalsIgnoreCase("11")||jGol.equalsIgnoreCase("12")||jGol.equalsIgnoreCase("13")||jGol.equalsIgnoreCase("14")||jGol.equalsIgnoreCase("15")||jGol.equalsIgnoreCase("16")||jGol.equalsIgnoreCase("17"))&&(dJugadores[Integer.parseInt(equipo1)-1][Integer.parseInt(jGol)-1][3].equals("Titular"))) {
					do {
						tGol=JOptionPane.showInputDialog("Ingrese el tipo de gol:\n1. Jugada\n2. Cabeza\n3. Tiro libre\n4. Penal");
						if(tGol.equalsIgnoreCase("1")||tGol.equalsIgnoreCase("2")||tGol.equalsIgnoreCase("3")||tGol.equalsIgnoreCase("4")) {
							gJugadores[Integer.parseInt(equipo1)-1][Integer.parseInt(jGol)-1][Integer.parseInt(tGol)-1]++;
							val=1;
						}else {
							JOptionPane.showMessageDialog(null, "Opción no válida");
							val=0;
						}
					}while(val==0);
					val=1;
				}else {
					JOptionPane.showMessageDialog(null, "Opción no válida");
					val=0;
				}
			}while(val==0);
		}
		cadena="Ingrese los goles del " + equipo[Integer.parseInt(equipo2)-1];
		do{
			goles2 = JOptionPane.showInputDialog(null, cadena);
			if(goles2 != null && goles2.matches("[0-9]+")) {
				val=1;
			}else {
				JOptionPane.showMessageDialog(null, "Opción no válida.");
				val=0;
			}
		}while(val==0);
		for(int j=0; j<Integer.parseInt(goles2); j++) {
			cadena="Ingrese el jugador que anotó el gol #" + (j+1) + "\n";
			for(int i=0;i<17;i++){
				if(dJugadores[Integer.parseInt(equipo2)-1][i][3].equals("Titular")) {
				cadena += (i+1) + ". " + (jugadores[Integer.parseInt(equipo2)-1][i] + " - " + dJugadores[Integer.parseInt(equipo2)-1][i][1] + "\n");
				}
			}
			do {
				jGol=JOptionPane.showInputDialog(cadena);
				if((jGol.equalsIgnoreCase("1")||jGol.equalsIgnoreCase("2")||jGol.equalsIgnoreCase("3")||jGol.equalsIgnoreCase("4")||jGol.equalsIgnoreCase("5")||jGol.equalsIgnoreCase("6")||jGol.equalsIgnoreCase("7")||jGol.equalsIgnoreCase("8")||jGol.equalsIgnoreCase("9")||jGol.equalsIgnoreCase("10")||jGol.equalsIgnoreCase("11")||jGol.equalsIgnoreCase("12")||jGol.equalsIgnoreCase("13")||jGol.equalsIgnoreCase("14")||jGol.equalsIgnoreCase("15")||jGol.equalsIgnoreCase("16")||jGol.equalsIgnoreCase("17"))&&(dJugadores[Integer.parseInt(equipo2)-1][Integer.parseInt(jGol)-1][3].equals("Titular"))) {
					do {
						tGol=JOptionPane.showInputDialog("Ingrese el tipo de gol:\n1. Jugada\n2. Cabeza\n3. Tiro libre\n4. Penal");
						if(tGol.equalsIgnoreCase("1")||tGol.equalsIgnoreCase("2")||tGol.equalsIgnoreCase("3")||tGol.equalsIgnoreCase("4")) {
							gJugadores[Integer.parseInt(equipo2)-1][Integer.parseInt(jGol)-1][Integer.parseInt(tGol)-1]++;
							val=1;
						}else {
							JOptionPane.showMessageDialog(null, "Opción no válida");
							val=0;
						}
					}while(val==0);
					val=1;
				}else {
					JOptionPane.showMessageDialog(null, "Opción no válida");
					val=0;
				}
			}while(val==0);
		}
		gF[Integer.parseInt(equipo1)-1]+=Integer.parseInt(goles1);
		gF[Integer.parseInt(equipo2)-1]+=Integer.parseInt(goles2);
		gC[Integer.parseInt(equipo1)-1]+=Integer.parseInt(goles2);
		gC[Integer.parseInt(equipo2)-1]+=Integer.parseInt(goles1);
		if(Integer.parseInt(goles1)>Integer.parseInt(goles2)) {
			pG[Integer.parseInt(equipo1)-1]++;
			pP[Integer.parseInt(equipo2)-1]++;
		}else {
			if(Integer.parseInt(goles2)>Integer.parseInt(goles1)) {
				pG[Integer.parseInt(equipo2)-1]++;
				pP[Integer.parseInt(equipo1)-1]++;
			}else {
				pE[Integer.parseInt(equipo1)-1]++;
				pE[Integer.parseInt(equipo2)-1]++;
			}
		}
		partidos[Integer.parseInt(equipo1)-1][numJornada-1]=Integer.parseInt(equipo2)-1;
		partidos[Integer.parseInt(equipo2)-1][numJornada-1]=Integer.parseInt(equipo1)-1;
		resultadosJornada[numJornada]+= "\n" + equipo[Integer.parseInt(equipo1)-1] + " " + goles1 + " - " + goles2 + " " + equipo[Integer.parseInt(equipo2)-1] + "\nÁrbitro: " + arbitros[Integer.parseInt(arbSel)-1][0] + "\n";
	}
}