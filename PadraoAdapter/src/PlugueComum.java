public class PlugueComum implements PlugueDoisPinos {	

	public void conectar(TomadaDoisPinos tomada) {
		tomada.fornecerEnergia();
	}	
}