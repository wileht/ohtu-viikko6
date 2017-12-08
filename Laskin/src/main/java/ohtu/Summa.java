package ohtu;

import javax.swing.JTextField;

public class Summa implements Komento {
	private Sovelluslogiikka sovellus;
	private JTextField tuloskentta;
	private JTextField syotekentta;
	
	public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
		this.sovellus = sovellus;
		this.tuloskentta = tuloskentta;
		this.syotekentta = syotekentta;
	}

	@Override
	public void suorita() {
		sovellus.plus(Integer.parseInt(syotekentta.getText()));
		tuloskentta.setText("" + sovellus.tulos());
	}

	@Override
	public void peru() {
		// TODO Auto-generated method stub

	}
}
