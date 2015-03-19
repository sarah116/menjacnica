package menjacnica.valute;

public class Valuta {

	private String imeValute;
	private String skraceniNaziv;
	private int prodajniKurs;
	private int kupovniKurs;
	private int srednjiKurs;

	public String getImeValute() {
		return imeValute;
	}

	public void setImeValute(String imeValute) {
		if (imeValute == null)
			throw new RuntimeException("Ime valute ne sme biti null");
		this.imeValute = imeValute;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null)
			throw new RuntimeException("Skraceno ime valute ne sme biti null");
		this.skraceniNaziv = skraceniNaziv;
	}

	public int getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(int prodajniKurs) {
		if (prodajniKurs == 0)
			throw new RuntimeException("Kurs ne sme biti 0");
		this.prodajniKurs = prodajniKurs;
	}

	public int getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(int kupovniKurs) {
		if (kupovniKurs == 0)
			throw new RuntimeException("Kurs ne sme biti 0");
		this.kupovniKurs = kupovniKurs;
	}

	public int getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(int srednjiKurs) {
		if (srednjiKurs == 0)
			throw new RuntimeException("Kurs ne sme biti 0");
		this.srednjiKurs = srednjiKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((imeValute == null) ? 0 : imeValute.hashCode());
		result = prime * result + kupovniKurs;
		result = prime * result + prodajniKurs;
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		result = prime * result + srednjiKurs;
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
		Valuta other = (Valuta) obj;
		if (imeValute == null) {
			if (other.imeValute != null)
				return false;
		} else if (!imeValute.equals(other.imeValute))
			return false;
		if (kupovniKurs != other.kupovniKurs)
			return false;
		if (prodajniKurs != other.prodajniKurs)
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (srednjiKurs != other.srednjiKurs)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [imeValute=" + imeValute + ", skraceniNaziv="
				+ skraceniNaziv + ", prodajniKurs=" + prodajniKurs
				+ ", kupovniKurs=" + kupovniKurs + ", srednjiKurs="
				+ srednjiKurs + "]";
	}

}