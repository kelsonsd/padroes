public class PlugueEuropeu implements PlugueTresPinos {
		
	public void conectar(TomadaTresPinos tomada) {		
		tomada.fornecerEnergia();
	}
}