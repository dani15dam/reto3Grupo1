package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.toedter.calendar.JDateChooser;

import vista.Ida;

public class Fecha {

	private Ida ventanaIda;

	SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");

	public String getFecha(JDateChooser jd) {

		if (jd.getDate() != null) {

			return Formato.format(jd.getDate());

		} else {
			return null;
		}

	}

	public java.util.Date StringADate(String Fecha) {

		SimpleDateFormat formato_del_texto = new SimpleDateFormat("dd-MM-yyyy");

		Date fechaE = null;
		try {
			fechaE = formato_del_texto.parse(Fecha);
			return fechaE;

		} catch (ParseException ex) {
			return null;
		}

	}
}
