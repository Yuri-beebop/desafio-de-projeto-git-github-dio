package edu.yuri.segundasemana.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception{

        TvSmart smartTv = new TvSmart();

            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();

                 System.out.println("Volume atual: "+ smartTv.volume);
                 System.out.println("Canal atual: "+ smartTv.canal);

            smartTv.mudarCanal(13);

                 System.out.println("Canal atual: "+ smartTv.canal);
            
            System.out.println("A Tv está ligada ? "+ smartTv.ligada);
            System.out.println("Canal atual: "+ smartTv.canal);
            System.out.println("Volume atual: "+ smartTv.volume);

         smartTv.ligar();
            System.out.println("Novo status: A Tv está ligada ? "+ smartTv.ligada);
    }
}