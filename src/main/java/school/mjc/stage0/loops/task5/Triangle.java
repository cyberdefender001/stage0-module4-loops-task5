package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
                System.out.println();
            for (int j = i + 1; j < cathetusLength; j++) {
                System.out.print(8);
            }
        }
    }
}
