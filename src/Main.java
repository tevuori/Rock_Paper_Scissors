import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> options = new ArrayList();
        options.add("Paper");
        options.add("Rock");
        options.add("Scissors");
        Boolean gameovver = false;
        Scanner input = new Scanner(System.in);

        while(gameovver==false){
            System.out.println("Choose from these options:");
            System.out.println("Paper / Rock / Scissors");
            String choosed = input.next();

            Random r = new Random();
            int randomitem = r.nextInt(options.size());
            String randompick = options.get(randomitem);
            if(choosed.contains("Paper") || choosed.contains("Rock") || choosed.contains("Scissors")){
                switch (choosed){
                    case "Paper":
                        if(Objects.equals(randompick, "Rock")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Congratulations! YOU WON!");
                        }
                        if(Objects.equals(randompick, "Scissors")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Game Over! Computer picked Scissors!");
                        }
                        if(Objects.equals(randompick, "Paper")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("DRAW!");
                        }
                        break;
                    case "Rock":
                        if(Objects.equals(randompick, "Scissors")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Congratulations! YOU WON!");
                        }
                        if(Objects.equals(randompick, "Paper")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Game Over! Computer picked Paper!");
                        }
                        if(Objects.equals(randompick, "Rock")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("DRAW!");
                        }
                        break;
                    case "Scissors":
                        if(Objects.equals(randompick, "Rock")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Game Over! Computer picked Rock!");
                        }
                        if(Objects.equals(randompick, "Paper")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Congratulations! YOU WON!");
                        }
                        if(Objects.equals(randompick, "Scissors")){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("DRAW!");
                        }
                        break;
                }
                gameovver = true;
            }else{
                System.out.println("Invalid option, Try again!");
            }
        }
    }
}
