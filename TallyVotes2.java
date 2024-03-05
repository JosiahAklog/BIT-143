import java.util.*;
import java.io.*;

public class TallyVotes2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("What file contains the ballot information? (type quit to end the program)");
            String fileName = keyboard.nextLine();

            if (fileName.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break; // Exit the program
            }

            Scanner input = new Scanner(new File(fileName));
            ArrayList<Ballot> ballots = readFile(input);
            int originalBallotCount = ballots.size();
            int round = 1;

            while (ballots.size() > 0) { // Continue until there are no more valid ballots
                System.out.println("Round #" + round);
                Collections.sort(ballots);
                boolean result = oneRound(ballots, originalBallotCount);
                System.out.println("------------------------------");
                round++;

                if (result) {
                    break; // Exit the current file's processing if a winner is found
                }
            }
        }
    }

    // Read a data file of voter preferences and return a list of resulting ballots.
    public static ArrayList<Ballot> readFile(Scanner input) {
        ArrayList<Ballot> result = new ArrayList<>();

        while (input.hasNextLine()) {
            String text = input.nextLine();

            if (!text.isEmpty()) {
                result.add(new Ballot(text.split("\t")));
            }
        }

        return result;
    }

    // Perform one round of ranked-choice voting.
    public static boolean oneRound(ArrayList<Ballot> ballots, int originalBallotCount) {
        String top = null;
        String bottom = null;
        int topCount = 0;
        int bottomCount = originalBallotCount;
        int index = 0;

        while (index < ballots.size()) {
            String next = ballots.get(index).getCandidate();
            int count = processVotes(next, index, ballots);

            if (count > topCount) {
                topCount = count;
                top = next;
            }
            if (count < bottomCount) {
                bottomCount = count;
                bottom = next;
            }
            index += count;
        }

        if (topCount == bottomCount) {
            System.out.println("Election has no winner");
            return true;
        } else if (topCount > originalBallotCount / 2.0) {
            System.out.println("Winner is " + top);
            return true;
        } else {
            System.out.println("no winner, eliminating " + bottom);
            eliminate(bottom, ballots);
            return false;
        }
    }

    public static int processVotes(String name, int index, ArrayList<Ballot> ballots) {
        int count = 0;
        while (index < ballots.size() && ballots.get(index).getCandidate().equals(name)) {
            index++;
            count++;
        }
        double percent = 100.0 * count / ballots.size();
        System.out.printf("%d votes for %s (%4.1f%%)\n", count, name, percent);
        return count;
    }

    public static void eliminate(String candidate, ArrayList<Ballot> ballots) {
        Iterator<Ballot> iterator = ballots.iterator();
        while (iterator.hasNext()) {
            Ballot b = iterator.next();
            b.eliminate(candidate);

            if (b.isEmpty()) {
                iterator.remove();
            }
        }
    }
}
