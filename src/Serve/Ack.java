package Serve;

public class Ack {
	/**
	 * Arma el ACK para los Virloc
	 * @param mensaje
	 * @return ACK
	 */
	public static String ackvir(String mensaje) {
		// TODO Auto-generated method stub
		// Armo el constructor para ChecksumVirloc
		Checksum chkvl = new Checksum();
		
		//Armo el constructor para obtener el ID
		ObtieneEquipo id = new ObtieneEquipo();
		String  ackvir = "";
		
		// Armo el mensaje para calcular el checksum.
		ackvir = ">ACK;" + id.ObtieneIDEquipo(mensaje) + ";" + ObtieneEquipo.nromensaje(mensaje) + ";*";
		// Calcula Checksum y se la mando.
		ackvir += chkvl.chkVl(ackvir)+"<"+(char) 0x0D+(char) 0x0A;
		return ackvir;
	}
	/**
	 * Arma el ACK para los Rinho	
	 * @param mensaje
	 * @return ACK
	 */
		public static String ackrinho(String mensaje) {
			// TODO Auto-generated method stub
			// Armo el constructor para ChecksumVirloc
			Checksum chk = new Checksum();
			
			//Armo el constructor para obtener el ID
			ObtieneEquipo id = new ObtieneEquipo();
			
			String  ack = "";
			
			// Armo el mensaje para calcular el checksum.
			ack = ">ACK;" +ObtieneEquipo.nromensaje(mensaje) + ";" + id.ObtieneIDEquipo(mensaje) + ";*";
			// Calcula Checksum y se la mando.
			ack += chk.chkRinho(ack)+"<"+(char) 0x0D+(char) 0x0A;
			return ack;
			
		}

}
