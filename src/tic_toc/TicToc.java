package tic_toc;

import java.util.*;

public class TicToc {
    static ArrayList<Integer> playerPositions =new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions =new ArrayList<Integer>();


    public static void main(String[] args) {
        char[][] gameBord = {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};
        Scanner scan =new Scanner(System.in);
        while (true){
            System.out.println("enter your placement");
            int playerPosition= scan.nextInt();
            while (playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)){
                System.out.println("Position taken! Enter a correct Position");
                playerPosition = scan.nextInt();
            }

            placePiece(gameBord,playerPosition,"player");

            String result = checkWinner();
            if ( result.length()>0){
                System.out.println(result);
                break;
            }

            Random random= new Random();
            int cpuPosition= random.nextInt(9)+1;
            while (playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)){
                cpuPosition= random.nextInt(9)+1;
            }
            placePiece(gameBord,cpuPosition,"cpu");

            printGameBord(gameBord);

            result = checkWinner();
            if ( result.length()>0){
                System.out.println(result);
                break;
            }

        }


    }
    public  static void printGameBord(char[][] gameBord){
        for (char[] row : gameBord){
            for (char c :row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameBord, int position,String user){

        char symbol=' ';
        if(user.equals("player")){
            symbol='X';
            playerPositions.add(position);
        }else if (user.equals("cpu")){
            symbol='O';
            cpuPositions.add(position);
        }

        switch (position){
            case 1:
                gameBord[0][0]=symbol;
                break;
            case 2:
                gameBord[0][2]=symbol;
                break;
            case 3:
                gameBord[0][4]=symbol;
                break;
            case 4:
                gameBord[2][0]=symbol;
                break;
            case 5:
                gameBord[2][2]=symbol;
                break;
            case 6:
                gameBord[2][4]=symbol;
                break;
            case 7:
                gameBord[4][0]=symbol;
                break;
            case 8:
                gameBord[4][2]=symbol;
                break;

            case 9:
                gameBord[4][4]=symbol;
                break;
            default:
                break;
        }

    }

    public static String checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List middleRow = Arrays.asList(4,5,6);
        List bottomRow = Arrays.asList(7,8,9);
        List leftColon = Arrays.asList(1,4,7);
        List middleColon = Arrays.asList(2,5,8);
        List rightColon = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning =new ArrayList<List>();
        winning.add(topRow);
        winning.add(middleRow);
        winning.add(bottomRow);
        winning.add(leftColon);
        winning.add(middleColon);
        winning.add(rightColon);
        winning.add(cross1);
        winning.add(cross2);

        for (List l :winning){
            if (playerPositions.containsAll(l)){
                return "Congratulation you won! ";
            }else if(cpuPositions.containsAll(l)){
                return "CPU wins! You Lost!  Sorry :( ";
            }else if(playerPositions.size()+cpuPositions.size()==9){
                return " Egalite !";
            }
        }

        return "";
    }
}
