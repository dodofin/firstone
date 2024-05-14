public class Usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

    
    
        smartTv.ligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);
    
        smartTv.aumentarVolume();

        System.out.println("Volume atual : " + smartTv.volume);
        
    
        smartTv.diminuirVolume();

        System.out.println("Volume atual : " + smartTv.volume);
        
        smartTv.aumentarCanal();
        
        System.out.println("Canal atual : " + smartTv.canal);
    
        smartTv.selecionarCanal(36);

        System.out.println("Canal Atual " + smartTv.canal);
   
        smartTv.selecionarCanal( 45);
        
        System.out.println("Canal Atual " + smartTv.canal);


   
   
   
   
   
   
   
   
    }



}
