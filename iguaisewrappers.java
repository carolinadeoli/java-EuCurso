public class Main{
  public static void main(String[] args){
  int numeroUsuario = 150;
    Integer numeroUsuarioWrapper = numeroUsuario;
    Integer outroObjeto = numeroUsuario;
    if(numeroUsuarioWrapper ==outroObjeto){
      System.out.println("== - é igual");
    } else{
      System.out.println("== - não é igual");
    }
    if(numeroUsuarioWrapper.equals(outroObjeto)){
      System.out.println("Equals - é igual");
    } else{
      System.out.println("Equals - não é igual");
    }
  }
}