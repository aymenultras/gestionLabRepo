package tn.edu.esprit.cinfo.jendoubimedaymen.domain;

public class Adresse {

	private int code;
	private String gouvernorat;
	private String ville;
	
	public Adresse() {
		// TODO Auto-generated constructor stub
	}

	public Adresse(int code, String gouvernorat, String ville) {
		super();
		this.code = code;
		this.gouvernorat = gouvernorat;
		this.ville = ville;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result
				+ ((gouvernorat == null) ? 0 : gouvernorat.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (code != other.code)
			return false;
		if (gouvernorat == null) {
			if (other.gouvernorat != null)
				return false;
		} else if (!gouvernorat.equals(other.gouvernorat))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Adresse [code=" + code + ", gouvernorat=" + gouvernorat
				+ ", ville=" + ville + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
