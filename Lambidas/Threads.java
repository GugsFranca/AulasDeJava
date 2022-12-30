package Lambidas;

public class Threads {
    public static void main(String[] args) {
        //Threds funcionam paralelamente, o processador roda as duas aproximadamente em simultâneo, eu usei sleep para
        //uma apresentação

        Runnable trabalho1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println("Trabalho #1");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                    }
                }
            }
        };
        Runnable trabalho2 = Threads::Trabalho;
        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);

        t1.start();
        t2.start();
    }
    static void Trabalho(){
        for (int i = 0; i < 10; i++){
            System.out.println("Trabalho #2");
            try {
                Thread.sleep(100);
            }catch (Exception e){
            }
        }
    }
}
