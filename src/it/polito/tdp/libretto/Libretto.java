package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti ;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>() ;
	}
		
	public void add(Voto v) {
		  for(Voto v1 : voti) {
			  if((v.getCorso().compareTo(v1.getCorso())==0)&&(v.getPunti()!=v1.getPunti())) {
				  System.out.println("Corso già presente con voto differente\n");
				  break;
			  }
			  if((v.getCorso().compareTo(v1.getCorso())==0)&&(v.getPunti()==v1.getPunti())){
			  System.out.println("Corso e relativo voto gia salvati\n");
			  break;
		  }
		}  
		voti.add(v);
		
	}
	/**
	 * 
	 * @param punti punteggio da ricerca
	 * @return lista di {@link Voto} aventi quel punteggio(eventualmente vuota)
	 */
public List<Voto> cercaVoti(int punti){
	List<Voto> result = new ArrayList<Voto>();
	for(Voto v : this.voti) {
		if(v.getPunti()==punti) {
			result.add(v);
		}
	}
	return result;
}

public Voto cercaEsame(String nomeEsame) {
	for(Voto v : this.voti) {
		if(v.getCorso().compareTo(nomeEsame)==0) {
			return v;
		}
	}
	return null;
}
public Voto votoGiaPresente(Voto voto) {
	  for(Voto v : voti) {
		  if((v.getCorso().compareTo(voto.getCorso())==0)&&(v.getPunti()!=voto.getPunti())) {
			  System.out.println("Corso già presente con voto differente\n");
			  return null;
		  }
		  if((v.getCorso().compareTo(voto.getCorso())==0)&&(v.getPunti()==voto.getPunti())){
		  System.out.println("Corso e relativo voto gia salvati\n");
		  return v;
	  }
	}  
	  voti.add(voto);
	  System.out.println("Nuovo voto aggiunto\n");
	  return voto;
}
}
