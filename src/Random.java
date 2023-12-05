public class Random {
    public static int between(int min, int max){
       return (int) Math.floor(Math.random() * ((max-min) +1 ) +min );
    };
}
