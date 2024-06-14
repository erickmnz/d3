package app;

import java.util.ArrayList;

public class MusicPlayer {
	private ArrayList<Musica>playlist=new ArrayList<Musica>();

	public MusicPlayer() {
		
	}
	public Musica selecionarMusica(int index) {
		return playlist.get(index);
	}
	public void pausar() {
		
	}
	public void tocar() {
		
	}
	public void adicionarMusica(String arquivo) {
		playlist.add(new Musica(arquivo));
	}
}
