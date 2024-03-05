import java.util.ArrayList;

public class Ballot implements Comparable<Ballot> {
  private ArrayList<String> preferences;

  // constructs a ballot with the given candidate names in order
  public Ballot(String[] names) {
    preferences = new ArrayList<>();
    for (String next : names) {
      preferences.add(next);
    }
  }

  // returns the current first choice for this ballot or "none" if there are
  // no longer any choices for this ballot
  public String getCandidate() {
    if (preferences.isEmpty()) {
      return "none";
    }
    return preferences.get(0);
  }

  // eliminates the given candidate from consideration
  public void eliminate(String name) {
    preferences.remove(name);
  }

  // checks if this ballot has no candidates left
  public boolean isEmpty() {
    return preferences.isEmpty();
  }

  // compares this ballot to another, putting them in order
  // alphabetically by their first choice candidate
  public int compareTo(Ballot other) {
    return getCandidate().compareTo(other.getCandidate());
  }
}
