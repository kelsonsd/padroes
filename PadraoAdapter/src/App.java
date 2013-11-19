public class App {
	
	public static void main(String[] args) {
	
	PlugueEuropeu plugueE = new PlugueEuropeu();
	AdaptadorEuropeuComum adaptadorEC = new AdaptadorEuropeuComum();
	
	PlugueComum plugueC = new PlugueComum();
	AdaptadorComumEuropeu adaptadorCE = new AdaptadorComumEuropeu();
	
	plugueE.conectar(adaptadorEC);
	plugueC.conectar(adaptadorCE);	
	}
}