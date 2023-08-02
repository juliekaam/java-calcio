package javaCalcio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    //Creare infine una classe Main e definire al suo interno un array di nomi e un array
    // con i possibili ruoli per i giocatori.
    public static void main(String[] args) {
     String[] nameOfPlayers={

            "Marco Rossi", "Alessio Bianchi", "Lorenzo Russo", "Simone Ferrara", "Andrea Martini",
            "Luca Rossetti", "Davide Fontana", "Giovanni Ricci", "Filippo Bellini", "Nicolas De Luca",
            "Emanuele Gallo", "Matteo Rossi", "Paolo Marini", "Riccardo Leone", "Tommaso Vitale",
            "Enrico Longo", "Lorenzo Gatti", "Mattia Barbieri", "Pietro Greco", "Luigi Fiore",
            "Dario Lombardi", "Andrea Mariani", "Fabio Serra", "Stefano Ruggiero", "Davide Palumbo",
            "Nicola Lombardi", "Michele Russo", "Alessio D'Amico", "Gianluca Santoro", "Nicolas Lombardi",
            "Fabrizio Marino", "Simone Barone", "Daniele Pellegrini", "Roberto Mariani", "Andrea Rizzi",
            "Matteo Moretti", "Davide Barbieri", "Stefano Bianchi", "Pietro Marchetti", "Nicolas Santoro",
            "Marco Monti", "Giovanni Martino", "Lorenzo Galli", "Alessandro Marchetti", "Luca Coppola",
            "Davide Palmieri", "Giacomo Leone", "Matteo Santoro", "Fabrizio Marino", "Gianluca Fontana",
            "Alessandro De Angelis", "Leonardo Sorrentino", "Davide Farina", "Federico Romano",
            "Simone Rinaldi", "Francesco Esposito", "Luca Vitale", "Domenico Ferrara", "Antonio Martini",
            "Mario Rossetti", "Angelo Coppola", "Carmine Bellini", "Vincenzo Ricci", "Salvatore Greco",
            "Giovanni Marchetti", "Francesco Barbieri", "Raffaele Lombardi", "Federico Bianchi",
            "Emanuele Pellegrini", "Alessio Marino", "Stefano De Rosa", "Lorenzo Santoro",
            "Gianluca De Luca", "Alberto Monti", "Gabriele Martino", "Roberto Galli", "Matteo Ferri",
            "Alessandro Mariani", "Antonio Vitale", "Nicola Romano", "Massimo Palmieri", "Daniele Ferrari",
            "Vincenzo Greco", "Salvatore Moretti", "Davide Santoro", "Riccardo Marini", "Leonardo Fiore",
            "Angelo Ruggiero", "Carmine Sorrentino", "Emanuele Farina", "Francesco Rinaldi",
            "Luigi Esposito", "Domenico Vitale", "Antonio De Angelis", "Mario Barbieri", "Giovanni Marchetti",
            "Francesco Russo", "Raffaele Martini", "Federico Coppola", "Emanuele Bellini", "Alessio Ricci"
    };
     String[] roleOfPlayer={"Goalkeeper", "Defender","Midfielder","Striker"};
     String[] strategy={"defensive", "offensive"};


        ArrayList<Player> players=new ArrayList<>();

        //generare una Squadra formata da 11 giocatori creati in modo randomico:
//prelevare un nome casuale dall’array di nomi
//generare l’età in modo casuale
//prelevare un ruolo casuale dall’array di possibili ruoli
        Random random=new Random();

        for(int i=0; i<11;i++){
    int nameRandom=random.nextInt(nameOfPlayers.length);
    int roleRandom=random.nextInt(roleOfPlayer.length);
int randomAge=random.nextInt(18,38);
    Player player=new Player(nameOfPlayers[nameRandom],randomAge,roleOfPlayer[roleRandom]);

    players.add(player);

}
        System.out.println("Team Composition");
        System.out.print("\n" + players);

        int trainerRole= random.nextInt(1,2);
        int trainerName = random.nextInt(nameOfPlayers.length);
        int randomAgeTrainer=random.nextInt(30,45);



      Trainer trainer=new Trainer(nameOfPlayers[trainerName],randomAgeTrainer,strategy[trainerRole]);

        Team team=new Team(players,trainer);

        System.out.println(team);

    }


}
