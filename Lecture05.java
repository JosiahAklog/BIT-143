import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Lecture05 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 05");

        // Self-Check Problems:
        // From Section 11.3:
        // 16. Write the code to declare a Map that associates people’s names with their
        // ages.
     //   Map<String,Integer> map = new HashMap<>();

    //map.put("X",21);

    //map.put("Y",28);

    //map.put("Z",25);

    }


        // Add mappings for your own name and age, as well as those of a few friends or
        // relatives.

        // 18. What keys and values are contained in the following map after this code
        // executes?

        // Map<Integer, String> map = new HashMap<>();
        // map.put(8, "Eight"); Adds the key-value pair (8, "Eight") to the map.
        // map.put(41, "Forty-one");Adds the key-value pair (41, "Forty-one") to the map.
        // map.put(8, "Ocho");Updates the value for the key 8 to "Ocho."
        // map.put(18, "Eighteen");Adds the key-value pair (18, "Eighteen") to the map.
        // map.put(50, "Fifty");Adds the key-value pair (50, "Fifty") to the map.
        // map.put(132, "OneThreeTwo");- Adds the key-value pair (132, "OneThreeTwo") to the map.
        // map.put(28, "Twenty-eight");Adds the key-value pair (28, "Twenty-eight") to the map.
        // map.put(79, "Seventy-nine"); Adds the key-value pair (79, "Seventy-nine") to the map.
        // map.remove(41); Removes the entry with the key 41.
        // map.remove(28);Removes the entry with the key 28.
        // map.remove("Eight");No such key "Eight" exists, so no change occurs.
        // map.put(50, "Forty-one"); Updates the value for the key 50 to "Forty-one."
        // map.put(28, "18");Updates the value for the key 28 to "18."
        // map.remove(18);Removes the entry with the key 18.

        // 19. Write the output produced when the following method is passed each of the
        // following maps:
        //A.{cinq=five, deux=two, quatre=four, trois=three, un=one}
        //B. {board=skate, car=drive, computer=play, program=computer}
        //C.{begin=end, boy=girl, ebert=siskel, last=first, T=H}
        //D. {cotton=rain, shirt=cotton, tree=violin, tree=light}

        // public static void mystery(Map<String, String> map) {
        // Map<String, String> result = new TreeMap<>();
        // for (String key : map.keySet()) {
        // if (key.compareTo(map.get(key)) < 0) {
        // result.put(key, map.get(key));
        // } else {
        // result.put(map.get(key), key);
        // }
        // }
        // System.out.println(result);
        // }
        // {two=deux, five=cinq, one=un, three=trois, four=quatre}
        // {skate=board, drive=car, program=computer, play=computer}
        // {siskel=ebert, girl=boy, H=T, ready=begin, first=last, begin=end}
        // {cotton=shirt, tree=violin, seed=tree, light=tree, rain=cotton}

        // Exercises:
        // 6. Write a method countUnique that accepts a list of integers as a parameter
        // and returns the number of unique integer values in the list.
        // Use a set as auxiliary storage to help you solve this problem. For example,
        // if a list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method
        // should return 5. The empty list contains 0 unique values.
        public class UniqueCounter {
        public static int countUnique(List<Integer> numbers) {
        // Create a HashSet to store unique values
        Set<Integer> uniqueSet = new HashSet<>();
        
        // Iterate through the list and add each element to the set
        for (int num : numbers) {
            uniqueSet.add(num);
        }
        
        // The size of the set represents the number of unique values
        return uniqueSet.size();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        int uniqueCount = countUnique(numbers);
        System.out.println("Number of unique values: " + uniqueCount);
    }


        // 7. Write a method countCommon that accepts two lists of integers as
        // parameters and returns the number of unique integers that occur in both
        // lists.
        // Use one or more sets as storage to help you solve this problem. For example,
        // if one list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the
        // other list contains the values [–5, 15, 2, –1, 7, 15, 36], your method should
        // return 4 because the elements –1, 2, 7, and 15 occur in both lists.
        public class CommonCounter {
    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        // Create sets to store unique values from each list
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        // Calculate the intersection of the two sets
        set1.retainAll(set2);

        // The size of the resulting set represents the number of common values
        return set1.size();
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list2 = Arrays.asList(-5, 15, 2, -1, 7, 15, 36);

        int commonCount = countCommon(list1, list2);
        System.out.println("Number of common values: " + commonCount);
    }
}

        // 8. Write a method maxLength that accepts a set of strings as a parameter and
        // that returns the length of the longest string in the list.
        // If your method is passed an empty set, it should return 0.
        
 

public class StringMaxLength {
    public static int maxLength(Set<String> stringSet) {
        int maxLength = 0;
        for (String str : stringSet) {
            int currentLength = str.length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Set<String> stringSet = Set.of("apple", "banana", "cherry", "date", "fig");
        int longestLength = maxLength(stringSet);
        System.out.println("Length of the longest string: " + longestLength);

        Set<String> emptySet = Set.of();
        int emptyLength = maxLength(emptySet);
        System.out.println("Length of the longest string in an empty set: " + emptyLength);
    }

}

//6. Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer values in the list.
//Use a set as auxiliary storage to help you solve this problem. For example, if a list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.

def countUnique(int_list):
unique_set = set(int_list)

return len(unique_set)


int_list = [3, 7, 3, -1, 2, 3, 7, 2, 15, 15]
result = countUnique(int_list)
print("Number of unique elements:", result)



        }

//7. Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique integers that occur in both lists.
//Use one or more sets as storage to help you solve this problem. For example, if one list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values [–5, 15, 2, –1, 7, 15, 36], your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists.
        
def countCommon(list1, list2):
    # Convert the lists to sets to remove duplicates
    set1 = set(list1)
    set2 = set(list2)

    # Find the intersection of the two sets
    common_elements = set1.intersection(set2)

    # Return the count of common elements
    return len(common_elements)

# Example usage:
list1 = [3, 7, 3, -1, 2, 3, 7, 2, 15, 15]
list2 = [-5, 15, 2, -1, 7, 15, 36]
result = countCommon(list1, list2)
print("Number of common elements:", result)
        }



        // 8.Write a method maxLength that accepts a set of strings as a parameter and that returns the length of the longest string in the list.
        //If your method is passed an empty set, it should return 0.

        def maxLength(string_set):

    if not string_set:
        return 0

    
    max_length = 0

    
    for string in string_set:
        # Calculate the length of each string
        length = len(string)
       
        if length > max_length:
            max_length = length

    return max_length

string_set = {"apple", "banana", "cherry", "date"}
result = maxLength(string_set)
print("The length of the longest string is:", result)

        }
 
        }
        // 10. Write a method removeEvenLength that accepts a set of strings as a
        // parameter and that removes all of the strings of even length from the set.

    

public class StringSetOperations {
    public static void removeEvenLength(Set<String> stringSet) {
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Set<String> stringSet = Set.of("apple", "banana", "cherry", "date", "fig");
        System.out.println("Original set: " + stringSet);

        removeEvenLength(stringSet);

        System.out.println("Set after removing even-length strings: " + stringSet);
    }
}



