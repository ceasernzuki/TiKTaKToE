package Games;

public class Main {
    static ArrayList<Integers>playerPositions = new ArrayList<Integer>();
    static ArrayList<Integers>cpuPositions = new ArrayList<Integer>();

}

    public static void main(String[] args) {
        public static void printGameBoard () {
            for (char[] row : gameBoard) {
                for (char c : row) {
                    System.out.println(c);
                }
                System.out.println();
            }

            char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                    {'-', '+', ' ' - '+', '-'},
                    {' ', '|', ' ', '|', ' '},
                    {'-', '+', ' ' - '+', '-'},
                    {' ', '|', ' ', '|', ' '}};

            printgameBoard(gameBoard);
            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.println("Enter your placement (1-9:");
                int PlayerPos = scan.nextInt();

                System.out.println(pos);

                placepiece(gameBoard, playerPos, "player");

                Random rand = new Random();
                int cpuPos = rand.next(9) + 1;
                placepiece(gameBoard, playerPos, "cpu");

                printGameBoard(gameBoard);
            }
        }
        public static void placePiece ( char gameBoard, int pos, String user){
            if (user.equals("player")) {
                symbol = 'X';
            } else if (user.equals("cpu")) {
                Symbol = '0';
            }
            switch (pos) {
                case 1:
                    gameBoard[0][0] = symbol;
                    break;
                case 2:
                    gameBoard[0][2] = symbol;
                    break;
                case 3:
                    gameBoard[0][4] = symbol;
                    break;
                case 4:
                    gameBoard[2][2] = symbol;
                    break;
                case 5:
                    gameBoard[2][4] = symbol;
                    break;
                case 6:
                    gameBoard[2][4] = symbol;
                    break;
                case 7:
                    gameBoard[4][0] = symbol;
                    break;
                case 8:
                    gameBoard[4][2] = symbol;
                    break;
                case 9:
                    gameBoard[4][4] = symbol;
                    break;
            }
        }
        public static String checkWinner() {
            List topRow = Arrays.asList(1, 2, 3);
            List topRow = Arrays.asList(4, 5, 6);
            List topRow = Arrays.asList(4, 8, 9);
            List topRow = Arrays.asList(1, 4, 7);
            List topRow = Arrays.asList(2, 5, 8);
            List topRow = Arrays.asList(3, 6, 9);
            List topRow = Arrays.asList(1, 5, 9);
            List topRow = Arrays.asList(7, 5, 3);

            List<List> winning= new ArrayList<List>();
            winning.add(topRow);
            winning.add(midRow);
            winning.add(botRow);
            winning.add(lefColumn);
            winning.add(midColumn);
            winning.add(rightColumn);

            for(List l: winning){
                if (playerPositions.containsAll(l)) {
                    return "congratulations you won";
                } else if (cpuPositions.containsAll(l) {
                    return "CPU wins. sorry";
                } else if(playerPositions.size()+ cpuPositions.size() == 9){
                    return "CAT"
                }
            }
            return "";
        }
}
