package red;

//import java.util.*;
import grafos.*;

public class Robopuerto implements Red.ComponenteRed{
	private String id;
	private final Coordenada coordenada;
	private final Nodo nodo;
	private final double radio;

	public Robopuerto(String id, int x, int y, double radio) {
		this.id = id;
		this.coordenada = new Coordenada(x, y);
		this.nodo = new Nodo(x + x * y, id);// Para tener id único
		this.radio = radio;
	}

	public Nodo getNodo() {
		return nodo;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public double getRadio() {
		return radio;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Robopuerto [id=" + id + ", coordenada=" + coordenada + ", nodo=" + nodo + ", radio=" + radio + "]";
	}
}
