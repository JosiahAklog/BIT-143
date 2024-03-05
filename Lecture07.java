class Lecture07 {
    public static void main(String[] args) {
        System.out.println(

"End result: " + foo(6));
}
public static int foo(int f) {
    System.out.println("Handed " + f);

    if (f < 0)
        return f;

    if (f % 2 == 0)
        return foo(f - 1);
    else
        return foo(f - 2);

}
}
